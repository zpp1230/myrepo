package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;

import com.cn.jf.backstage.dao.bg_dao.entity.Hdpz1;

public interface Hdpz1Dao {
	public <ModelType> int save(Hdpz1 hdpz1) throws Exception;
	
	public int deleteHdpz1(String id) throws Exception;
	
	public List<Hdpz1> getHdpz1ByMachCode(String machCode) throws Exception;
	
	public int updateHdpz1(Hdpz1 hdpz1) throws Exception;

	public int getSize1(String machCode) throws Exception;

	public int getSize2(String machCode) throws Exception;

	public int getSize3(String machCode) throws Exception;
	
	public List<String> getTier1(String machCode) throws Exception;
	
	public List<String> getTier2(String machCode) throws Exception;
	
	public List<String> getTier3(String machCode) throws Exception;
	
    public List<String> getTier1sz(String machCode) throws Exception;
	
	public List<String> getTier2sz(String machCode) throws Exception;
	
	public List<String> getTier3sz(String machCode) throws Exception;

	public int getSizesz1(String machCode) throws Exception;

	public int getSizesz2(String machCode) throws Exception;

	public int getSizesz3(String machCode) throws Exception;

}
