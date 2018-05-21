package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;
import java.util.Map;

public interface MenuDao {
	public <ModelType> List<ModelType> findById(Map<String,Object> params)throws Exception;
	public <ModelType> List<ModelType> findByAllId()throws Exception;
}
