package com.taotieshop.demo.controller;

import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/128:37
 * 类名: UploadController
 */
@RestController
@RequestMapping(value = "upload")
public class UploadController {
    @Autowired
    private UploadService uploadService;
    @PostMapping(value = "brandPic")
    public Result uploadBrandPic(@RequestParam("filename") MultipartFile file, Map<String, Object> map){
        return uploadService.uploadBrandPic(file,map);
    }
}
