package com.taotieshop.demo.service.impl;

import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.service.LoginService;
import com.taotieshop.utils.ResultUtils;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 李宇
 * @Date: 2018/11/12 22:29
 * @Description:
 */@Component
public class LoginServiceImp implements LoginService {
    @Override
    public Result login(Map<String, Object> requstMap) {
        Map<String,Object> data = new HashMap<String,Object>();
        Map<String,Object> userInfo = new HashMap<String,Object>();
        data.put("token","1212312313");
        userInfo.put("username","admin");
        userInfo.put("uid",123);
        userInfo.put("gid",123);
        userInfo.put("shell",123);
        userInfo.put("homedir","jsfakl");
        data.put("userInfo",userInfo);
        return ResultUtils.success(data);
    }
}
