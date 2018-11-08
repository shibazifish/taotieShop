package com.taotieshop.demo.controller;

import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/814:59
 * 类名: GoodsController
 */
@RestController
@RequestMapping(value = "/admin")
@CrossOrigin
public class GoodsController {

    @Autowired
    private GoodsService goodsService;
    @GetMapping(value = "/goods")
    public Result getGoodsList(){
        return goodsService.getGoodsList(1,10);
    }
}
