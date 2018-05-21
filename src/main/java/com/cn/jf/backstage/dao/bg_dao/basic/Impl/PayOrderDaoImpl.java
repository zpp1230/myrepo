package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.PayOrderDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.PayOrderMapper;

@Repository("payOrderDao")
public class PayOrderDaoImpl implements PayOrderDao {

	@Resource
    private    PayOrderMapper  payOrderMapper;
	public <ModelType> int insert(ModelType record) {

		return payOrderMapper.insert(record);
	}
	public <ModelType> List<ModelType> selectParams(Map<String, Object> params) {

		return payOrderMapper.selectParams(params);
	}
	public int selectCount(Map<String, Object> params) {
		
		return payOrderMapper.selectCount(params);
	}
	public int updateByPrimaryKey(Map<String, Object> params) {
		
		return payOrderMapper.updateByPrimaryKey(params);
	}
	public <ModelType> int insert_pm_wares(ModelType record) {
		return payOrderMapper.insert_pm_wares(record);
	}
	public <ModelType> int insert_pm_refund(ModelType record) {
		return payOrderMapper.insert_pm_refund(record);
	}
	public int updateByPrimaryCargo(Map<String, Object> params) {
		return payOrderMapper.updateByPrimaryCargo(params);
	}
	
}
