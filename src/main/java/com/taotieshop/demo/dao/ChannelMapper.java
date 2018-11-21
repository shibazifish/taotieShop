package com.taotieshop.demo.dao;

import com.taotieshop.demo.entity.Channel;
import com.taotieshop.demo.entity.ChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelMapper {
    long countByExample(ChannelExample example);

    int deleteByExample(ChannelExample example);

    int insert(Channel record);

    int insertSelective(Channel record);

    List<Channel> selectByExample(ChannelExample example);

    int updateByExampleSelective(@Param("record") Channel record, @Param("example") ChannelExample example);

    int updateByExample(@Param("record") Channel record, @Param("example") ChannelExample example);
}