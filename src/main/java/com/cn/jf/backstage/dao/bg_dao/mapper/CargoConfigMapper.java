package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 货道配置接口
 * */
public interface CargoConfigMapper {

	public <ModelType> List<ModelType> findByMachCode(@Param("machCode") String machCode) throws Exception;
	
	public <ModelType> ModelType findByEmplCode(@Param("emplCode") String emplCode) throws Exception;
}
