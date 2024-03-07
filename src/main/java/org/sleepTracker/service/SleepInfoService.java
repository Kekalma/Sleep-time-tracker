package org.sleepTracker.service;

import org.sleepTracker.controller.dto.NewSleepInfoDTO;
import org.sleepTracker.controller.dto.SleepInfoDTO;
import org.sleepTracker.dao.SleepInfoDAO;
import org.sleepTracker.dao.model.SleepInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SleepInfoService {
  private SleepInfoDAO sleepInfoDAO;

  public SleepInfoService(SleepInfoDAO sleepInfoDAO) {
    this.sleepInfoDAO = sleepInfoDAO;
  }

  public List<SleepInfoDTO> getAllSleepInfo(){
    List<SleepInfo> allSleepInfo = sleepInfoDAO.getAllSleepInfo();
    List<SleepInfoDTO> sleepInfoDTOS = new ArrayList<>();
    for(SleepInfo sleepInfo : allSleepInfo){
      sleepInfoDTOS.add(
              new SleepInfoDTO(sleepInfo.getDate(), sleepInfo.getSleepTime(),sleepInfo.getMood())
      );
    }
    return sleepInfoDTOS;
  }
  public void addNewSleepInfo(NewSleepInfoDTO newSleepInfoDTO){
    sleepInfoDAO.creatSleepInfo(new SleepInfo(newSleepInfoDTO.date(), newSleepInfoDTO.sleep_time(), newSleepInfoDTO.mood(), 1));

  }
}
