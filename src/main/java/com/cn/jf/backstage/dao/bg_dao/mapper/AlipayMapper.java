package com.cn.jf.backstage.dao.bg_dao.mapper;

import com.cn.jf.backstage.dao.bg_dao.entity.Pay;

public interface AlipayMapper {
	public Pay getPayObj(String id) throws Exception;
}
