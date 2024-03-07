package org.sleepTracker.controller.dto;

import org.sleepTracker.dao.model.Mood;

import java.util.Date;

public record SleepInfoDTO(Date date, double sleep_time, Mood mood) {
}
