package com.taotieshop.demo.controller;

import com.taotieshop.demo.comm.TSException;
import com.taotieshop.demo.entity.nideshopProduct;
import com.taotieshop.demo.entity.result;
import com.taotieshop.demo.repository.nideshopProductRepository;
import com.taotieshop.demo.utils.resultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
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
    @GetMapping (value = "/get")
    public result getAllNideshopProduct(){
        return resultUtils.success(nideshopProductRepository.findAll());
    }
    @PostMapping (value = "/add")
    public result addNideshopProduct(nideshopProduct newNideshopProduct){
        return resultUtils.success(nideshopProductRepository.save(newNideshopProduct));
    }
    @PostMapping (value = "/delete")
    public result deleteNideshopProduct(int id){
        throw new TSException("删除报错！",100);
    }
}
