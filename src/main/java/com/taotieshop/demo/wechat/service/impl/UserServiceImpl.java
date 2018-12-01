package com.taotieshop.demo.wechat.service.impl;

import com.taotieshop.demo.dao.ClockMapper;
import com.taotieshop.demo.dao.WechatUserMapper;
import com.taotieshop.demo.entity.*;
import com.taotieshop.demo.utils.ResultUtils;
import com.taotieshop.demo.utils.WechatUtil;
import com.taotieshop.demo.wechat.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
    @Resource
    private WechatUserMapper wechatUserMapper;
    @Resource
    private ClockMapper clockMapper;
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

    @Override
    public Result addUser(WechatUser wechatUser) {
        WechatUserExample wechatUserExample = new WechatUserExample();
        WechatUserExample.Criteria criteria = wechatUserExample.createCriteria();
        criteria.andOpenIdEqualTo(wechatUser.getOpenId());
        List<WechatUser> wechatUsers = wechatUserMapper.selectByExample(wechatUserExample);
        if (wechatUsers.size()>0){
            return ResultUtils.success(wechatUsers.get(0));
        }
        if (wechatUser.getInviter()!=null && wechatUser.getInviter() !=""){//邀请人获得冰块
            ClockExample clockExample = new ClockExample();
            ClockExample.Criteria criteria1 = clockExample.createCriteria();
            criteria.andOpenIdEqualTo(wechatUser.getInviter());
            clockExample.setOrderByClause("clock_id ASC");
            List<Clock> clocks = clockMapper.selectByExample(clockExample);
            if (clocks.size()>1){//查询推荐人信息
                clockMapper.updateInviterIce(clocks.get(0));
            }
        }
        //插入初始打卡记录，防止邀请人得不到冰块
        Clock clock = new Clock();
        clock.setOpen_id(wechatUser.getOpenId());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date  date = null;
        try {
            date = sdf.parse("2009-11-04 00:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        clock.setCreate_time(date);
        clockMapper.insert(clock);
        int intVal = wechatUserMapper.insert(wechatUser);
        return ResultUtils.success(wechatUser);
    }
}
