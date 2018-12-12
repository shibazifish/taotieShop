package com.taotieshop.demo.dao;

import com.taotieshop.demo.entity.SysParameter;
import com.taotieshop.demo.entity.SysParameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysParameterMapper {
    long countByExample(SysParameterExample example);

    int deleteByExample(SysParameterExample example);

    int insert(SysParameter record);

    int insertSelective(SysParameter record);

    List<SysParameter> selectByExample(SysParameterExample example);

    int updateByExampleSelective(@Param("record") SysParameter record, @Param("example") SysParameterExample example);

    int updateByExample(@Param("record") SysParameter record, @Param("example") SysParameterExample example);
}