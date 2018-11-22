package com.taotieshop.demo.admin.service;

import com.taotieshop.demo.entity.Result;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface UploadService {
    Result uploadBrandPic(MultipartFile file, Map<String, Object> map);
}
