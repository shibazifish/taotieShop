package com.taotieshop.demo.wechat.service;

import com.taotieshop.demo.entity.Activity;
import com.taotieshop.demo.entity.Result;

public interface ActivityService {
    Result addActivity(Activity activity);
    Result getActivity();
    Result queryActivity(int activityId);
}
