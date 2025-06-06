package com.agent.link_data.utils;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronJobUtils {

    @Scheduled(cron = "0 */1 * * * *")
    public void runJob() {
        System.out.println("Job is running at 1AM daily");
        // Logic here
    }
}
