package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.ReplenInformationDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.ReplenInformationMapper;


@Repository("replenInformationDao")
public class ReplenInformationDaoImpl implements ReplenInformationDao {

	
	@Resource
	private ReplenInformationMapper replenInformationMapper;
	
	
	@Override
	public <ModelType> List<ModelType> findByMachCode(String machCode) throws Exception {
		
		return replenInformationMapper.findByMachCode(machCode);
	}

	@Override
	public <ModelType> int addReplenInformation(ModelType modelType) throws Exception {
		
		return replenInformationMapper.addReplenInformation(modelType);
	}

	@Override
	public <ModelType> int updateReplenInformation(ModelType modelType) throws Exception {
		
		return replenInformationMapper.updateReplenInformation(modelType);
	}

	@Override
	public <ModelType> int deleteReplenInformation(ModelType modelType) throws Exception {
		
		return replenInformationMapper.deleteReplenInformation(modelType);
	}

	@Override
	public <ModelType> ModelType findByMachCodeAndCargo(String machCode, String cargoData) throws Exception {
		
		return replenInformationMapper.findByMachCodeAndCargo(machCode, cargoData);
	}

}
