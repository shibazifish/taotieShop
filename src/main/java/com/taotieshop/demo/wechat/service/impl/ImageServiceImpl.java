package com.taotieshop.demo.wechat.service.impl;

import com.baidu.aip.ocr.AipOcr;
import com.taotieshop.demo.comm.ExceptionEnum;
import com.taotieshop.demo.comm.TSException;
import com.taotieshop.demo.dao.ClockMapper;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.utils.BaiDuAi;
import com.taotieshop.demo.utils.FileUtils;
import com.taotieshop.demo.utils.ResultUtils;
import com.taotieshop.demo.wechat.service.ImageService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/2919:01
 * 类名: ImageServiceImpl
 */
@Component
public class ImageServiceImpl implements ImageService{
    @Override
    public Result uploadImage(MultipartFile file) {
        String localPath = null;
        try {
            localPath = ResourceUtils.getURL("classpath:").getPath() + "static/upload";
        } catch (FileNotFoundException e) {
            throw new TSException(ExceptionEnum.FILE_NOT_FUND_EXCEPTION);
        }
        // 上传成功或者失败的提示
        String msg = "";
        Result uploadResult = FileUtils.upload("upload",file, localPath, file.getOriginalFilename());
        Map<String,Object> fileInfo = (Map<String,Object>)uploadResult.getData();
        return uploadResult;
    }

    @Override
    public Result getImageInfoByBaidu() {
        AipOcr aipOcr = BaiDuAi.getAipOcr();

        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("language_type", "CHN_ENG");
        options.put("detect_direction", "true");
        options.put("detect_language", "true");
        options.put("probability", "true");

        String path = "F:\\微信图片_20181130103608.jpg";
        JSONObject res = aipOcr.basicGeneral(path,options);
        JSONArray wordsArray = res.getJSONArray("words_result");
        String pattern = "^第\\d+名$";
        int resultIndex = -1;
        String resultStr = "";
        for(int i=0;i<wordsArray.length();i++){
            JSONObject wordMap = (JSONObject)wordsArray.get(i);
            String word = wordMap.getString("words").toString();
            boolean isMatch = Pattern.matches(pattern, word);
            if(isMatch){
                resultIndex = i+1;
            }
            if (i==resultIndex){
                resultStr = word;
                break;
            }
        }
        return ResultUtils.success(resultStr);
    }
}
