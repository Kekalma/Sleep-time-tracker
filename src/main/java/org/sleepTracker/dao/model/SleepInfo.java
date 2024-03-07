package org.sleepTracker.dao.model;

import java.time.LocalDate;
import java.util.Date;

public class SleepInfo {
  protected Date date;
  protected double sleepTime;
  protected Mood mood;
  protected int user_id;

  public SleepInfo(Date date, double sleepTime, Mood mood) {
    this.date = date;
    this.sleepTime = sleepTime;
    this.mood = mood;
    this.user_id = 1;
  }

  public SleepInfo(Date date, double sleepTime, Mood mood, int user_id) {
    this.date = date;
    this.sleepTime = sleepTime;
    this.mood = mood;
    this.user_id = user_id;
  }

  public Date getDate() {
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
