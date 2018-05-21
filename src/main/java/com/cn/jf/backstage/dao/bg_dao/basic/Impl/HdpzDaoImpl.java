package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import com.cn.jf.backstage.dao.bg_dao.basic.HdpzDao;
import com.cn.jf.backstage.dao.bg_dao.entity.Hdpz;
import com.cn.jf.backstage.dao.bg_dao.mapper.HdpzMapper;


@Repository("HdpzDao")
public class HdpzDaoImpl implements HdpzDao{
	@Resource
	private HdpzMapper hdpzMapper;
	
	public <ModelType> Hdpz getHdpzByOperatorID(String operatorID) throws Exception {
	
		return hdpzMapper.getHdpzByOperatorID(operatorID);
	}

}
