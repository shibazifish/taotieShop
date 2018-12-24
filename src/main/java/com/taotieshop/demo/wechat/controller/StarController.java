package com.taotieshop.demo.wechat.controller;

import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.wechat.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 李宇
 * @Date: 2018/12/23 12:17
 * @Description:
 */
@RestController
@RequestMapping(value = "/wechat/star")
public class StarController {
    @Autowired
    private StarService starService;
    @GetMapping(value = "/info")
    public Result getStarInfo(){
        return starService.getStarInfo();
    }
    @GetMapping(value = "/query")
    public Result queryStarInfo(@RequestParam("id") int id){
        return starService.queryStarInfo(id);
    }
}
