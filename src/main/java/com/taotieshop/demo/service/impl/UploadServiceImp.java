package com.taotieshop.demo.service.impl;

import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.service.UploadService;
import com.taotieshop.demo.utils.FileUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/128:41
 * 类名: UploadServiceImp
 */
@Component
public class UploadServiceImp implements UploadService {
    @Override
    public Result uploadBrandPic(MultipartFile file, Map<String, Object> map) {
        // 要上传的目标文件存放路径
        String localPath = "E:/Develop/Files/Photos";
        // 上传成功或者失败的提示
        String msg = "";

        if (FileUtils.upload(file, localPath, file.getOriginalFilename())){
            // 上传成功，给出页面提示
            msg = "上传成功！";
        }else {
            msg = "上传失败！";

        }

        // 显示图片
        map.put("msg", msg);
        map.put("fileName", file.getOriginalFilename());
        return null;
    }
}
