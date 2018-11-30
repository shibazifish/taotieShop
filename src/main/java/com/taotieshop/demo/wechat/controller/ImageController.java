package com.taotieshop.demo.wechat.controller;

import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.wechat.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/2918:57
 * 类名: UploadController
 */
@RestController
@RequestMapping(value = "/wechat/image")
public class ImageController {
    @Autowired
    private ImageService imageService;
    @PostMapping(value = "/upload")
    public Result uploadImage(@RequestParam("uploadfile_ant") MultipartFile file){
        return imageService.uploadImage(file);
    }
    @GetMapping(value = "/getImageInfo")
    public Result getImageInfoByAi(){
        return imageService.getImageInfoByBaidu();
    }
}
