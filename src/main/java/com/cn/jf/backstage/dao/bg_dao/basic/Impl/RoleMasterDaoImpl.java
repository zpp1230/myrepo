package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.RoleMasterDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.RoleMapper;

@Repository("roleMasterDao")
public class RoleMasterDaoImpl implements RoleMasterDao {

	@Resource
    private  RoleMapper  roleMapper;
	
	public <ModelType> int insert(ModelType record) {
		return this.roleMapper.insert(record);
	}

	public <ModelType> int updateByPrimaryKey(ModelType record) {
		return this.roleMapper.updateByPrimaryKey(record);
	}

	public <ModelType> List<ModelType> selectParams(Map<String, Object> params) {
		return this.roleMapper.selectParams(params);
	}

	public <ModelType> int deleteByPrimarayKeyForModel(ModelType record) {
		return this.roleMapper.deleteByPrimarayKeyForModel(record);
	}

	public <ModelType> int findCount(Map<String, Object> params) {
		return this.roleMapper.findCount(params);
	}

}
