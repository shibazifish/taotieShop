package com.taotieshop.demo.mini.controller;

import com.taotieshop.demo.entity.Goods;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.mini.service.MiniGoodsService;
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
@RequestMapping(value = "/mini/goods")
public class MiniGoodsController {

    @Autowired
    private MiniGoodsService miniGoodsService;

    /**
     * 查询所有商品信息
     * @return
     */
    @GetMapping(value = "/index")
    public Result getGoodsList(){
        return miniGoodsService.getGoodsList();
    }
    /**
     * 查询商品总数
     * @return
     */
    @GetMapping("/count")
    public Result getGoodsCount(){
        return miniGoodsService.getGoodsCount();
    }

    /**
     * 任务：
     * 描述：获取分类数据
     * 作者：李宇 
     * 时间：2018/11/22 11:52
    */
    @GetMapping(value = "/category")
    public Result getCategoryInfo(@RequestParam("id") int id){
        return miniGoodsService.getCategoryInfo(id);
    }
    /**
     * 通过id删除对应商品信息
     * @param requestMap
     * @return
     */
    @PostMapping("/destory")
    public Result deletGoodsById(@RequestBody Map<String,Object> requestMap){
        return miniGoodsService.deleteGoodsById(requestMap);
    }

    /**
     * 获取所有分类信息
     * @return
     */
    @GetMapping("/getAllCategory")
    public Result getAllCategory(){
        return miniGoodsService.getAllCategory();
    }

    /**
     * 通过商品实体更新商品信息
     * @param goods
     * @return
     */
    @PostMapping("/store")
    public Result updateGoodsInfo(@RequestBody Goods goods){
        return miniGoodsService.updateGoodsInfo(goods);
    }
}
