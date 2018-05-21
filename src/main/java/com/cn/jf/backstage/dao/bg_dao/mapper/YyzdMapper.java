package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.jf.backstage.dao.bg_dao.entity.Yyzd;

public interface YyzdMapper {

	public <ModelType> Yyzd getYyzdByOperatorID(String operatorID) throws Exception;

	public int addYyzd(Yyzd yyzd) throws Exception;

	public int updateYyzd(Yyzd yyzd) throws Exception;

	public List<Yyzd> find(@Param("operator") String operator, @Param("start") int start, @Param("size") int size)
			throws Exception;

	public Long getTotal(@Param("operator") String operator) throws Exception;

	public int deleteYyzd(@Param("operatorID") String operatorID) throws Exception;
}
