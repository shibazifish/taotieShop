package com.taotieshop.demo.wechat.controller;

import com.taotieshop.demo.entity.Exchange;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.wechat.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 任务：
 * 描述：兑换奖励
 * 作者：李宇
 * 时间：2018/11/2715:39
 * 类名: EnterController
 */
@RestController
@RequestMapping(value = "/wechat/exchange")
public class ExchangeController {
    @Autowired
    private ExchangeService exchangeService;
    @PostMapping(value = "/add")
    public Result addEnterInfo(@RequestBody Exchange exchange){
        return exchangeService.addExchange(exchange);
    }
    @GetMapping(value = "/get")
    public Result getExchange(@RequestParam(name = "prizeId") String prizeId){
        return exchangeService.getExchange(prizeId);
    }
}
