package com.taotieshop.demo.dao;

import com.taotieshop.demo.entity.Star;
import com.taotieshop.demo.entity.StarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StarMapper {
    long countByExample(StarExample example);

    int deleteByExample(StarExample example);

    int insert(Star record);

    int insertSelective(Star record);

    List<Star> selectByExample(StarExample example);

    int updateByExampleSelective(@Param("record") Star record, @Param("example") StarExample example);

    int updateByExample(@Param("record") Star record, @Param("example") StarExample example);
}