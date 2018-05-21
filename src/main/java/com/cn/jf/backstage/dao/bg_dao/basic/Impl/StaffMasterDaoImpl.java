package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.StaffMasterDao;
import com.cn.jf.backstage.dao.bg_dao.entity.StaffMaster;
import com.cn.jf.backstage.dao.bg_dao.mapper.StaffMasterMapper;

@Repository("staffMasterDao")
public class StaffMasterDaoImpl implements StaffMasterDao {
	@Resource
    private  StaffMasterMapper  staffMasterMapper;
	
	public <ModelType> int deleteById(ModelType modelType) throws Exception {        
		return staffMasterMapper.deleteByPrimarayKeyForModel(modelType);
	}

	public <ModelType> int add(ModelType modelType) throws Exception {
		System.out.println(((StaffMaster)modelType).getEmplCode());
		return staffMasterMapper.insert((StaffMaster)modelType);
	}

	public <ModelType> ModelType findById(ModelType modelType) throws Exception {
		 return staffMasterMapper.selectByPrimaryKey(modelType);
	}

	public <ModelType> List<ModelType> findByBiz(ModelType modelType, Map<String, Object> params) throws Exception {
		return staffMasterMapper.selectByParams(modelType, params);
	}

	public <ModelType> int modifyById(ModelType modelType) throws Exception {
		return staffMasterMapper.updateByPrimaryKey(modelType);
	}

	public int findCount(Map<String, Object> params) throws Exception {
		return staffMasterMapper.selectCount(params);
	}

	public <ModelType> List<ModelType> findByPage(String orderByField, String orderBy,
			Map<String, Object> params) throws Exception {
		return staffMasterMapper.selectByPage(orderByField, orderBy, params);
	}

	public <ModelType> List<ModelType> findByParams(Map<String, Object> params) throws Exception {
		return staffMasterMapper.selectParams(params);
	}

	public <ModelType> List<ModelType> findByParam(Map<String, Object> params) throws Exception {
		return staffMasterMapper.selectParam(params);
	}

	public int findCount_1(Map<String, Object> params) throws Exception {
		return staffMasterMapper.selectCount_1(params);
	}

	public <ModelType> ModelType findByOneParams(Map<String, Object> params) throws Exception {
		// TODO Auto-generated method stub
		return staffMasterMapper.findByOneParams(params);
	}

	@Override
	public <ModelType> List<ModelType> findByParamsPermain(Map<String, Object> params) {
		
		return staffMasterMapper.findByParamsPermain(params);
	}

	@Override
	public <ModelType> List<ModelType> findByParamsReplenish(Map<String, Object> params) {
		
		return staffMasterMapper.findByParamsReplenish(params);
	}
}
