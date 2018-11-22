package com.taotieshop.demo.admin.service.impl;

import com.taotieshop.demo.admin.service.LoginService;
import com.taotieshop.demo.dao.AdminMapper;
import com.taotieshop.demo.entity.Admin;
import com.taotieshop.demo.entity.AdminExample;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.utils.ResultUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 李宇
 * @Date: 2018/11/12 22:29
 * @Description:
 */@Component
public class LoginServiceImp implements LoginService {
     @Resource
     private AdminMapper adminMapper;
    @Override
    public Result login(Map<String, Object> requstMap) {
        String userName = requstMap.getOrDefault("username","")+"";
        String passWord = requstMap.getOrDefault("password","")+"";

        ByteSource bytes = ByteSource.Util.bytes("ABCDEF");
        String pass = new SimpleHash("MD5", passWord, bytes, 3).toString();

        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andUsernameEqualTo(userName);
        criteria.andPasswordEqualTo(pass);
        List<Admin> adminList = adminMapper.selectByExample(adminExample);
        Map<String,Object> data = new HashMap<String,Object>();
        Map<String,Object> userInfo = new HashMap<String,Object>();
        //把前端输入的username和password封装为token
        UsernamePasswordToken token = new UsernamePasswordToken(userName, passWord);
        data.put("token",token);
        data.put("userInfo",adminList.get(0));
        return ResultUtils.success(data);
    }
}
