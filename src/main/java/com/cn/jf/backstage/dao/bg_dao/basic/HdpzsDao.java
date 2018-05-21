package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;
import com.cn.jf.backstage.dao.bg_dao.entity.DeviceMaster;

public interface HdpzsDao {
	
	public List<DeviceMaster> find(String operatorID, int start, int size,String emplCode) throws Exception;

	public Long getTotal(String operatorID,String emplCode) throws Exception;
			
	public int deleteHdpz(String id) throws Exception;

	public String getSbztMachCodeByMacAddr(String macAddr) throws Exception;

	public String getSbztMacAddrByMachCode(String machCode) throws Exception;

	public DeviceMaster getDevMaterByMachCode(String machCode) throws Exception;

	public int updateDevMater(DeviceMaster dm) throws Exception;

	public int deleteMatter(String id) throws Exception;

	public int deleteMatter1(String id) throws Exception;

	public String getMatterByMachCode(String machCode) throws Exception;

	public List<String> getsbbh(String operatorID) throws Exception;

	public List<DeviceMaster> getDeviceMaster(String operatorId) throws Exception;

	public String getAddr(String machCode) throws Exception;

	public List<String> getsbbhs(String operatorID) throws Exception;

	public List<String> getsbbhall(String operatorID) throws Exception;

	public List<String> getsbbhq() throws Exception;

	public List<String> getsbbhsq() throws Exception;

	public List<String> getsbbhallq() throws Exception;

	public List<DeviceMaster> find1(String s_operatorID, int start, int size) throws Exception;

	public Long getTotal1(String s_operatorID) throws Exception;	
}
