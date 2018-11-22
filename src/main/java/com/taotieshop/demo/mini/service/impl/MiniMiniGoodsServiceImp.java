package com.taotieshop.demo.mini.service.impl;

import com.github.pagehelper.PageHelper;
import com.taotieshop.demo.comm.ExceptionEnum;
import com.taotieshop.demo.comm.TSException;
import com.taotieshop.demo.dao.CategoryMapper;
import com.taotieshop.demo.dao.GoodsMapper;
import com.taotieshop.demo.entity.*;
import com.taotieshop.demo.mini.service.MiniGoodsService;
import com.taotieshop.demo.utils.ResultUtils;
import com.taotieshop.demo.utils.SqlUtil;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 李宇
 * @Date: 2018/11/8 22:37
 * @Description:
 */
@Component
public class MiniMiniGoodsServiceImp implements MiniGoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    @Resource
    private CategoryMapper categoryMapper;
    /**
     * 查询所有商品列表
     * @return
     */
    @Override
    public Result getGoodsList() {
        List<Goods> goodsList = goodsMapper.selectByExample(null);
        return ResultUtils.success(goodsList);
    }

    /**
     * 查询商品总数
     * @return
     */
    @Override
    public Result getGoodsCount() {
        int goodsCount = goodsMapper.countByExample(null);
        return ResultUtils.success(goodsCount);
    }

    /**
     * 任务：
     * 描述：获取分类数据
     * 作者：李宇
     * 时间：2018/11/22 11:53
    */
    @Override
    public Result getCategoryInfo(int id) {
        Map<String,Object> resultMap = new HashMap<>();
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<Category> categoryList = categoryMapper.selectByExample(categoryExample);

        CategoryExample parentCategoryExample = new CategoryExample();
        CategoryExample.Criteria parentCriteria = parentCategoryExample.createCriteria();
        parentCriteria.andIdEqualTo(categoryList.get(0).getId());
        List<Category> parentCategory = categoryMapper.selectByExample(parentCategoryExample);

        CategoryExample brotherCategoryExample = new CategoryExample();
        CategoryExample.Criteria brotherCriteria = brotherCategoryExample.createCriteria();
        brotherCriteria.andParent_idEqualTo(categoryList.get(0).getParent_id());
        List<Category> brotherCategory = categoryMapper.selectByExample(brotherCategoryExample);

        resultMap.put("currentCategory", categoryList.get(0));
        resultMap.put("parentCategory", parentCategory.get(0));
        resultMap.put("brotherCategory",brotherCategory.get(0));
        return ResultUtils.success(resultMap);
    }

    /**
     * 通过id删除商品
     * @param requstMap
     * @return
     */
    public Result deleteGoodsById(Map<String,Object> requstMap) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andIdEqualTo((int)requstMap.getOrDefault("id",0));
        int intVal = goodsMapper.deleteByExample(goodsExample);
        return ResultUtils.success(intVal);
    }

    /**
     * 获取所有分类信息
     * @return
     */
    @Override
    public Result getAllCategory() {
        List<Category> categoryList = categoryMapper.selectByExample(null);
        return ResultUtils.success(categoryList);
    }

    /**
     * 保存商品信息
     * @param goods
     * @return
     */
    @Override
    @Options(useGeneratedKeys = true, keyProperty = "goods_sn", keyColumn = "goods_sn")
    public Result updateGoodsInfo(Goods goods) {
        int reslutVal = 0;
        if(goods.getId() == 0){//新增商品信息
            goods.setGoods_sn("0");
            goods.setBrand_id(0);
            goods.setKeywords(goods.getName());
            goods.setAdd_time(0);
            goods.setIs_delete(false);
            goods.setAttribute_category(0);
            goods.setCounter_price(goods.getRetail_price());
            goods.setExtra_price(goods.getRetail_price());
            goods.setGoods_unit("件");
            goods.setPrimary_pic_url("http");
            reslutVal = goodsMapper.insert(goods);
        }else{//更新商品信息
            goods.setCategory_id("1036000");
            GoodsExample goodsExample = new GoodsExample();
            GoodsExample.Criteria criteria = goodsExample.createCriteria();
            criteria.andIdEqualTo(goods.getId());
            reslutVal = goodsMapper.updateByExampleSelective(goods,goodsExample);
        }
        if (reslutVal>0){
            return ResultUtils.success("保存成功！");
        }else {
            throw new TSException(ExceptionEnum.SAVE_EXCEPTION);
        }

    }
}
