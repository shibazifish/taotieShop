package com.taotieshop.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.taotieshop.demo.dao.GoodsMapper;
import com.taotieshop.demo.entity.Goods;
import com.taotieshop.demo.entity.GoodsExample;
import com.taotieshop.demo.entity.PageEntity;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.service.GoodsService;
import com.taotieshop.demo.utils.ResultUtils;
import com.taotieshop.demo.utils.SqlUtil;
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

    /**
     * 分页查询所有商品列表
     * @param page
     * @param name
     * @return
     */
    @Override
    public Result getGoodsList(Integer page, String name) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        //分页并查询
        if(!"".equals(name)){
            criteria.andNameLike(SqlUtil.allLike(name));
        }
        PageHelper.startPage(page,10);
        List<Goods> goodsList = goodsMapper.selectByExample(goodsExample);
        int conutNum = goodsMapper.countByExample(goodsExample);
        PageEntity<Goods> pageData = new PageEntity<Goods>(page,conutNum);
        pageData.setData(goodsList);
        return ResultUtils.success(pageData);
    }

    /**
     * 通过id查询特定商品
     * @param id
     * @return
     */
    @Override
    public Result getGoodsById(Integer id) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<Goods> goodsList = goodsMapper.selectByExample(goodsExample);
        return ResultUtils.success(goodsList.get(0));
    }

    /**
     * 通过id删除商品
     * @param id
     * @return
     */
    public Result deleteGoodsById(Integer id) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andIdEqualTo(id);
        int intVal = goodsMapper.deleteByExample(goodsExample);
        return ResultUtils.success(intVal);
    }
}
