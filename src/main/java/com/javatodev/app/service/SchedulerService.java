package com.javatodev.app.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SchedulerService {

    @Scheduled(fixedDelay = 1000)
    public void schedulerOnEverySecond() {
        log.info("------------Running every second------------");
    }

    @Scheduled(fixedDelay = 5000, initialDelay = 10000)
    public void schedulerOnEveryFiveMinuteWithInitialDelayTenSeconds() {
        log.info("------------Running every 5 seconds after 10 seconds ------------");
    }

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void scheduledOnEveryTwentySeconds() {
        log.info("------------Running every minute ------------");
    }

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void scheduledDelay() {
        log.info("------------Running every minute------------");
    }

    @Scheduled(cron = "${app.scheduler.payment.process.cron}")
    public void scheduledOnEveryMinute() {
        log.info("------------Running every minute------------");
    }

    @Scheduled(cron = "20 5 1 * * *")
    public void customScheduleWithCron() {
        log.info("------------Running every minute------------");
    }

    @Scheduled(cron = "20 5 1 * * *")
    public void scheduledWithMacro() {
        log.info("------------Running every minute------------");
    }

    @Scheduled(cron = "@hourly")
    public void hourlyScheduledTask() {
        log.info("------------Running every minute------------");
    }

    @Scheduled(cron = "@hourly")
    public void schedulerOnEveryHour() {
        log.info("------------Running every hour------------");
    }

}
