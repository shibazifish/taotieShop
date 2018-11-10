package com.taotieshop.demo.controller;

import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/814:59
 * 类名: GoodsController
 */
@RestController
@RequestMapping(value = "/admin/goods")
@CrossOrigin
public class GoodsController {

    @Autowired
    private GoodsService goodsService;
    @GetMapping()
    public Result getGoodsList(@RequestParam("page") int page,@RequestParam("name") String name){
        return goodsService.getGoodsList(page,name);
    }
    @GetMapping("/info")
    public Result getGoodsById(@RequestBody int id){
        return goodsService.getGoodsById(id);
    }
    @PostMapping("/destory")
    public Result deletGoodsById(@RequestParam("id") int id){
        return goodsService.deleteGoodsById(id);
    }
}
