package com.taotieshop.demo.baby.service;

import com.taotieshop.demo.baby.entity.BabyActive;
import com.taotieshop.demo.entity.Result;

import java.util.List;

public interface BabyService {
    /**
     * 新增宝宝活动
     */
    public void doAddBabyActive(BabyActive babyActive);

    /**
     * 查询宝宝活动记录
     * @param openId
     */
    public Result queryBabyActive(String openId);
}
