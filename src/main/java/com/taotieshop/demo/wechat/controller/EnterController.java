package com.taotieshop.demo.wechat.controller;

import com.taotieshop.demo.entity.Enter;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.wechat.service.EnterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: 李宇
 * @Date: 2019/1/5 12:20
 * @Description:
 */
@RestController
@RequestMapping(value = "/wechat/enter")
public class EnterController {
    @Autowired
    private EnterService enterService;

    /**
     * 任务：
     * 描述：报名
     * 作者：李宇
     * 时间：2019/1/3 14:42
     */
    @PostMapping(value = "/add")
    public Result addEnter(@RequestBody Enter enter){
        return enterService.addEnter(enter);
    }
    /**
     * 任务：
     * 描述：查询所有的报名信息
     * 作者：李宇
     * 时间：2019/1/3 14:43
     */
    @GetMapping(value = "/get")
    public Result getEnterList(@RequestParam(name = "activity_id") int activityId){
        return enterService.getEnterList(activityId);
    }
    /**
     * 任务：
     * 描述：按照id查询报名信息
     * 作者：李宇
     * 时间：2019/1/3 14:43
     */
    @GetMapping(value = "/info")
    public Result queryActivity(@RequestParam(name = "enterId") int enterId){
        return enterService.queryEnterInfo(enterId);
    }
    @PostMapping(value = "/audit")
    public Result doAudit(@RequestBody Enter enter){
        return enterService.doAudit(enter);
    }
}
