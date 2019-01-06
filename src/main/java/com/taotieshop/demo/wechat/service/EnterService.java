package com.taotieshop.demo.wechat.service;

import com.taotieshop.demo.entity.Enter;
import com.taotieshop.demo.entity.Result;

/**
 * @Auther: 李宇
 * @Date: 2019/1/5 12:04
 * @Description:
 */
public interface EnterService {
    Result addEnter(Enter enter);
    Result getEnterList(int activityId);
    Result queryEnterInfo(int enterId);
    Result doAudit(Enter enter);
}
