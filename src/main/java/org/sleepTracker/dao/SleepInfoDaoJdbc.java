package org.sleepTracker.dao;

import org.sleepTracker.dao.connector.Connector;
import org.sleepTracker.dao.model.Mood;
import org.sleepTracker.dao.model.SleepInfo;
import org.sleepTracker.logger.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SleepInfoDaoJdbc implements SleepInfoDAO {
  private Logger logger;
  private Connector connector;

  public SleepInfoDaoJdbc(Logger logger, Connector connector) {
    this.logger = logger;
    this.connector = connector;
  }

  @Override
  public List<SleepInfo> getAllSleepInfo() {
    try {
      Connection conn = connector.getConnection();
      PreparedStatement ps = conn.prepareStatement(
              "SELECT * from sleepTable");
      ResultSet resultSet = ps.executeQuery();
      List<SleepInfo> resultList = new ArrayList<>();
      while (resultSet.next()) {
        resultList.add(new SleepInfo(
                resultSet.getDate("date"),
                resultSet.getDouble("sleep_time"),
                Mood.valueOf(resultSet.getString("mood")),
                resultSet.getInt("user")
        ));
      }
      return resultList;
    } catch (SQLException error) {
      logger.logError(error.getMessage());
      return List.of();
    }
  }

  @Override
  public List<SleepInfo> getAllSleepInfoForUser() {
    return null;
  }

  @Override
  public void creatSleepInfo(SleepInfo sleepInfo) {
    try (
            Connection conn = connector.getConnection()) {
      String addUserSQL = String.format("INSERT into answer " +
              "(answer_id,question_id,user_id,description) VALUES " +
              "(?,?,?)");
      PreparedStatement ps = conn.prepareStatement(addUserSQL);
      ps.setDate(1, sleepInfo.getDate());
      ps.setDouble(2, sleepInfo.getSleepTime());
      ps.setString(3, sleepInfo.getMood().toString());
      ps.setInt(4, sleepInfo.getUser_id());
      ps.executeUpdate();
    } catch (SQLException error) {
      logger.logError(error.getMessage());
    }
  }
}
