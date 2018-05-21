package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.AllotEmplCodeRoleDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.AllotEmplCodeRoleMapper;


@Repository("allotEmplCodeRoleDao")
public class AllotEmplCodeRoleDaoImpl implements AllotEmplCodeRoleDao {

	@Resource
	private AllotEmplCodeRoleMapper allotEmplCodeRoleMapper;

	@Override
	public <ModelType> List<ModelType> findByEmplCode(String emplCode) throws Exception{
		return allotEmplCodeRoleMapper.findByEmplCode(emplCode);
	}

}
