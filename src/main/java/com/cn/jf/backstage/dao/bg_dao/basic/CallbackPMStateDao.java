package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CallbackPMStateDao {
	public <ModelType> int insert(ModelType record);
    public <ModelType> int updateByPrimaryKeySelective(ModelType record);
    public <ModelType> ModelType selectParams(@Param("params")Map<String,Object> params);
    public <ModelType> int deleteByPrimarayKeyForModel(ModelType record);
    public int selectCount(@Param("params")Map<String,Object> params);
    public <ModelType> int update(@Param("params")Map<String,Object> params);
}
