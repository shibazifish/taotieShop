package com.taotieshop.demo.mini.service.impl;

import com.github.pagehelper.PageHelper;
import com.taotieshop.demo.dao.CategoryMapper;
import com.taotieshop.demo.entity.Category;
import com.taotieshop.demo.entity.CategoryExample;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.mini.service.MiniCategoryService;
import com.taotieshop.demo.utils.ResultUtils;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 李宇
 * @Date: 2018/11/22 22:27
 * @Description:
 */
@Component
public class MiniCategoryServiceImp implements MiniCategoryService {
    private CategoryMapper categoryMapper;
    @Override
    public Result getCategoryById(Map<String,Object> requestMap) {
        String idStr = requestMap.getOrDefault("id","").toString();
        if ("".equals(idStr)){
            return getCategory();
        }
        int id = Integer.valueOf(idStr);
        //查询parent_id为0的前十条数据
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();
        criteria.andParent_idEqualTo(0);
        PageHelper.startPage(1,10);
        List<Category> categoryList = categoryMapper.selectByExample(categoryExample);
        //查询当前分类
        CategoryExample currentCategoryExample = new CategoryExample();
        CategoryExample.Criteria currentCategoryCriteria = currentCategoryExample.createCriteria();
        currentCategoryCriteria.andIdEqualTo(id);
        List<Category> currentCategory = categoryMapper.selectByExample(currentCategoryExample);
        if(currentCategory.size()>0){
            //查询当前分类
            CategoryExample subCategoryExample = new CategoryExample();
            CategoryExample.Criteria subCategoryCriteria = subCategoryExample.createCriteria();
            subCategoryCriteria.andParent_idEqualTo(currentCategory.get(0).getId());
            List<Category> subCategory = categoryMapper.selectByExample(subCategoryExample);
            currentCategory.get(0).setSubCategory(subCategory);
        }
        Map<String,Object> resultMap =  new HashMap<String,Object>();
        resultMap.put("categoryList",categoryList);
        resultMap.put("currentCategory",currentCategory.get(0));
        return ResultUtils.success(resultMap);
    }

    public Result getCategory() {
        //查询parent_id为0的前十条数据
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();
        criteria.andParent_idEqualTo(0);
        PageHelper.startPage(1,10);
        List<Category> categoryList = categoryMapper.selectByExample(categoryExample);
        Category currentCategory = categoryList.get(0);
        //查询子分类
        CategoryExample subCategoryExample = new CategoryExample();
        CategoryExample.Criteria subCategoryCriteria = subCategoryExample.createCriteria();
        subCategoryCriteria.andParent_idEqualTo(currentCategory.getId());
        List<Category> subCategory = categoryMapper.selectByExample(subCategoryExample);
        currentCategory.setSubCategory(subCategory);

        Map<String,Object> resultMap =  new HashMap<String,Object>();
        resultMap.put("categoryList",categoryList);
        resultMap.put("currentCategory",currentCategory);
        return ResultUtils.success(resultMap);
    }
}
