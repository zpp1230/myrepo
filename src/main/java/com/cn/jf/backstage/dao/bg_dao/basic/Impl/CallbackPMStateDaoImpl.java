package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.CallbackPMStateDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.CallbackPMStateMapper;

@Repository("callbackPMStateDao")
public class CallbackPMStateDaoImpl implements CallbackPMStateDao {

	@SuppressWarnings("restriction")
	@Resource
    private  CallbackPMStateMapper  callbackPMStateMapper;
    
	public <ModelType> int insert(ModelType record) {

		return callbackPMStateMapper.insert(record);
	}

	public <ModelType> int updateByPrimaryKeySelective(ModelType record) {

		return callbackPMStateMapper.updateByPrimaryKeySelective(record);
	}

	public <ModelType> ModelType selectParams(Map<String, Object> params) {

		return callbackPMStateMapper.selectParams(params);
	}

	public <ModelType> int deleteByPrimarayKeyForModel(ModelType record) {

		return callbackPMStateMapper.deleteByPrimarayKeyForModel(record);
	}

	public int selectCount(Map<String, Object> params) {
	
		return callbackPMStateMapper.selectCount(params);
	}

	public <ModelType> int update(Map<String, Object> params) {
		return callbackPMStateMapper.update(params);
	}

}
