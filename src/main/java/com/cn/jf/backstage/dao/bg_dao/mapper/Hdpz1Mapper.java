package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.cn.jf.backstage.dao.bg_dao.entity.Hdpz1;

public interface Hdpz1Mapper {

	public <ModelType> int save(Hdpz1 hdpz1) throws Exception;

	public int deleteHdpz1(String id) throws Exception;
	
	public List<Hdpz1> getHdpz1ByMachCode(@Param("machCode") String machCode) throws Exception;
	
	public int updateHdpz1(Hdpz1 hdpz1) throws Exception;

	public int getSize1(@Param("machCode") String machCode) throws Exception;

	public int getSize2(@Param("machCode") String machCode) throws Exception;

	public int getSize3(@Param("machCode") String machCode) throws Exception;
	
	public List<String> getTier1(@Param("machCode") String machCode) throws Exception; 
	
	public List<String> getTier2(@Param("machCode") String machCode) throws Exception; 
	
	public List<String> getTier3(@Param("machCode") String machCode) throws Exception;
	
    public List<String> getTier1sz(@Param("machCode") String machCode) throws Exception; 
	
	public List<String> getTier2sz(@Param("machCode") String machCode) throws Exception; 
	
	public List<String> getTier3sz(@Param("machCode") String machCode) throws Exception;
	

	public int getSizesz1(@Param("machCode") String machCode) throws Exception;

	public int getSizesz2(@Param("machCode") String machCode) throws Exception;

	public int getSizesz3(@Param("machCode") String machCode) throws Exception; 
}
