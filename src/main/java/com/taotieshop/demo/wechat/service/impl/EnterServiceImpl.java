package com.taotieshop.demo.wechat.service.impl;

import com.taotieshop.demo.dao.EnterMapper;
import com.taotieshop.demo.entity.Enter;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.utils.ResultUtils;
import com.taotieshop.demo.wechat.service.EnterService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/2715:36
 * 类名: EnterServiceImpl
 */
@Component
public class EnterServiceImpl implements EnterService{
    @Resource
    private EnterMapper enterMapper;
    @Override
    public Result addEnter(Enter enter) {
        int intVal = enterMapper.insert(enter);
        return ResultUtils.success(intVal);
    }
}
