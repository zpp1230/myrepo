package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;

import com.cn.jf.backstage.dao.bg_dao.entity.Pay;

public interface PayDao {

	int save(Pay pay) throws Exception;

	List<Pay> find(String s_user, int start, int size, String operatorID) throws Exception;

	Long getTotal(String s_user, String operatorID) throws Exception;

	int detetePay(Integer id) throws Exception;

	Pay getPayById(Integer id) throws Exception;

	int updateById(Pay pay) throws Exception;

	int updateById1(Pay pay) throws Exception;

	
}
