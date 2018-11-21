package com.taotieshop.demo.dao;

import com.taotieshop.demo.entity.Brand;
import com.taotieshop.demo.entity.BrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandMapper {
    long countByExample(BrandExample example);

    int deleteByExample(BrandExample example);

    int insert(Brand record);

    int insertSelective(Brand record);

    List<Brand> selectByExample(BrandExample example);

    int updateByExampleSelective(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByExample(@Param("record") Brand record, @Param("example") BrandExample example);
}