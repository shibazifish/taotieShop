package com.taotieshop.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.taotieshop.demo.dao.*;
import com.taotieshop.demo.entity.*;
import com.taotieshop.demo.service.IndexService;
import com.taotieshop.utils.ResultUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 李宇
 * @Date: 2018/11/21 23:17
 * @Description:
 */
@Component
public class IndexServiceImpl implements IndexService {
    @Resource
    private GoodsMapper goodsMapper;
    @Resource
    private BrandMapper brandMapper;
    @Resource
    private TopicMapper topicMapper;
    @Resource
    private CategoryMapper categoryMapper;
    @Resource
    private ChannelMapper channelMapper;
    @Resource
    private AdMapper adMapper;

    @Override
    public Result index() {
        Map<String,Object> resultMap = new HashMap<>();
        //查询ad
        AdExample adExample = new AdExample();
        AdExample.Criteria adCriteria = adExample.createCriteria();
        adCriteria.andAd_position_idEqualTo(1);;
        List<Ad> adList = adMapper.selectByExample(adExample);
        //查询channel
        ChannelExample channelExample = new ChannelExample();
        channelExample.setOrderByClause("sort_order asc");
        List<Channel> channelList = channelMapper.selectByExample(channelExample);
        //查询新goods
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria goodsCriteria = goodsExample.createCriteria();
        goodsCriteria.andIs_newEqualTo("1");
        PageHelper.startPage(1,4);
        List<Goods> goodsList = goodsMapper.selectByExample(goodsExample);
        //查询热销goods
        GoodsExample hotGoodsExample = new GoodsExample();
        GoodsExample.Criteria hotGoodsCriteria = goodsExample.createCriteria();
        hotGoodsCriteria.andIs_hotEqualTo("1");
        PageHelper.startPage(1,3);
        List<Goods> hotGoodsList = goodsMapper.selectByExample(hotGoodsExample);
        //查询brand
        BrandExample brandExample = new BrandExample();
        brandExample.setOrderByClause("new_sort_order asc");
        BrandExample.Criteria brandCriteria = brandExample.createCriteria();
        brandCriteria.andIs_newEqualTo("1");
        PageHelper.startPage(1,4);
        List<Brand> brandList = brandMapper.selectByExample(brandExample);
        //查询topic
        PageHelper.startPage(1,3);
        List<Topic> topicList = topicMapper.selectByExample(null);
        //查询category
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria categoryCriteria = categoryExample.createCriteria();
        categoryCriteria.andParent_idEqualTo(0);
        categoryCriteria.andNameNotEqualTo("推荐");
        List<Category> categoryList = categoryMapper.selectByExample(categoryExample);

        List<Map<String,Object>> newCategoryList = new ArrayList<>();
        for (Category categoryItem:categoryList) {
            Map<String,Object> newCategoryListItem = new HashMap<>();
            newCategoryListItem.put("id",categoryItem.getId());
            newCategoryListItem.put("name",categoryItem.getName());
            newCategoryList.add(newCategoryListItem);
        }
        resultMap.put("banner",adList);
        resultMap.put("channel",channelList);
        resultMap.put("newGoodsList",goodsList);
        resultMap.put("hotGoodsList",hotGoodsList);
        resultMap.put("brandList",brandList);
        resultMap.put("topicList",topicList);
        resultMap.put("categoryList",newCategoryList);
        return ResultUtils.success(resultMap);
    }
}
