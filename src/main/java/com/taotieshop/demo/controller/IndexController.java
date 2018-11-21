package com.taotieshop.demo.controller;

import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.service.IndexService;
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
public class IndexController {
    @Autowired
    private IndexService indexService;
    @GetMapping(value = "/index")
    public Result index(){
        return  indexService.index();
    }
}
