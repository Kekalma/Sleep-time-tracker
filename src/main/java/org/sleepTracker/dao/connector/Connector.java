package org.sleepTracker.dao.connector;

import java.sql.Connection;

public interface Connector {

  public Connection getConnection();
}