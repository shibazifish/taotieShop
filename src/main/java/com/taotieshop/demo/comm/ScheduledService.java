package com.taotieshop.demo.comm;

import com.taotieshop.demo.dao.ClockMapper;
import com.taotieshop.demo.entity.Clock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2019/1/1517:48
 * 类名: ScheduledService
 */
@Component
public class ScheduledService {
    private final static Logger logger = LoggerFactory.getLogger(ScheduledService.class);
    private static String url = "https://api.weixin.qq.com/cgi-bin/message/wxopen/template/send?access_token=";
    @Autowired
    private MiniAccessToken miniAccessToken;
    @Resource
    private ClockMapper clockMapper;
    /**
     * 任务：
     * 描述：定时发送打卡提醒信息
     * 作者：李宇
     * 时间：2019/1/15 18:45
     * 每天晚上八点执行
    */
    @Scheduled(cron = "0 10 20 */1 * ?")
    public void scheduledSendClockRemind(){
        String accessToken = miniAccessToken.getAccess_token();
        RestTemplate restTemplate = new RestTemplate();
        //构造请求参数
        Map<String,Object> dataMap = new HashMap<>();
        Map<String,String> keyword1 = new HashMap<>();
        keyword1.put("value","" );
        Map<String,String> keyword2 = new HashMap<>();
        keyword2.put("value","您有一个微信红包待领取！" );
        Map<String,String> keyword3 = new HashMap<>();
        keyword3.put("value","小冰" );
        dataMap.put("keyword1",keyword1 );
        dataMap.put("keyword2",keyword2 );
        dataMap.put("keyword3",keyword3 );

        MultiValueMap<String, Object> map= new LinkedMultiValueMap<String, Object>();
        map.add("access_token", accessToken);
        map.add("template_id", "NC4K32GJSZcToA_8NJQU_1iaMWc-B2Jk1s7BenWKXuo");
        map.add("page", "prize");
        map.add("data", dataMap);
        map.add("emphasis_keyword", "keyword2.DATA");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        List<Clock> clockList = clockMapper.queryScheduleInfo();

        for (Clock clock:clockList) {
            map.add("touser", clock.getOpen_id());
            map.add("form_id", clock.getForm_id());

            HttpEntity<MultiValueMap<String, Object>> request = new HttpEntity<MultiValueMap<String, Object>>(map,headers);
            ResponseEntity<String> responseEntity = restTemplate.exchange(url +accessToken, HttpMethod.POST, request, String.class);
            if(responseEntity.getStatusCode() != HttpStatus.OK)
            {
                logger.error("定时提醒发送失败！");
            }
        }
    }
}
