package org.sleepTracker.controller.dto;

import org.sleepTracker.dao.model.Mood;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.Date;

public record NewSleepInfoDTO(Date date, double sleep_time, Mood mood, int user_id) {
}
