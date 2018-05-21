package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.PayOrderStatisticDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.PayOrderStatisticMapper;


@Repository("payOrderStatisticDao")
public class PayOrderStatisticDaoImpl implements PayOrderStatisticDao {

	
	@Resource
	private PayOrderStatisticMapper payOrderStatisticMapper;
	
	
	@Override
	public <ModelType> ModelType findOperWithEmpCode(String emplCode) throws Exception {
		
		return payOrderStatisticMapper.findOperWithEmpCode(emplCode);
	}

	@Override
	public <ModelType> List<ModelType> findMachWithOper(String operatorID) throws Exception {
		
		return payOrderStatisticMapper.findMachWithOper(operatorID);
	}

	@Override
	public <ModelType> List<ModelType> findGoodsWithMachCode(String machCode) throws Exception {
		
		return payOrderStatisticMapper.findGoodsWithMachCode(machCode);
	}

	@Override
	public <ModelType> List<ModelType> findGoodsWithOper(String operatorID) throws Exception {
		
		return payOrderStatisticMapper.findGoodsWithOper(operatorID);
	}

	@Override
	public <ModelType> List<ModelType> findPay(String macaddress, String openid, String buyer_id)
			throws Exception {
		
		return payOrderStatisticMapper.findPay(macaddress, openid, buyer_id);
	}

	@Override
	public <ModelType> List<ModelType> findMachWithOperAA(String emplCode) throws Exception {
		// TODO Auto-generated method stub
		return payOrderStatisticMapper.findMachWithOperAA(emplCode);
	}

}
