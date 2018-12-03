package com.taotieshop.demo.wechat.service;

import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.entity.WechatUser;

import java.util.Map;

public interface UserService {
    Object checkToken(Map<String,Object> requestMap);
    Result addUser(WechatUser wechatUser);
    Result userLogin(Map<String,String> requestMap);
}
