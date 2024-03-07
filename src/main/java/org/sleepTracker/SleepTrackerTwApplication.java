package org.sleepTracker;

import org.sleepTracker.dao.SleepInfoDAO;
import org.sleepTracker.dao.SleepInfoDaoJdbc;
import org.sleepTracker.dao.connector.PSQLConnector;
import org.sleepTracker.logger.LoggerBase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class sleepTrackerTwApplication {
  public static void main(String[] args) {
    SpringApplication.run(sleepTrackerTwApplication.class, args);
    System.out.println(System.getenv("DATABASE_URL"));
  }

  @Bean
  public SleepInfoDAO sleepInfoDAO(){
    return new SleepInfoDaoJdbc();
  }
}