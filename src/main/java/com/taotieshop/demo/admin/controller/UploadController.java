package com.taotieshop.demo.admin.controller;

import com.taotieshop.demo.admin.service.UploadService;
import com.taotieshop.demo.entity.Result;
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
@RequestMapping(value = "/admin/upload")
public class UploadController {
    @Autowired
    private UploadService uploadService;
    @PostMapping(value = "/brandPic")
    public Result uploadBrandPic(@RequestParam("brand_pic") MultipartFile file, Map<String, Object> map){
        return uploadService.uploadBrandPic(file,map);
    }
}
