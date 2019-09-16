package com.taotieshop.demo.baby.service.impl;

import com.taotieshop.demo.baby.dao.BabyMapper;
import com.taotieshop.demo.baby.entity.BabyActive;
import com.taotieshop.demo.baby.service.BabyService;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class BabyServiceImpl implements BabyService {
    @Autowired
    private BabyMapper babyMapper;

    /**
     * 新增宝宝活动记录
     * @param babyActive
     */
    @Override
    public void doAddBabyActive(BabyActive babyActive) {
        Date nowDate = new Date();
        babyActive.setActiveDate(nowDate);
        babyMapper.doAddBabyActive(babyActive);
    }

    /**
     * 查询宝宝活动记录
     * @param openId
     */
    @Override
    public Result queryBabyActive(String openId) {
        List<BabyActive> babyActives = babyMapper.queryBabyActive(openId);
        return ResultUtils.success(babyActives);
    }
}
