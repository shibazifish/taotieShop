package com.taotieshop.demo.wechat.controller;

import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.entity.WechatUser;
import com.taotieshop.demo.utils.ResultUtils;
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
@RequestMapping(value = "/wechat/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping ()
    public Object checkToken(@RequestParam Map<String,Object> requstMap){
        return userService.checkToken(requstMap);
    }
    @PostMapping(value = "/add")
    public Result addUser(@RequestBody WechatUser wechatUser){
        return userService.addUser(wechatUser);
    }
    @GetMapping(value = "/login")
    public Result userLogin(@RequestParam Map<String,String> requestMap){
        return userService.userLogin(requestMap);
    }

    @GetMapping(value = "/get")
    public Result getUserInfo(@RequestParam(name = "openId") String openId){
        return ResultUtils.success(userService.getUserInfo(openId));
    }
    @GetMapping(value = "/rank")
    public Result getRankInfo(){
        return ResultUtils.success(userService.getRankInfo());
    }
}
