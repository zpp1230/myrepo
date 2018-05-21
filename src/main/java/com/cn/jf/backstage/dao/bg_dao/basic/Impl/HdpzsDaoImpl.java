package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.HdpzsDao;
import com.cn.jf.backstage.dao.bg_dao.entity.DeviceMaster;
import com.cn.jf.backstage.dao.bg_dao.mapper.HdpzsMapper;

@Repository("hdpzsDao")
public class HdpzsDaoImpl implements HdpzsDao{

	@Resource
	private HdpzsMapper hdpzsMapper;

	public List<DeviceMaster> find(String operatorID, int start, int size,String emplCode) throws Exception {
		
		return hdpzsMapper.find(operatorID, start, size,emplCode);
	}

	public Long getTotal(String operatorID,String emplCode) throws Exception {
		
		return hdpzsMapper.getTotal(operatorID,emplCode);
	}
	

	public int deleteHdpz(String id) throws Exception {
		
		return hdpzsMapper.deleteHdpz(id);
	}


	public String getSbztMachCodeByMacAddr(String macAddr) throws Exception {

		return hdpzsMapper.getSbztMachCodeByMacAddr(macAddr);
	}

	
	public String getSbztMacAddrByMachCode(String machCode) throws Exception {
		
		return hdpzsMapper.getSbztMacAddrByMachCode(machCode);
	}


	public DeviceMaster getDevMaterByMachCode(String machCode) throws Exception {

		return hdpzsMapper.getDevMaterByMachCode(machCode);
	}


	public int updateDevMater(DeviceMaster dm) throws Exception {
	
		return hdpzsMapper.updateDevMater(dm);
	}


	public int deleteMatter(String id) throws Exception {
		
		return hdpzsMapper.deleteMatter(id);
	}


	public int deleteMatter1(String id) throws Exception {
	
		return hdpzsMapper.deleteMatter1(id);
	}


	public String getMatterByMachCode(String machCode) throws Exception {
	
		return hdpzsMapper.getMatterByMachCode(machCode);
	}


	public List<String> getsbbh(String operatorID) throws Exception {		
		
		return hdpzsMapper.getsbbh(operatorID);
	}

	
	public List<DeviceMaster> getDeviceMaster(String operatorId) throws Exception {
	
		return hdpzsMapper.getDeviceMaster(operatorId);
	}

	public String getAddr(String machCode) throws Exception {
	
		return hdpzsMapper.getAddr(machCode);
	}

	public List<String> getsbbhs(String operatorID) throws Exception {

		return hdpzsMapper.getsbbhs(operatorID);
	}


	public List<String> getsbbhall(String operatorID) throws Exception {
		
		return hdpzsMapper.getsbbhall(operatorID);
	}


	public List<String> getsbbhq() throws Exception {
		
		return hdpzsMapper.getsbbhq();
	}


	public List<String> getsbbhsq() throws Exception {
		
		return hdpzsMapper.getsbbhsq();
	}

	
	public List<String> getsbbhallq() throws Exception {
		
		return hdpzsMapper.getsbbhallq();
	}


	public List<DeviceMaster> find1(String s_operatorID, int start, int size) throws Exception {
		
		return hdpzsMapper.find1(s_operatorID, start, size);
	}

	
	public Long getTotal1(String s_operatorID) throws Exception {

		return hdpzsMapper.getTotal1(s_operatorID);
	}	
}
