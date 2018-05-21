package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface LoginUserMapper {
    public <ModelType> ModelType selectParams(@Param("params")Map<String,Object> params);
    public <ModelType> int updateByPrimaryKey(@Param("params")Map<String,Object> params);
}
