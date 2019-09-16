package com.taotieshop.demo.baby.controller;

import com.taotieshop.demo.baby.entity.BabyActive;
import com.taotieshop.demo.baby.service.BabyService;
import com.taotieshop.demo.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/wechat/baby")
public class BabyController {
    @Autowired
    private BabyService babyService;

    /**
     * 新增宝宝活动记录
     * @param babyActive
     */
    @PostMapping(value = "/addBabyActive")
    public void doAddBabyActive(@RequestBody BabyActive babyActive){
        babyService.doAddBabyActive(babyActive);
    }

    /**
     * 查询宝宝观测记录
     * @param openId
     * @return
     */
    @GetMapping(value = "/query")
    public Result queryBabyActive(@RequestParam(name = "openId") String openId){
        return babyService.queryBabyActive(openId);
    }
}
