package org.sleepTracker.controller;

import org.sleepTracker.controller.dto.NewSleepInfoDTO;
import org.sleepTracker.controller.dto.SleepInfoDTO;
import org.sleepTracker.service.SleepInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sleepinfo")
public class SleepInfoController {
  private final SleepInfoService sleepInfoService;

  @Autowired
  public SleepInfoController(SleepInfoService sleepInfoService){
    this.sleepInfoService = sleepInfoService;
  }
  @GetMapping("/all")
  public List<SleepInfoDTO> getAllSleepInfo(){return sleepInfoService.getAllSleepInfo();}

  @PostMapping("/add")
  public void addNewSleepInfo(@RequestBody NewSleepInfoDTO newSleepInfo){
    sleepInfoService.addNewSleepInfo(newSleepInfo);
  }
}
