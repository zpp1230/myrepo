package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;


public interface AllotEmplCodeRoleDao {

	public <ModelType> List<ModelType> findByEmplCode(String emplCode) throws Exception;
}
