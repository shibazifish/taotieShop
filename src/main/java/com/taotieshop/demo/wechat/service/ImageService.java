package com.taotieshop.demo.wechat.service;

import com.taotieshop.demo.entity.Result;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
    Result uploadImage(MultipartFile file);
    Result getImageInfoByBaidu();
}
