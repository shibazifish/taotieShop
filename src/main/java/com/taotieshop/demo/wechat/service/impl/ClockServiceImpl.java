package com.taotieshop.demo.wechat.service.impl;

import com.taotieshop.demo.dao.ClockMapper;
import com.taotieshop.demo.dao.SysParameterMapper;
import com.taotieshop.demo.dao.WechatUserMapper;
import com.taotieshop.demo.entity.*;
import com.taotieshop.demo.utils.IFUtil;
import com.taotieshop.demo.utils.ResultUtils;
import com.taotieshop.demo.utils.WechatUtil;
import com.taotieshop.demo.wechat.service.ClockService;
import com.taotieshop.demo.wechat.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 任务：
 * 描述：打卡记录
 * 作者：李宇
 * 时间：2018/11/2715:43
 * 类名: ClockServiceImpl
 */
@Component
public class ClockServiceImpl implements ClockService{
    @Resource
    private ClockMapper clockMapper;
    @Resource
    private SysParameterMapper sysParameterMapper;
    @Autowired
    private UserService userService;

    @Override
    @Transactional
    public Result addClockInfo(Map<String,String> requestMap) {
        String encryptedData = requestMap.getOrDefault("encryptedData","");
        String iv = requestMap.getOrDefault("iv","");
        String session_key = requestMap.getOrDefault("session_key","");
        String open_id = requestMap.getOrDefault("open_id","");
        String form_id = requestMap.getOrDefault("form_id","");

        String result = WechatUtil.decryptData(encryptedData,session_key,iv);
        result.replace("\"","");
        JSONObject resultJson = JSONObject.fromObject(result);
        List<Map<String,Object>> resultArr = (List<Map<String,Object>>)resultJson.get("stepInfoList");
        Map<String,Object> map = resultArr.get(resultArr.size()-1);
        String step = map.getOrDefault("step","").toString();//获取微信步数

        int runData = Integer.parseInt(step);
        int iceData = runData/1000;
        if(iceData > 10){//如果步数大于10000，冰块按照10000计算
            iceData = 10;
        }
        Clock clock = new Clock();
        clock.setRun_data(runData);
        clock.setIce_data(iceData);
        clock.setCreate_time(IFUtil.CurrentDate());
        clock.setOpen_id(open_id);
        clock.setForm_id(form_id);

        int intVal = clockMapper.countOneDayRecord(clock);
        if (intVal>0){
            intVal = clockMapper.updateByDay(clock);
        }else {
            intVal = clockMapper.insert(clock);
        }
        //更新用户累计步数和用户累计冰块数
        userService.updateRunData(open_id);
        return ResultUtils.success(clock);
    }

    /**
     * 获取用户的所有打卡记录
     * @param open_id
     * @return
     */
    @Override
    public Result getClockInfo(String open_id) {
        ClockExample clockExample = new ClockExample();
        clockExample.setOrderByClause("create_time desc");
        ClockExample.Criteria criteria = clockExample.createCriteria();
        criteria.andOpen_idEqualTo(open_id);
        criteria.andRun_dataIsNotNull();
        List<Clock> clockList = clockMapper.selectByExample(clockExample);
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("clock",clockList);
        //查询用户信息
        WechatUser wechatUser = userService.getUserInfo(open_id);
        resultMap.put("wechatUser",wechatUser);
        //查询海报颜色
        SysParameterExample sysParameterExample = new SysParameterExample();
        SysParameterExample.Criteria sysCriteria1 = sysParameterExample.createCriteria();
        List<String> strings = new ArrayList<>();
        strings.add("POSTER_COLOR");
        strings.add("POSTER_TIME_COLOR");
        strings.add("POSTER_DATA_COLOR");
        strings.add("POSTER_INFO_COLOR");
        strings.add("POSTER_TITLE");
        sysCriteria1.andPara_codeIn(strings);
        List<SysParameter> posterColor = sysParameterMapper.selectByExample(sysParameterExample);
        Map<String,Object> colorMap = new HashMap<>();
        for (SysParameter sysPara:posterColor) {
            colorMap.put(sysPara.getPara_code(), sysPara.getPara_value());
        }
        resultMap.put("colorMap",colorMap);
        return ResultUtils.success(resultMap);
    }
}
