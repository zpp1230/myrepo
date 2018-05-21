package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AllotEmplCodeRoleMapper {

	public <ModelType> List<ModelType> findByEmplCode(@Param("emplCode") String emplCode) throws Exception;
	
}
