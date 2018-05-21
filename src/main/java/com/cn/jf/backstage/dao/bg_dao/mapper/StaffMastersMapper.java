package com.cn.jf.backstage.dao.bg_dao.mapper;

import org.apache.ibatis.annotations.Param;

public interface StaffMastersMapper {

	public String getOperatorId(@Param("emplCode") String emplCode) throws Exception;

	public String getPosition(@Param("emplCode") String emplCode) throws Exception;

}
