package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.AuthorRoleModelDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.AuthorRoleModelMapper;


@Repository("authorRoleModelDao")
public class AuthorRoleModelDaoImpl implements AuthorRoleModelDao {

	@Resource
	private AuthorRoleModelMapper authorRoleModelMapper;
	
	
	@Override
	public <ModelType> ModelType findByRoleId(int roleId,String menuid) throws Exception {
		
		return authorRoleModelMapper.findByRoleId(roleId,menuid);
	}

}
