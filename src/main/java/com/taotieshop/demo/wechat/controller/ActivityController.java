package com.taotieshop.demo.wechat.controller;

import com.taotieshop.demo.entity.Activity;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.wechat.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2019/1/314:35
 * 类名: ActivityController
 */
@RestController
@RequestMapping(value = "/wechat/activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    /**
     * 任务：
     * 描述：新增活动信息
     * 作者：李宇
     * 时间：2019/1/3 14:42
    */
    @PostMapping(value = "/add")
    public Result addActivity(@RequestBody Activity activity){
        return activityService.addActivity(activity);
    }
    /**
     * 任务：
     * 描述：查询所有的活动信息
     * 作者：李宇
     * 时间：2019/1/3 14:43
    */
    @GetMapping(value = "/get")
    public Result getActivity(){
        return activityService.getActivity();
    }
    /**
     * 任务：
     * 描述：按照id查询活动信息
     * 作者：李宇
     * 时间：2019/1/3 14:43
    */
    @GetMapping(value = "/query")
    public Result queryActivity(@RequestParam(name = "activityId") int activityId){
        return activityService.queryActivity(activityId);
    }
}
