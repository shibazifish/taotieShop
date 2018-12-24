package com.taotieshop.demo.wechat.service.impl;

import com.taotieshop.demo.dao.StarMapper;
import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.entity.Star;
import com.taotieshop.demo.entity.StarExample;
import com.taotieshop.demo.utils.ResultUtils;
import com.taotieshop.demo.wechat.service.StarService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 李宇
 * @Date: 2018/12/23 12:14
 * @Description:
 */
@Component
public class StarServiceImpl implements StarService{
    @Resource
    private StarMapper starMapper;
    @Override
    public Result getStarInfo() {
        List<Star> stars = starMapper.selectByExample(null);
        return ResultUtils.success(stars);
    }

    @Override
    public Result queryStarInfo(int id) {
        StarExample starExample = new StarExample();
        StarExample.Criteria criteria = starExample.createCriteria();
        criteria.andStar_idEqualTo(id);

        Star star = starMapper.selectByExample(starExample).get(0);

        return ResultUtils.success(star);
    }
}
