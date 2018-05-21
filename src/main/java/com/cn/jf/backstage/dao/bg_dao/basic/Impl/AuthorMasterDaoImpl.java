package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.AuthorMasterDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.AuthorMapper;

@Repository("authorMasterDao")
public class AuthorMasterDaoImpl implements AuthorMasterDao{

	@Resource
    private  AuthorMapper  authorMapper;
	
	public <ModelType> int insert(ModelType record){
		return this.authorMapper.insert(record);
	}

	public <ModelType> int updateByPrimaryKey(ModelType record){
		return this.authorMapper.updateByPrimaryKey(record);
	}

	public <ModelType> List<ModelType> selectParams(Map<String, Object> params){
		return this.authorMapper.selectParams(params);
	}

	public <ModelType> int deleteByPrimarayKeyForModel(ModelType record){
		return this.authorMapper.deleteByPrimarayKeyForModel(record);
	}

	public <ModelType> int deleteByPrimarayKey(Map<String, Object> params){
		return this.authorMapper.deleteByPrimarayKey(params);
	}

	public <ModelType> List<ModelType> serchRole(Map<String, Object> params){
		return authorMapper.serchRole(params);
	}

	public <ModelType> List<ModelType> serchRoleAutor(Map<String, Object> params){
		return authorMapper.serchRoleAutor(params);
	}

	public int deleteauthallot(Map<String, Object> params){
		return authorMapper.deleteauthallot(params);
	}

	public int insertauthallot(Map<String, Object> params){
		return authorMapper.insertauthallot(params);
	}

	public <ModelType> ModelType selectParamsEmplAutorInfo(Map<String, Object> params){
		return authorMapper.selectParamsEmplAutorInfo(params);
	}

}
