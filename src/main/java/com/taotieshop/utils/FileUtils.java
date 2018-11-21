package com.taotieshop.utils;

import com.taotieshop.demo.entity.Result;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 任务：
 * 描述：文件上传工具类
 * 作者：李宇
 * 时间：2018/11/128:54
 * 类名: FileUtils
 */
public class FileUtils {
    /**
     * 任务：
     * 描述：获取文件后缀名
     * 作者：李宇
     * 时间：2018/11/12 8:54
    */
    public static String getSuffix(String fileName){
        return fileName.substring(fileName.lastIndexOf("."));
    }
    /**
     * 任务：
     * 描述：生成新的文件名
     * 作者：李宇
     * 时间：2018/11/12 8:55
    */
    public static String getFileName(String fileOriginName){
        return getUUID() + getSuffix(fileOriginName);
    }
    /**
     * 任务：
     * 描述：生成文件名
     * 作者：李宇
     * 时间：2018/11/12 8:57
    */
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }
    /**
     * 任务：
     * 描述：上传文件
     * 作者：李宇 
     * 时间：2018/11/12 8:59
    */
    public static Result upload(String uploadType,MultipartFile file, String path, String fileName){

        // 生成新的文件名
        String realPath = path + "/" + FileUtils.getFileName(fileName);
        //使用原文件名
        //String realPath = path + "/" + fileName;

        File dest = new File(realPath);

        //判断文件父目录是否存在
        if(!dest.getParentFile().exists()){
            dest.getParentFile().mkdir();
        }
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("name", uploadType);
        resultMap.put("fileUrl", realPath);
        try {
            //保存文件
            file.transferTo(dest);
            return ResultUtils.success(resultMap);
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return ResultUtils.error(0, e.getMessage());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return ResultUtils.error(0, e.getMessage());
        }

    }
}
