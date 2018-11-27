package com.taotieshop.demo.wechat.service;

import com.taotieshop.demo.entity.Result;

public interface ActivityService {
    Result getActivityInfo();
    Result getActivityById(int activityId);
}
