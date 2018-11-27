package com.taotieshop.demo.mini.controller;

import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.mini.service.MiniCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Auther: 李宇
 * @Date: 2018/11/22 23:04
 * @Description:
 */
@RestController
@RequestMapping(value = "/mini/catalog")
public class MiniCategoryController {
    @Autowired
    private MiniCategoryService miniCategoryService;

    @GetMapping("/index")
    public Result getCategoryById(@RequestBody Map<String,Object> requestMap){
        return miniCategoryService.getCategoryById(requestMap);
    }
}
