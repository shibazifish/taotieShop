package com.taotieshop.demo.mini.service;

import com.taotieshop.demo.entity.Result;

import java.util.Map;

/**
 * @Auther: 李宇
 * @Date: 2018/11/22 22:25
 * @Description:
 */
public interface MiniCategoryService {
    /**
     * 通过id获取分类栏目数据
     * @param id
     * @return
     */
    Result getCategoryById(Map<String,Object> requestMap);
}
