package com.taotieshop.demo.service;


import com.taotieshop.demo.entity.Result;

/**
 * @Auther: 李宇
 * @Date: 2018/11/8 22:33
 * @Description:
 */
public interface GoodsService {
    Result getGoodsList(Integer page, String name);
    Result getGoodsById(Integer id);
    Result deleteGoodsById(Integer id);
}
