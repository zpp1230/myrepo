package com.cn.jf.backstage.dao.bg_dao.basic;


public interface AuthorRoleModelDao {

	public <ModelType> ModelType findByRoleId(int roleId,String menuid) throws Exception;
}
