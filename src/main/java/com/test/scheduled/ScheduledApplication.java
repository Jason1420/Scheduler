package com.test.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class ScheduledApplication {

    Logger logger = LoggerFactory.getLogger(ScheduledApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ScheduledApplication.class, args);
    }

    @Scheduled(fixedDelay = 2000L, initialDelay = 2000L)
//    @Scheduled(fixedRate = 2000L)
    public void job() throws InterruptedException {
        logger.info("Job Current Time " +new Date());
        Thread.sleep(1000);
    }

}
