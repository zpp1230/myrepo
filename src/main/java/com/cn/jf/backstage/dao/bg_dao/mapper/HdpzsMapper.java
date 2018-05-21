package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.cn.jf.backstage.dao.bg_dao.entity.DeviceMaster;


public interface HdpzsMapper {
	
	public List<DeviceMaster> find(@Param("operateCompany") String operatorID, @Param("start") int start, @Param("size") int size,@Param("operatorID")String emplCode)
			throws Exception;

	public Long getTotal(@Param("operateCompany") String operatorID,@Param("operatorID")String emplCode) throws Exception;
	
	public int deleteHdpz(@Param("machCode")String id);

	public String getSbztMachCodeByMacAddr(@Param("macAddr") String macAddr) throws Exception;

	public String getSbztMacAddrByMachCode(@Param("machCode") String machCode) throws Exception;

	public DeviceMaster getDevMaterByMachCode(@Param("machCode") String machCode) throws Exception;

	public int updateDevMater(DeviceMaster dm) throws Exception;

	public int deleteMatter(@Param("machCode") String id) throws Exception;

	public int deleteMatter1(@Param("machCode") String id) throws Exception;

	public String getMatterByMachCode(@Param("machCode") String machCode) throws Exception;

	public List<String> getsbbh(@Param("operatorID") String operatorID) throws Exception;

	public List<DeviceMaster> getDeviceMaster( @Param("operatorID") String operatorId) throws Exception;

	public String getAddr(@Param("machCode") String machCode) throws Exception;

	public List<String> getsbbhs(@Param("operatorID") String operatorID) throws Exception;

	public List<String> getsbbhall(@Param("operatorID") String operatorID) throws Exception;

	public List<String> getsbbhq() throws Exception;

	public List<String> getsbbhsq() throws Exception;

	public List<String> getsbbhallq() throws Exception;

	public List<DeviceMaster> find1(@Param("operateCompany") String s_operatorID,@Param("start") int start,@Param("size") int size) throws Exception;

	public Long getTotal1(@Param("operateCompany") String s_operatorID) throws Exception;
	
}
