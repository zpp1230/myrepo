package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.Map;

import com.cn.jf.backstage.dao.bg_dao.entity.Pay;

public interface AlipayDao {
	 public Pay getPayObj(Map<String,Object> params) throws Exception;
}
