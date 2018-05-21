package com.cn.jf.backstage.dao.bg_dao.mapper;

import com.cn.jf.backstage.dao.bg_dao.entity.Hdpz;

public interface HdpzMapper {

	public <ModelType> Hdpz getHdpzByOperatorID(String operatorID) throws Exception;
}
