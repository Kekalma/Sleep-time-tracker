package org.sleepTracker.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerBase implements Logger{


  private static String createLogEntry(String message, String type) {
    String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    return String.format("[%s] %s: %s", timestamp, type, message);
  }

  private void logMessage(String message, String type) {
    String entry = createLogEntry(message, type);
    System.out.println(entry);
  }

  @Override
  public void logInfo(String message) {
    logMessage(message,"INFO");
  }

  @Override
  public void logError(String message) {
    logMessage(message,"ERROR");
  }
}