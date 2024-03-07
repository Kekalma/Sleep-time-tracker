package org.sleepTracker.dao.model;

import java.time.LocalDate;

public class SleepInfo {
  protected LocalDate date;
  protected double sleepTime;
  protected Mood mood;
  protected int user_id;

  public SleepInfo(LocalDate date, double sleepTime, Mood mood) {
    this.date = date;
    this.sleepTime = sleepTime;
    this.mood = mood;
    this.user_id = 1;
  }

  public LocalDate getDate() {
    return date;
  }

  public double getSleepTime() {
    return sleepTime;
  }

  public Mood getMood() {
    return mood;
  }

  public int getUser_id() {
    return user_id;
  }
}
