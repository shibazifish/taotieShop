package com.taotieshop.demo.wechat.service.impl;

import com.taotieshop.demo.dao.PrizeMapper;
import com.taotieshop.demo.entity.*;
import com.taotieshop.demo.utils.ResultUtils;
import com.taotieshop.demo.wechat.service.PrizeService;
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
public class PrizeServiceImpl implements PrizeService {

    @Resource
    private PrizeMapper prizeMapper;
    /**
     * 任务：
     * 描述：获取所有奖品信息
     * 作者：李宇
     * 时间：2018/12/1 16:55
    */
    @Override
    public Result getPrizeInfo() {
        List<Prize> activityList = prizeMapper.selectByExample(null);
        return ResultUtils.success(activityList);
    }

    /**
     * 任务：
     * 描述：根据id查询奖品信息
     * 作者：李宇
     * 时间：2018/12/1 16:55
    */
    @Override
    public Result getPrizeById(int activityId) {
        PrizeExample prizeExample = new PrizeExample();
        PrizeExample.Criteria criteria = prizeExample.createCriteria();
        criteria.andGoods_idEqualTo(activityId);
        List<Prize> prizes = prizeMapper.selectByExampleWithBLOBs(prizeExample);
        return ResultUtils.success(prizes.get(0));
    }
}
