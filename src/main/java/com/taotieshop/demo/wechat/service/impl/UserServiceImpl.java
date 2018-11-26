package com.taotieshop.demo.wechat.service.impl;

import com.taotieshop.demo.wechat.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/2614:31
 * 类名: UserServiceImpl
 */
@Component
public class UserServiceImpl implements UserService {
    @Override
    public Object checkToken(Map<String, Object> requestMap) {
        // 微信加密签名
        String signature = requestMap.getOrDefault("signature","").toString();
        // 时间戳
        String timestamp = requestMap.getOrDefault("timestamp","").toString();
        // 随机数
        String nonce = requestMap.getOrDefault("nonce","").toString();
        // 随机字符串
        String echostr = requestMap.getOrDefault("echostr","").toString();
        // 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
//        if (signature != null && CheckoutUtil.checkSignature(signature, timestamp, nonce)) {
//            print = response.getWriter();
//            print.write(echostr);
//            print.flush();
//        }
        return echostr;
    }
}
