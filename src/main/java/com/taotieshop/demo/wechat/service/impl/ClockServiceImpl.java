package com.taotieshop.demo.wechat.service.impl;

import com.taotieshop.demo.dao.ClockMapper;
import com.taotieshop.demo.entity.Clock;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.utils.IFUtil;
import com.taotieshop.demo.utils.ResultUtils;
import com.taotieshop.demo.wechat.service.ClockService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/2715:43
 * 类名: ClockServiceImpl
 */
@Component
public class ClockServiceImpl implements ClockService{
    @Resource
    private ClockMapper clockMapper;
    @Override
    public Result addClockInfo(Clock clock) {
        clock.setCreate_time(IFUtil.CurrentDate());
        int intVal = clockMapper.insert(clock);
        return ResultUtils.success(intVal);
    }
}
