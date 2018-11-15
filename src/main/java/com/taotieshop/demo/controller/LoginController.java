package com.taotieshop.demo.controller;

import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Auther: 李宇
 * @Date: 2018/11/12 22:25
 * @Description:
 */
@RestController
@RequestMapping(value = "/admin/auth")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping (value = "/login")
    public Result login(@RequestBody Map<String,Object> requstMap){
        return loginService.login(requstMap);
    }
}
