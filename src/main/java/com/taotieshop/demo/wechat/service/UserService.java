package com.taotieshop.demo.wechat.service;

import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.entity.WechatUser;

import java.util.Map;

public interface UserService {
    Object checkToken(Map<String,Object> requestMap);
    Result addUser(WechatUser wechatUser);
    Result userLogin(Map<String,String> requestMap);
    /**
     * 任务：
     * 描述：通过用户openId更新用户运动步数
     * 作者：李宇
     * 时间：2018/12/6 16:30
    */
    int updateRunData(String opentId);
}
