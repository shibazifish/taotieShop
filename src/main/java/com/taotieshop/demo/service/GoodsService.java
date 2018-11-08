package com.taotieshop.demo.service;

import com.sun.net.httpserver.Authenticator;
import com.taotieshop.demo.entity.Result;
import org.springframework.stereotype.Component;

/**
 * @Auther: 李宇
 * @Date: 2018/11/8 22:33
 * @Description:
 */
public interface GoodsService {
    Result getGoodsList(Integer page,Integer size);
}
