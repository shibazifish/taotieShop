package com.taotieshop.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/522:05
 * 类名: HelloController
 */
@RestController
public class HelloController {
    @PostMapping(value = {"/hello","/hi"})
    public String say(){
        return "hello world !";
    }
}
