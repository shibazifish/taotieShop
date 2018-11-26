package com.taotieshop.demo.wechat.controller;

import com.taotieshop.demo.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/2614:28
 * 类名: UserController
 */
@RestController
@RequestMapping(value = "/wechat")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping ()
    public Object checkToken(@RequestParam Map<String,Object> requstMap){
        return userService.checkToken(requstMap);
    }
}
