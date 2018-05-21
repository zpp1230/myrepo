package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.DeviceMasterDao;
import com.cn.jf.backstage.dao.bg_dao.entity.DeviceMaster;
import com.cn.jf.backstage.dao.bg_dao.entity.StaffMaster;
import com.cn.jf.backstage.dao.bg_dao.mapper.DeviceMasterMapper;

@Repository("deviceMasterDao")
public class DeviceMasterDaoImpl implements DeviceMasterDao {
	@Resource
    private  DeviceMasterMapper  deviceMasterMapper;
	
	public <ModelType> int deleteById(ModelType modelType) throws Exception {        
		return deviceMasterMapper.deleteByPrimarayKeyForModel(modelType);
	}

	public <ModelType> int add(ModelType modelType) throws Exception {
		return deviceMasterMapper.insert((DeviceMaster)modelType);
	}

	public <ModelType> ModelType findById(ModelType modelType) throws Exception {
		 return deviceMasterMapper.selectByPrimaryKey(modelType);
	}

	public <ModelType> List<ModelType> findByBiz(ModelType modelType, Map<String, Object> params) throws Exception {
		return deviceMasterMapper.selectByParams(modelType, params);
	}

	public <ModelType> int modifyById(ModelType modelType) throws Exception {
		return deviceMasterMapper.updateByPrimaryKey(modelType);
	}

	public int findCount(Map<String, Object> params) throws Exception {
		return deviceMasterMapper.selectCount(params);
	}

	public <ModelType> List<ModelType> findByPage(String orderByField, String orderBy,
			Map<String, Object> params) throws Exception {
		return deviceMasterMapper.selectByPage(orderByField, orderBy, params);
	}

	public <ModelType> List<ModelType> findByParams(Map<String, Object> params) throws Exception {
		return deviceMasterMapper.selectParams(params);
	}

	public <ModelType> List<ModelType> findByParamsOper() throws Exception {
		return deviceMasterMapper.findByParamsOper();
	}

	public <ModelType> List<ModelType> findByParamsModel() throws Exception {
		// TODO Auto-generated method stub
		return deviceMasterMapper.findByParamsModel();
	}
}
