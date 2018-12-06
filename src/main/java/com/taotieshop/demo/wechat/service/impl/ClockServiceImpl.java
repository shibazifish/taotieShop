package com.taotieshop.demo.wechat.service.impl;

import com.taotieshop.demo.dao.ClockMapper;
import com.taotieshop.demo.dao.WechatUserMapper;
import com.taotieshop.demo.entity.Clock;
import com.taotieshop.demo.entity.ClockExample;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.entity.WechatUser;
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
    private WechatUserMapper wechatUserMapper;
    @Autowired
    private UserService userService;

    @Override
    @Transactional
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
        clock.setRun_data(Integer.parseInt(step));
        clock.setIce_data(Integer.parseInt(step)/1000);
        clock.setCreate_time(IFUtil.CurrentDate());
        clock.setOpen_id(open_id);


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
        return ResultUtils.success(clockList);
    }
}
