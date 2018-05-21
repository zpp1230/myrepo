package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.Map;

public interface LoginUserDao {
	public <ModelType> ModelType findById(Map<String,Object> params)throws Exception;
	public <ModelType> int modifyById(Map<String,Object> params)throws Exception;
}
