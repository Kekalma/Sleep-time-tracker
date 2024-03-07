package org.sleepTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class sleepTrackerTwApplication {
  public static void main(String[] args) {
    SpringApplication.run(sleepTrackerTwApplication.class, args);
    System.out.println(System.getenv("DATABASE_URL"));
  }
}