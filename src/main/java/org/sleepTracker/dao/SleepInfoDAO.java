package org.sleepTracker.dao;

import org.sleepTracker.dao.model.SleepInfo;

import java.util.List;

public interface SleepInfoDAO {
  public List<SleepInfo> getAllSleepInfo();
  public List<SleepInfo> getAllSleepInfoForUser();
  public void creatSleepInfo(SleepInfo sleepInfo);
}
