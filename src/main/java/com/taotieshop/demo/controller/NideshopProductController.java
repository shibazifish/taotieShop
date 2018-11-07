package com.taotieshop.demo.controller;

import com.taotieshop.demo.comm.ExceptionEnum;
import com.taotieshop.demo.comm.TSException;
import com.taotieshop.demo.entity.NideshopProduct;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.repository.NideshopProductRepository;
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
public class NideshopProductController {
    @Autowired
    private NideshopProductRepository NideshopProductRepository;
    @GetMapping (value = "/get")
    public Result getAllNideshopProduct(){
        return ResultUtils.success(NideshopProductRepository.findAll());
    }
    @PostMapping (value = "/add")
    public Result addNideshopProduct(NideshopProduct nideshopProduct){
        return ResultUtils.success(NideshopProductRepository.save(nideshopProduct));
    }
    @GetMapping (value = "/delete")
    public Result deleteNideshopProduct(){
        throw new TSException(ExceptionEnum.DELETE_EXCEPTION);
    }
}
