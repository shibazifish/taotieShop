package com.taotieshop.demo.wechat.controller;

import com.taotieshop.demo.entity.Clock;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.wechat.service.ClockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/2715:44
 * 类名: ClockController
 */
@RestController
@RequestMapping(value = "/wechat/clock")
public class ClockController {
    @Autowired
    private ClockService clockService;
    @PostMapping(value = "/add")
    public Result addClockInfo(@RequestBody Map<String,String> requestMap){
        return clockService.addClockInfo(requestMap);
    }
    @GetMapping(value = "/info")
    public Result getClockInfo(@RequestParam(name = "open_id") String open_id){
        return clockService.getClockInfo(open_id);
    }
}
