package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.CargoConfigDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.CargoConfigMapper;


@Repository("cargoConfigDao")
public class CargoConfigDaoImpl implements CargoConfigDao {

	
	@Resource
	private CargoConfigMapper cargoConfigMapper;
	
	
	@Override
	public <ModelType> List<ModelType> findByMachCode(String machCode) throws Exception {
		
		return cargoConfigMapper.findByMachCode(machCode);
	}


	@Override
	public <ModelType> ModelType findByEmplCode(String emplCode) throws Exception {
		
		return cargoConfigMapper.findByEmplCode(emplCode);
	}

}
