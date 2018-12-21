package com.taotieshop.demo.wechat.service.impl;

import com.github.pagehelper.PageHelper;
import com.taotieshop.demo.dao.ClockMapper;
import com.taotieshop.demo.dao.WechatUserMapper;
import com.taotieshop.demo.entity.*;
import com.taotieshop.demo.utils.ResultUtils;
import com.taotieshop.demo.wechat.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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
    @Transactional
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
            criteria1.andOpen_idEqualTo(wechatUser.getInviter());
            clockExample.setOrderByClause("create_time ASC");
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

    @Override
    public Result userLogin(Map<String, String> requestMap) {
       String wx_url_1 = "https://api.weixin.qq.com/sns/jscode2session?appid=wx4375865120f60592&secret=bdf2056097e96b3124ac43399fa2fdd2&js_code=";
       String wx_url_2 = "&grant_type=authorization_code";
       String code = requestMap.get("code");

        RestTemplate restTemplate = new RestTemplate();
        //进行网络请求,访问url接口
        ResponseEntity<String> responseEntity = restTemplate.exchange(wx_url_1 +code +wx_url_2, HttpMethod.GET, null, String.class);
        //根据返回值进行后续操作
        JSONObject weChatSession = null;
        if(responseEntity != null && responseEntity.getStatusCode() == HttpStatus.OK)
        {
            String sessionData = responseEntity.getBody();
            //解析从微信服务器获得的openid和session_key;
            weChatSession = JSONObject.fromObject(sessionData);
            //获取用户的唯一标识
//            String openid = weChatSession.getString("");
            //获取会话秘钥
//            String session_key = weChatSession.getString("");
            //下面就可以写自己的业务代码了
            //最后要返回一个自定义的登录态,用来做后续数据传输的验证
        }
        return ResultUtils.success(weChatSession);
    }
    /**
     * 任务：
     * 描述：通过用户openId更新用户步数和冰块数
     * 作者：李宇
     * 时间：2018/12/6 16:28
    */
    @Override
    public int updateRunData(String openId){
        //更新用户累计步数和用户累计冰块数
        WechatUser wechatUser = new WechatUser();
        wechatUser.setOpenId(openId);
        int intVal =wechatUserMapper.updateRunData(wechatUser);
        return intVal;
    }

    @Override
    public WechatUser getUserInfo(String opentId) {
        WechatUserExample wechatUserExample = new WechatUserExample();
        WechatUserExample.Criteria criteria = wechatUserExample.createCriteria();
        criteria.andOpenIdEqualTo(opentId);
        List<WechatUser> wechatUsers = wechatUserMapper.selectByExample(wechatUserExample);
        return wechatUsers.get(0);
    }

    @Override
    public Result getRankInfo() {
        PageHelper.startPage(1,10);
        List<Map<String,Object>> nowRanks = wechatUserMapper.getNowRankInfo();
        PageHelper.startPage(1,10);
        List<Map<String,Object>> yesterdayRanks = wechatUserMapper.getYesterdayRankInfo();
        PageHelper.startPage(1,20);
        List<Map<String,Object>> allRanks = wechatUserMapper.getAllRankInfo();
        Map<String,Object> ranks = new HashMap<>();
        ranks.put("nowRanks",nowRanks);
        ranks.put("yesterdayRanks",yesterdayRanks);
        ranks.put("allRanks",allRanks);
        return ResultUtils.success(ranks);
    }
}
