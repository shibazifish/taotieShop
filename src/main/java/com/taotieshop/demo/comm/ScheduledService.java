package com.taotieshop.demo.comm;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2019/1/1517:48
 * 类名: ScheduledService
 */
public class ScheduledService {
    private static String access_token;
    /**
     * 任务：
     * 描述：定时发送打卡提醒信息
     * 作者：李宇
     * 时间：2019/1/15 18:45
    */
    @Scheduled(cron = "0 */5 * * * ?")
    public void scheduledSendClockRemind(){

    }
}
