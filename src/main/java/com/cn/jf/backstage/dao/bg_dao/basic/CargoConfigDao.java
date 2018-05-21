package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;



public interface CargoConfigDao {

	public <ModelType> List<ModelType> findByMachCode(String machCode) throws Exception;
	
	public <ModelType> ModelType findByEmplCode(String emplCode) throws Exception;
}
