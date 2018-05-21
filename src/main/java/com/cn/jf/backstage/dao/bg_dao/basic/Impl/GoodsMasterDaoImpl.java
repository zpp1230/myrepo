package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.GoodsMasterDao;
import com.cn.jf.backstage.dao.bg_dao.entity.GoodsMaster;
import com.cn.jf.backstage.dao.bg_dao.entity.StaffMaster;
import com.cn.jf.backstage.dao.bg_dao.mapper.GoodsMasterMapper;

@Repository("goodsMasterDao")
public class GoodsMasterDaoImpl implements GoodsMasterDao {
	@Resource
    private  GoodsMasterMapper  goodsMasterMapper;
	
	public <ModelType> int deleteById(ModelType modelType) throws Exception {        
		return goodsMasterMapper.deleteByPrimarayKeyForModel(modelType);
	}

	public <ModelType> int add(ModelType modelType) throws Exception {
		return goodsMasterMapper.insert((GoodsMaster)modelType);
	}

	public <ModelType> ModelType findById(ModelType modelType) throws Exception {
		 return goodsMasterMapper.selectByPrimaryKey(modelType);
	}

	public <ModelType> List<ModelType> findByBiz(ModelType modelType, Map<String, Object> params) throws Exception {
		return goodsMasterMapper.selectByParams(modelType, params);
	}

	public <ModelType> int modifyById(ModelType modelType) throws Exception {
		return goodsMasterMapper.updateByPrimaryKey(modelType);
	}

	public int findCount(Map<String, Object> params) throws Exception {
		return goodsMasterMapper.selectCount(params);
	}

	public <ModelType> List<ModelType> findByPage(String orderByField, String orderBy,
			Map<String, Object> params) throws Exception {
		return goodsMasterMapper.selectByPage(orderByField, orderBy, params);
	}

	public <ModelType> List<ModelType> findByParams(Map<String, Object> params) throws Exception {
		return goodsMasterMapper.selectParams(params);
	}

	@Override
	public <ModelType> ModelType findByNumParams(Map<String, Object> params) throws Exception {
		// TODO Auto-generated method stub
		return goodsMasterMapper.findByNumParams(params);
	}
}
