package com.taotieshop.demo.dao;

import com.taotieshop.demo.entity.Enter;
import com.taotieshop.demo.entity.EnterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterMapper {
    long countByExample(EnterExample example);

    int deleteByExample(EnterExample example);

    int insert(Enter record);

    int insertSelective(Enter record);

    List<Enter> selectByExample(EnterExample example);

    int updateByExampleSelective(@Param("record") Enter record, @Param("example") EnterExample example);

    int updateByExample(@Param("record") Enter record, @Param("example") EnterExample example);

    int updateStatusById(@Param("record") Enter record);
}