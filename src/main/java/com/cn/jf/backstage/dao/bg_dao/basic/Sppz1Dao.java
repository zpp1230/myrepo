package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;

import com.cn.jf.backstage.dao.bg_dao.entity.Sppz1;

public interface Sppz1Dao {

	public int deleteSppz1(String machCode) throws Exception;

	public List<Sppz1> getSppz1ByMachCode(String machCode) throws Exception;

	public int save(Sppz1 sppz1) throws Exception;

	public int deletesSppz1(String string6, String machCode) throws Exception;
	

}
