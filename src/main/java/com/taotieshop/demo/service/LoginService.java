package com.taotieshop.demo.service;

import com.taotieshop.demo.entity.Result;

import java.util.Map;

/**
 * @Auther: 李宇
 * @Date: 2018/11/12 22:28
 * @Description:
 */
public interface LoginService {
    Result login(Map<String,Object> requstMap);
}
