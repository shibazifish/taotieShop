package com.taotieshop.demo.wechat.service;

import com.taotieshop.demo.entity.Clock;
import com.taotieshop.demo.entity.Result;

import java.util.Map;

public interface ClockService {
    Result addClockInfo(Map<String,String> requestMap);

    /**
     * 获取用户打卡信息
     * @param open_id
     * @return
     */
    Result getClockInfo(String open_id);
}
