package com.taotieshop.demo.mini.service;


import com.taotieshop.demo.entity.Goods;
import com.taotieshop.demo.entity.GoodsExample;
import com.taotieshop.demo.entity.Result;

import java.util.Map;

/**
 * @Auther: 李宇
 * @Date: 2018/11/8 22:33
 * @Description:
 */
public interface MiniGoodsService {
    /**
     * 分页查询所有商品列表
     * @param page
     * @param name
     * @return
     */
    Result getGoodsList(Integer page, String name);
    /**
     * 通过id查询具体商品信息
     * @param id
     * @return
     */
    Result getGoodsById(Integer id);
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
