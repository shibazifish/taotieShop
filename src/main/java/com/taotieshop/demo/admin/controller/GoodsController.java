package com.taotieshop.demo.admin.controller;

import com.taotieshop.demo.admin.service.GoodsService;
import com.taotieshop.demo.entity.Goods;
import com.taotieshop.demo.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/814:59
 * 类名: GoodsController
 */
@RestController
@RequestMapping(value = "/admin/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /**
     * 按条件分页查询
     * @param page
     * @param name
     * @return
     */
    @GetMapping()
    public Result getGoodsList(@RequestParam("page") int page,@RequestParam("name") String name){
        return goodsService.getGoodsList(page,name);
    }

    /**
     * 通过id查询具体商品信息
     * @param id
     * @return
     */
    @GetMapping("/info")
    public Result getGoodsById(@RequestParam("id") int id){
        return goodsService.getGoodsById(id);
    }

    /**
     * 通过id删除对应商品信息
     * @param requestMap
     * @return
     */
    @PostMapping("/destory")
    public Result deletGoodsById(@RequestBody Map<String,Object> requestMap){
        return goodsService.deleteGoodsById(requestMap);
    }

    /**
     * 获取所有分类信息
     * @return
     */
    @GetMapping("/getAllCategory")
    public Result getAllCategory(){
        return goodsService.getAllCategory();
    }

    /**
     * 通过商品实体更新商品信息
     * @param goods
     * @return
     */
    @PostMapping("/store")
    public Result updateGoodsInfo(@RequestBody Goods goods){
        return goodsService.updateGoodsInfo(goods);
    }
}
