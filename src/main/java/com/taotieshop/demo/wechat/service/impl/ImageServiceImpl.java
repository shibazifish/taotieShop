package com.taotieshop.demo.wechat.service.impl;

import com.taotieshop.demo.comm.ExceptionEnum;
import com.taotieshop.demo.comm.TSException;
import com.taotieshop.demo.dao.ClockMapper;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.utils.FileUtils;
import com.taotieshop.demo.wechat.service.ImageService;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

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
}
