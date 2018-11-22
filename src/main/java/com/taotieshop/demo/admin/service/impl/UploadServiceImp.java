package com.taotieshop.demo.admin.service.impl;

import com.taotieshop.demo.admin.service.UploadService;
import com.taotieshop.demo.comm.ExceptionEnum;
import com.taotieshop.demo.comm.TSException;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.utils.FileUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
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
        String localPath = null;
        try {
            localPath = ResourceUtils.getURL("classpath:").getPath() + "goodsPicture";
        } catch (FileNotFoundException e) {
            throw new TSException(ExceptionEnum.FILE_NOT_FUND_EXCEPTION);
        }
        // 上传成功或者失败的提示
        String msg = "";
        Result uploadResult = FileUtils.upload("brand_pic",file, localPath, file.getOriginalFilename());

        // 显示图片
        map.put("msg", msg);
        map.put("fileName", file.getOriginalFilename());
        return uploadResult;
    }
}
