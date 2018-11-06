package com.taotieshop.demo.controller;

import com.taotieshop.demo.comm.TSException;
import com.taotieshop.demo.entity.NideshopProduct;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.repository.nideshopProductRepository;
import com.taotieshop.demo.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Result getAllNideshopProduct(){
        return ResultUtils.success(nideshopProductRepository.findAll());
    }
    @PostMapping (value = "/add")
    public Result addNideshopProduct(NideshopProduct newNideshopProduct){
        return ResultUtils.success(nideshopProductRepository.save(newNideshopProduct));
    }
    @PostMapping (value = "/delete")
    public Result deleteNideshopProduct(int id){
        throw new TSException("删除报错！",100);
    }
}
