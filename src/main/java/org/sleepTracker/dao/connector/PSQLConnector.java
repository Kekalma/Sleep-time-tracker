package org.sleepTracker.dao.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PSQLConnector {
  public class PsqlConnector implements Connector {

    public Connection getConnection(){
      Connection connection = null;

      try{
        String url = System.getenv("DATABASE_URL");
        connection = DriverManager.getConnection(url);
        System.out.println("I'm in!");
        //todo: make a logger;
      } catch (SQLException e) {
        throw new RuntimeException(e);
      }
      return connection;
    }
  }
}
