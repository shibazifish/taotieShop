package com.taotieshop.demo.wechat.service.impl;

import com.taotieshop.demo.dao.PrizeMapper;
import com.taotieshop.demo.dao.SysParameterMapper;
import com.taotieshop.demo.entity.*;
import com.taotieshop.demo.utils.ResultUtils;
import com.taotieshop.demo.wechat.service.PrizeService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 任务：
 * 描述：
 * 作者：李宇
 * 时间：2018/11/2715:29
 * 类名: ActivityServiceImpl
 */
@Component
public class PrizeServiceImpl implements PrizeService {

    @Resource
    private PrizeMapper prizeMapper;

    @Resource
    private SysParameterMapper sysParameterMapper;
    /**
     * 任务：
     * 描述：获取所有奖品信息
     * 作者：李宇
     * 时间：2018/12/1 16:55
    */
    @Override
    public Result getPrizeInfo() {
        //查询奖品
        PrizeExample prizeExample = new PrizeExample();
        prizeExample.setOrderByClause("goods_order");
        List<Prize> activityList = prizeMapper.selectByExample(prizeExample);

        //查询公告
        SysParameterExample sysParameterExample = new SysParameterExample();
        SysParameterExample.Criteria criteria = sysParameterExample.createCriteria();
        criteria.andPara_codeEqualTo("NOTICE_CONTENT");
        SysParameter sysParameter =sysParameterMapper.selectByExample(sysParameterExample).get(0);

        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("prize",activityList);
        resultMap.put("notice",sysParameter);
        return ResultUtils.success(resultMap);
    }

    /**
     * 任务：
     * 描述：根据id查询奖品信息
     * 作者：李宇
     * 时间：2018/12/1 16:55
    */
    @Override
    public Result getPrizeById(int activityId) {
        PrizeExample prizeExample = new PrizeExample();
        PrizeExample.Criteria criteria = prizeExample.createCriteria();
        criteria.andGoods_idEqualTo(activityId);
        List<Prize> prizes = prizeMapper.selectByExampleWithBLOBs(prizeExample);
        return ResultUtils.success(prizes.get(0));
    }
}
