package com.taotieshop.demo.service.impl;

import com.taotieshop.demo.entity.Result;
import com.taotieshop.demo.repository.NideshopGoodsRepository;
import com.taotieshop.demo.service.GoodsService;
import com.taotieshop.demo.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

/**
 * @Auther: 李宇
 * @Date: 2018/11/8 22:37
 * @Description:
 */
@Component
public class GoodsServiceImol implements GoodsService {
    @Autowired
    private NideshopGoodsRepository nideshopGoodsRepository;
    @Override
    public Result getGoodsList(Integer page,Integer size) {
        Pageable pageable = new PageRequest(page, size);
        return ResultUtils.success(nideshopGoodsRepository.findAll(pageable));
    }
}
