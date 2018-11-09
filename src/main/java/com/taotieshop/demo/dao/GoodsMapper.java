package com.taotieshop.demo.dao;

import java.util.List;

import com.github.pagehelper.Page;
import com.taotieshop.demo.entity.Goods;
import com.taotieshop.demo.entity.GoodsExample;
import org.apache.ibatis.annotations.Param;

public interface GoodsMapper {
    int countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExampleWithBLOBs(GoodsExample example);

    Page<Goods> selectByExample(GoodsExample example);

    Page<Goods> findAllByPage();

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);
}