package com.taotieshop.demo.dao;

import com.taotieshop.demo.entity.Exchange;
import com.taotieshop.demo.entity.ExchangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExchangeMapper {
    long countByExample(ExchangeExample example);

    int deleteByExample(ExchangeExample example);

    int insert(Exchange record);

    int insertSelective(Exchange record);

    List<Exchange> selectByExample(ExchangeExample example);

    int updateByExampleSelective(@Param("record") Exchange record, @Param("example") ExchangeExample example);

    int updateByExample(@Param("record") Exchange record, @Param("example") ExchangeExample example);
}