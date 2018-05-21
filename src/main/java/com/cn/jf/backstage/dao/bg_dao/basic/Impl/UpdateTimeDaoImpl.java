package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.UpdateTimeDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.UpdateTimeMapper;



@Repository("updateTimeDao")
public class UpdateTimeDaoImpl implements UpdateTimeDao {

	@Resource
	private UpdateTimeMapper updateTimeMapper;
	
	
	@Override
	public <ModelType> List<ModelType> findByDev(String deviceId) throws Exception {
		
		return updateTimeMapper.findByDev(deviceId);
	}

	@Override
	public <ModelType> int deleteDevUpdateTime(String deviceId) throws Exception {
		
		return updateTimeMapper.deleteDevUpdateTime(deviceId);
	}

	@Override
	public <ModelType> int addDevUpdateTime(ModelType modelType) throws Exception {
		
		return updateTimeMapper.addDevUpdateTime(modelType);
	}

	@Override
	public <ModelType> ModelType findByGoodsId(String goodsId, String deviceId) throws Exception {
		
		return updateTimeMapper.findByGoodsId(goodsId, deviceId);
	}

	
	
}
