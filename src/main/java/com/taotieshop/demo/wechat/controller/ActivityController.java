package com.taotieshop.demo.wechat.controller;

import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.wechat.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/2715:32
 * 类名: ActivityController
 */
@RestController
@RequestMapping(value = "/wechat/activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;
    @GetMapping(value = "/info")
    public Result getActivityInfo(){
        return activityService.getActivityInfo();
    }
}
