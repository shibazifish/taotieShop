package com.taotieshop.demo.utils;

import com.baidu.aip.ocr.AipOcr;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/308:45
 * 类名: BaiDuAi
 */
public class BaiDuAi {
    //设置APPID/AK/SK
    public static final String APP_ID = "10021464";//你的 App ID
    public static final String API_KEY = "j8Th8cQgCoEsQu4nI35lk4G4";//你的 Api Key
    public static final String SECRET_KEY = "IuovUkcWxx8v2rGEmZMU1kF5hEy3WGU7";//你的 Secret Key
    public static AipOcr client;

    public static AipOcr getAipOcr(){
        if (client == null){
            client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
            // 可选：设置网络连接参数
            client.setConnectionTimeoutInMillis(20000);
            client.setSocketTimeoutInMillis(60000);

            // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//            client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//            client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理
        }
        return client;
    }
}
