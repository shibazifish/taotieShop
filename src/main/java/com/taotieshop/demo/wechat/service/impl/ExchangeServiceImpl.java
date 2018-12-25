package com.taotieshop.demo.wechat.service.impl;

import com.taotieshop.demo.dao.ClockMapper;
import com.taotieshop.demo.dao.ExchangeMapper;
import com.taotieshop.demo.dao.PrizeMapper;
import com.taotieshop.demo.dao.WechatUserMapper;
import com.taotieshop.demo.entity.*;
import com.taotieshop.demo.utils.IFUtil;
import com.taotieshop.demo.utils.ResultUtils;
import com.taotieshop.demo.wechat.service.ExchangeService;
import com.taotieshop.demo.wechat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 任务：
 * 描述：领奖记录表
 * 作者：李宇
 * 时间：2018/11/2715:36
 * 类名: EnterServiceImpl
 */
@Component
public class ExchangeServiceImpl implements ExchangeService{
    @Resource
    private ExchangeMapper exchangeMapper;
    @Resource
    private WechatUserMapper wechatUserMapper;
    @Resource
    private PrizeMapper prizeMapper;
    @Resource
    private ClockMapper clockMapper;
    @Autowired
    private UserService userService;
    /**
     * 任务：
     * 描述：兑换奖品
     * 作者：李宇
     * 时间：2018/12/24 9:17
    */
    @Override
    @Transactional
    public Result addExchange(Exchange exchange) {
        //更新用户运动步数和冰块数
        userService.updateRunData(exchange.getOpen_id());
        //通过奖品id和用户id查询能否兑换奖品
        WechatUserExample wechatUserExample = new WechatUserExample();
        WechatUserExample.Criteria criteria = wechatUserExample.createCriteria();
        criteria.andOpenIdEqualTo(exchange.getOpen_id());
        WechatUser wechatUsers = wechatUserMapper.selectByExample(wechatUserExample).get(0);

        //查询奖品信息表
        PrizeExample prizeExample = new PrizeExample();
        PrizeExample.Criteria prizeCriteria = prizeExample.createCriteria();
        prizeCriteria.andGoods_idEqualTo(exchange.getGoods_id());
        Prize prize = prizeMapper.selectByExample(prizeExample).get(0);

        //查询邀请人数
        WechatUserExample wechatUserExample1 = new WechatUserExample();
        WechatUserExample.Criteria criteria1 = wechatUserExample1.createCriteria();
        criteria1.andInviterEqualTo(exchange.getOpen_id());
        List<WechatUser> inviterUsers = wechatUserMapper.selectByExample(wechatUserExample1);


        int intVal = 0;
        if(prize.getGoods_num() <= 0){//库存不足
            return ResultUtils.error(-1,"库存不足");
        }
        if (wechatUsers.getIceData() >= prize.getGoods_ice()){
            if(inviterUsers.size() >= prize.getGoods_price()){//邀请用户数量是否达标
                exchange.setCreate_date(IFUtil.CurrentDate());
                //新增领奖记录
                intVal = exchangeMapper.insert(exchange);
                //清空冰块
                wechatUsers.setIceData(0);
                wechatUserMapper.updateByExample(wechatUsers, wechatUserExample);//用户表冰块清空
                //打卡表冰块清空
                Clock clock = new Clock();
                clock.setOpen_id(exchange.getOpen_id());
                clock.setCreate_time(IFUtil.CurrentDate());
                clockMapper.updateClearIce(clock);
                //清空邀请数据
                wechatUserMapper.updateInviterData(exchange.getOpen_id());
                //奖品数量减一
                prize.setGoods_num(prize.getGoods_num()-1);
                prizeMapper.updateGoodsNum(prize);
                return ResultUtils.success("兑换成功！");
            }else{
                long finalInt = prize.getGoods_price() - inviterUsers.size();
                return ResultUtils.error(-3,"再邀请"+finalInt+"名好友即可解锁红包！" );
            }
        }else {
            return ResultUtils.error(-2,"可用冰块不足！" );
        }
    }

    /**
     * 获取兑奖记录
     * @param prizeId
     * @return
     */
    @Override
    public Result getExchange(String prizeId) {
        List<Map<String,Object>> mapList = exchangeMapper.selectById(prizeId);
        return ResultUtils.success(mapList);
    }
}
