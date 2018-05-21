package com.cn.jf.backstage.dao.bg_dao.basic.Impl;


import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import com.cn.jf.backstage.dao.bg_dao.basic.PayDao;
import com.cn.jf.backstage.dao.bg_dao.entity.Pay;
import com.cn.jf.backstage.dao.bg_dao.mapper.PayMapper;

@Repository("PayDao")
public class PayDaoImpl implements PayDao{
    @Resource 
    private PayMapper payMapper;

	public int save(Pay pay) throws Exception {
		
		return payMapper.save(pay);
	}

	public List<Pay> find(String s_user, int start, int size, String operatorID) throws Exception {
		
		return payMapper.find(s_user,start,size,operatorID);
	}

	public Long getTotal(String s_user, String operatorID) throws Exception {
		
		return payMapper.getTotal(s_user,operatorID);
	}

	public int detetePay(Integer id) throws Exception {
		
		return  payMapper.detetePay(id);
	}


	public Pay getPayById(Integer id) throws Exception {
		
		return payMapper.getPayById(id);
	}


	public int updateById(Pay pay) throws Exception {
		
		return payMapper.updateById(pay);
	}


	public int updateById1(Pay pay) throws Exception {
		
		return payMapper.updateById1(pay);
	}
	
}
