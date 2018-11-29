package com.taotieshop.demo.wechat.controller;

import com.taotieshop.demo.entity.Enter;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.wechat.service.EnterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/2715:39
 * 类名: EnterController
 */
@RestController
@RequestMapping(value = "/wechat/enter")
public class EnterController {
    @Autowired
    private EnterService enterService;
    @PostMapping(value = "/add")
    public Result addEnterInfo(@RequestBody Enter enter){
        return enterService.addEnter(enter);
    }
}
