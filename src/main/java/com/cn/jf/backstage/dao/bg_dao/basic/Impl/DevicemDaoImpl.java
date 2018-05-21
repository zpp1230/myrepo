package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.DevicemDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.DevicemMapper;


@Repository("devicemDao")
public class DevicemDaoImpl implements DevicemDao {

	@Resource
	private DevicemMapper devicemMapper;
	

	@Override
	public <ModelType> List<ModelType> findByPage(String machCode, String machName) throws Exception {
		
		return devicemMapper.findByPage(machCode, machName);
	}

	@Override
	public <ModelType> Long findByCount(String machCode, String machName) throws Exception {
		
		return devicemMapper.findByCount(machCode, machName);
	}

	@Override
	public <ModelType> List<ModelType> findmachCodePage(String operatorID) throws Exception {
		
		return devicemMapper.findmachCodePage(operatorID);
	}

	@Override
	public <ModelType> Long findByOperCount(String operatorID) throws Exception {
		
		return devicemMapper.findByOperCount(operatorID);
	}

	@Override
	public <ModelType> ModelType findByMacAddr(String macAddr) throws Exception {
		
		return devicemMapper.findByMacAddr(macAddr);
	}

	@Override
	public <ModelType> ModelType findByMachCode(String machCode) throws Exception {
		
		return devicemMapper.findByMachCode(machCode);
	}

	@Override
	public <ModelType> List<ModelType> findmachCodePageAA(String emplCode) throws Exception {
		// TODO Auto-generated method stub
		return devicemMapper.findmachCodePageAA(emplCode);
	}

	@Override
	public <ModelType> Long findByOperCountAA(String emplCode) throws Exception {
		// TODO Auto-generated method stub
		return devicemMapper.findByOperCountAA(emplCode);
	}

	@Override
	public <ModelType> ModelType findOrderInfo(Map<String,Object> params) throws Exception {
		// TODO Auto-generated method stub
		return devicemMapper.findOrderInfo(params);
	}

}
