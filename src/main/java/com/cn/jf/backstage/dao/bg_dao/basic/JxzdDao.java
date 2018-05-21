package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;

import com.cn.jf.backstage.dao.bg_dao.entity.Jxzd;

public interface JxzdDao {
	// 查
	public <ModelType> Jxzd getJxzdByModelNum(String modelNum) throws Exception;

	// 增
	public <ModelType> int addJxzd(Jxzd jxzd) throws Exception;

	// 删
	public <ModelType> int deleteJxzd(String modelNum) throws Exception;

	// 改
	public <ModelType> int updateJxzd(Jxzd jxzd) throws Exception;

	// 所有数据
	public <ModelType> List<Jxzd> find(String s_model, String s_coolType, String s_hotType, String s_environment,
			int start, int size) throws Exception;

	// 获取总记录数
	public <ModelType> Long getTotal(String s_model, String s_coolType, String s_hotType, String s_environment)
			throws Exception;

	// 条件查询
	public <ModelType> List<Jxzd> selects(String s_model, String s_coolType, String s_hotType, String s_environment)
			throws Exception;

	// 获取机型
	public List<String> searchModels() throws Exception;

}
