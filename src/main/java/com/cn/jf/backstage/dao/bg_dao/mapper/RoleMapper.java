package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
	public <ModelType> int insert(ModelType record);
	public <ModelType> int updateByPrimaryKey(ModelType record);
    public <ModelType> List<ModelType> selectParams(@Param("params")Map<String,Object> params);
    public <ModelType> int findCount(@Param("params")Map<String,Object> params);
    public <ModelType> int deleteByPrimarayKeyForModel(ModelType record);
}