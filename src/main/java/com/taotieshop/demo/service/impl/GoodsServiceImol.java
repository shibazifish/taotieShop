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
    public Result getGoodsList(Integer page, String name) {
        //分页并查询
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        if(!"".equals(name)){
            criteria.andNameLike(name);
        }
        PageHelper.startPage(page,10);
        Page<Goods> goodsList = goodsMapper.selectByExample(goodsExample);
        int conutNum = goodsMapper.countByExample(goodsExample);
        PageEntity<Goods> pageData = new PageEntity<Goods>(page,conutNum);
        pageData.setData(goodsList);
        return ResultUtils.success(pageData);
    }
}
