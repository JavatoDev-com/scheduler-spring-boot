package com.javatodev.app.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SchedulerService {

    @Scheduled(fixedDelay = 1000)
    public void schedulerOnEveryMinute() {
        log.info("------------Running every second------------");
    }

    @Scheduled(fixedDelay = 5000, initialDelay = 10000)
    public void schedulerOnEveryFiveMinuteWithInitialDelayTenSeconds() {
        log.info("------------Running every 5 seconds------------");
    }

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void scheduledOnEveryMinute() {
        log.info("------------Running every minute------------");
    }

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void scheduledDelay() {
        log.info("------------Running every minute------------");
    }

    @Scheduled(cron = "0/6 * * * * ?")
    public void schedulerOnEverySixSeconds() {
        log.info("------------Running every 6 seconds------------");
    }

    @Scheduled(cron = "@hourly")
    public void schedulerOnEveryHour() {
        log.info("------------Running every hour------------");
    }

}
