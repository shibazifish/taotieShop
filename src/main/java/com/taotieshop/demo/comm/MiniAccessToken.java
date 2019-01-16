package com.taotieshop.demo.comm;

import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2019/1/169:32
 * 类名: MiniAccessToken
 */
@Component
public class MiniAccessToken {
    private final static Logger logger = LoggerFactory.getLogger(MiniAccessToken.class);
    private static String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential";
    private static String appid = "&appid=wx4375865120f60592";
    private static String secret = "&secret=bdf2056097e96b3124ac43399fa2fdd2";
    private String access_token = "";//获取到的凭证
    private Date create_date;//获取时间
    private int expires_in;//凭证有效时间，单位：秒。目前是7200秒之内的值。
    private Date end_date;//到期时间

    /**
     * 任务：
     * 描述：读取token值
     * 作者：李宇
     * 时间：2019/1/16 9:38
    */
    public String getAccess_token() {
        Date nowDate = new Date();
        if("".equals(access_token)){//通过url请求获取access_token
            getTokenByUrl();
        }else if (nowDate.compareTo(end_date)>=0){
            getTokenByUrl();
        }
        return access_token;
    }
    /**
     * 任务：
     * 描述：获取token
     * 作者：李宇
     * 时间：2019/1/16 9:51
    */
    public void getTokenByUrl(){//向微信服务器请求token
        RestTemplate restTemplate = new RestTemplate();
        //进行网络请求,访问url接口
        ResponseEntity<String> responseEntity = restTemplate.exchange(url +appid +secret, HttpMethod.GET, null, String.class);
        JSONObject resultJson = null;
        if(responseEntity != null && responseEntity.getStatusCode() == HttpStatus.OK)
        {
            String sessionData = responseEntity.getBody();
            //解析从微信服务器获得的openid和session_key;
            resultJson = JSONObject.fromObject(sessionData);
            Object errcodeObj = resultJson.get("errcode");
            if (errcodeObj!=null){
                int errcode = Integer.parseInt(errcodeObj.toString());
                logger.error(TokenErrorEnum.getErrmsgByErrcode(errcode));
                return;
            }
            //获取token
            access_token = resultJson.getString("access_token");
            expires_in = Integer.parseInt(resultJson.getString("expires_in")) - 60;//提前一分钟失效
            create_date = new Date();
            long endTime = System.currentTimeMillis()+expires_in*1000;
            end_date = new Date(endTime);
        }
    }
}
