package com.taotieshop.demo.mini.controller;

import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.mini.service.MiniIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 李宇
 * @Date: 2018/11/21 23:21
 * @Description:
 */
@RestController
@RequestMapping(value = "/mini/index")
@CrossOrigin
public class MiniIndexController {
    @Autowired
    private MiniIndexService miniIndexService;
    @GetMapping(value = "/index")
    public Result index(){
        return  miniIndexService.index();
    }
}
