package com.taotieshop.demo.dao;

import com.taotieshop.demo.entity.WechatUser;
import com.taotieshop.demo.entity.WechatUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatUserMapper {
    long countByExample(WechatUserExample example);

    int deleteByExample(WechatUserExample example);

    int insert(WechatUser record);

    int insertSelective(WechatUser record);

    List<WechatUser> selectByExample(WechatUserExample example);

    int updateByExampleSelective(@Param("record") WechatUser record, @Param("example") WechatUserExample example);

    int updateByExample(@Param("record") WechatUser record, @Param("example") WechatUserExample example);

    int updateRunData(WechatUser record);

}