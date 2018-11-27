package com.taotieshop.demo.dao;

import com.taotieshop.demo.entity.Clock;
import com.taotieshop.demo.entity.ClockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClockMapper {
    long countByExample(ClockExample example);

    int deleteByExample(ClockExample example);

    int insert(Clock record);

    int insertSelective(Clock record);

    List<Clock> selectByExample(ClockExample example);

    int updateByExampleSelective(@Param("record") Clock record, @Param("example") ClockExample example);

    int updateByExample(@Param("record") Clock record, @Param("example") ClockExample example);
}