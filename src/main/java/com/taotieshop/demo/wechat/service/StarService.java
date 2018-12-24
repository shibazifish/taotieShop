package com.taotieshop.demo.wechat.service;

import com.taotieshop.demo.entity.Result;

/**
 * @Auther: 李宇
 * @Date: 2018/12/23 12:10
 * @Description:
 */
public interface StarService {
    Result getStarInfo();
    Result queryStarInfo(int id);
}
