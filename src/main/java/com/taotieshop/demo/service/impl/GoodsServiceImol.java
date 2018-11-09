package com.taotieshop.demo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.taotieshop.demo.dao.GoodsMapper;
import com.taotieshop.demo.entity.Goods;
import com.taotieshop.demo.entity.GoodsExample;
import com.taotieshop.demo.entity.PageEntity;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.service.GoodsService;
import com.taotieshop.demo.utils.ResultUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 李宇
 * @Date: 2018/11/8 22:37
 * @Description:
 */
@Component
public class GoodsServiceImol implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public Result getGoodsList(Integer page, Integer size) {
        //分页并查询
        PageHelper.startPage(page,size);
        Page<Goods> goodsList = goodsMapper.findAllByPage();
        PageEntity<Goods> pageData = new PageEntity<Goods>(page,size,239);
        pageData.setData(goodsList);
        return ResultUtils.success(pageData);
    }
}
