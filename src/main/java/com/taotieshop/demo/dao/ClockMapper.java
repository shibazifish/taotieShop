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

    int countOneDayRecord(Clock record);

    int updateByDay(Clock record);
    //打卡表清零
    int updateClearIce(Clock record);
    //打卡表清零
    int updateInviterIce(Clock record);
    //查询需要提醒打卡的人员信息
    List<Clock> queryScheduleInfo();
}