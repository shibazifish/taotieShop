package com.taotieshop.demo.baby.dao;

import com.taotieshop.demo.baby.entity.BabyActive;

import java.util.List;

public interface BabyMapper {
    /**
     * 新增宝宝活动记录
     * @param babyActive
     */
    public void doAddBabyActive(BabyActive babyActive);

    /**
     * 查询宝宝活动记录
     * @param openId
     * @return
     */
    public List<BabyActive> queryBabyActive(String openId);
}
