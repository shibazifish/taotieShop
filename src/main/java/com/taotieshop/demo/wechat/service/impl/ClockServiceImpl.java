package com.taotieshop.demo.wechat.service.impl;

import com.taotieshop.demo.dao.ClockMapper;
import com.taotieshop.demo.entity.Clock;
import com.taotieshop.demo.entity.ClockExample;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.utils.IFUtil;
import com.taotieshop.demo.utils.ResultUtils;
import com.taotieshop.demo.utils.WechatUtil;
import com.taotieshop.demo.wechat.service.ClockService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
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
    @Override
    public Result addClockInfo(Map<String,String> requestMap) {
        String encryptedData = requestMap.getOrDefault("encryptedData","");
        String iv = requestMap.getOrDefault("iv","");
        String session_key = requestMap.getOrDefault("session_key","");
        String open_id = requestMap.getOrDefault("open_id","");

        String result = WechatUtil.decryptData(encryptedData,session_key,iv);
        result.replace("\"","");
        JSONObject resultJson = JSONObject.fromObject(result);
        List<Map<String,Object>> resultArr = (List<Map<String,Object>>)resultJson.get("stepInfoList");
        Map<String,Object> map = resultArr.get(resultArr.size()-1);
        String step = map.getOrDefault("step","").toString();
        Clock clock = new Clock();
        clock.setClock_image_url(step);
        clock.setCreate_time(IFUtil.CurrentDate());
        clock.setUser_id(open_id);


        int intVal = clockMapper.countOneDayRecord(clock);
        if (intVal>0){
            intVal = clockMapper.updateByDay(clock);
        }else {
            intVal = clockMapper.insert(clock);
        }
        return ResultUtils.success(clock);
    }
}
