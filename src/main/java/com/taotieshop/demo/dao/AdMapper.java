package com.taotieshop.demo.dao;

import com.taotieshop.demo.entity.Ad;
import com.taotieshop.demo.entity.AdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdMapper {
    long countByExample(AdExample example);

    int deleteByExample(AdExample example);

    int insert(Ad record);

    int insertSelective(Ad record);

    List<Ad> selectByExampleWithBLOBs(AdExample example);

    List<Ad> selectByExample(AdExample example);

    int updateByExampleSelective(@Param("record") Ad record, @Param("example") AdExample example);

    int updateByExampleWithBLOBs(@Param("record") Ad record, @Param("example") AdExample example);

    int updateByExample(@Param("record") Ad record, @Param("example") AdExample example);
}