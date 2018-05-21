package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;

import com.cn.jf.backstage.dao.bg_dao.entity.Yyzd;

public interface YyzdDao {
	
	public <ModelType> Yyzd getYyzdByOperatorID(String operatorID) throws Exception;

	public int addYyzd(Yyzd yyzd) throws Exception;

	public int updateYyzd(Yyzd yyzd) throws Exception;

	public List<Yyzd> find(String s_operator, int start, int size) throws Exception;

	public Long getTotal(String s_operator) throws Exception;

	public int deleteYyzd(String operatorID) throws Exception;
}
