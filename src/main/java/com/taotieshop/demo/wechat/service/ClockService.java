package com.taotieshop.demo.wechat.service;

import com.taotieshop.demo.entity.Clock;
import com.taotieshop.demo.entity.Result;

import java.util.Map;

public interface ClockService {
    Result addClockInfo(Map<String,String> requestMap);
}
