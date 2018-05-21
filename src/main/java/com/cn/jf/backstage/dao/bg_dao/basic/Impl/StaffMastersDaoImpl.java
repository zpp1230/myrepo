package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import com.cn.jf.backstage.dao.bg_dao.basic.StaffMastersDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.StaffMastersMapper;
@Repository("StaffMastersDao")
public class StaffMastersDaoImpl implements StaffMastersDao{

	@Resource
	private StaffMastersMapper staffMastersMapper;
	
	public String getOperatorId(String emplCode) throws Exception {
	
		return staffMastersMapper.getOperatorId(emplCode);
	}

	
	public String getPosition(String emplCode) throws Exception {
		
		return staffMastersMapper.getPosition(emplCode);
	}

}
