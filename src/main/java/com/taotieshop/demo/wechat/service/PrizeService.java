package com.taotieshop.demo.wechat.service;

import com.taotieshop.demo.entity.Result;

public interface PrizeService {
    Result getPrizeInfo();
    Result getPrizeById(int prizeId);
}
