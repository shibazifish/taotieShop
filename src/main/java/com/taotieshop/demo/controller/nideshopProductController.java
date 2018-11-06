package com.taotieshop.demo.controller;

import com.taotieshop.demo.entity.nideshopProduct;
import com.taotieshop.demo.repository.nideshopProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/69:06
 * 类名: nideshopProductController
 */
@RestController
public class nideshopProductController {
    @Autowired
    private nideshopProductRepository nideshopProductRepository;
    @GetMapping (value = "/product")
    public List<nideshopProduct> getAllNideshopProduct(){
        return nideshopProductRepository.findAll();
    }
}
