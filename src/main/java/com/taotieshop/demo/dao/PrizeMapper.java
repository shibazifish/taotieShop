package com.taotieshop.demo.dao;

import com.taotieshop.demo.entity.Prize;
import com.taotieshop.demo.entity.PrizeExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PrizeMapper {
    long countByExample(PrizeExample example);

    int deleteByExample(PrizeExample example);

    int insert(Prize record);

    int insertSelective(Prize record);

    List<Prize> selectByExampleWithBLOBs(PrizeExample example);

    List<Prize> selectByExample(PrizeExample example);

    int updateByExampleSelective(@Param("record") Prize record, @Param("example") PrizeExample example);

    int updateByExampleWithBLOBs(@Param("record") Prize record, @Param("example") PrizeExample example);

    int updateByExample(@Param("record") Prize record, @Param("example") PrizeExample example);

    int updateGoodsNum(@Param("record") Prize record);

    List<Map<String,Object>> selectById(@Param("prizeId") String prizeId);
}