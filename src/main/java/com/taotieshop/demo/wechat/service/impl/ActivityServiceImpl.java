package com.taotieshop.demo.wechat.service.impl;

import com.taotieshop.demo.dao.ActivityMapper;
import com.taotieshop.demo.entity.Activity;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.utils.ResultUtils;
import com.taotieshop.demo.wechat.service.ActivityService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/2715:29
 * 类名: ActivityServiceImpl
 */
@Component
public class ActivityServiceImpl implements ActivityService{

    @Resource
    private ActivityMapper activityMapper;
    @Override
    public Result getActivityInfo() {
        List<Activity> activityList = activityMapper.selectByExample(null);
        return ResultUtils.success(activityList);
    }
}
