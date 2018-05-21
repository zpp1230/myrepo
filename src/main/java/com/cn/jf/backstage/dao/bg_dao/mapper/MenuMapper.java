package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    public <ModelType> List<ModelType> selectParams(@Param("params")Map<String,Object> params);
    public <ModelType> List<ModelType> selectAllParams();
}