package com.cn.jf.backstage.dao.bg_dao.basic;

import com.cn.jf.backstage.dao.bg_dao.entity.Hdpz;

public interface HdpzDao {

	public <ModelType> Hdpz getHdpzByOperatorID(String operatorID) throws Exception;
}
