package com.taotieshop.demo.mini.service;


import com.taotieshop.demo.entity.Goods;
import com.taotieshop.demo.entity.Result;

import java.util.Map;

/**
 * @Auther: 李宇
 * @Date: 2018/11/8 22:33
 * @Description:
 */
public interface MiniGoodsService {
    /**
     * 查询所有商品列表
     * @return
     */
    Result getGoodsList();
    /**
     * 查询商品总数
     * @return
     */
    Result getGoodsCount();
    /**
     * 查询分类信息
     * @return
     */
    Result getCategoryInfo(int id);
    /**
     * 通过id删除商品
     * @param requstMap
     * @return
     */
    Result deleteGoodsById(Map<String,Object> requstMap);
    /**
     * 获取所有分类信息
     * @return
     */
    Result getAllCategory();

    /**
     * 通过商品实体更新商品信息
     * @param goods
     * @return
     */
    Result updateGoodsInfo(Goods goods);
}
