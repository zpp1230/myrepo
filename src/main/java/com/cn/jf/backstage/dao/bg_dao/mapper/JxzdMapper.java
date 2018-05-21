package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.jf.backstage.dao.bg_dao.entity.Jxzd;

public interface JxzdMapper {
	// 查： 根据机型编号查询获取机型主档
	public <ModelType> Jxzd getJxzdByModelNum(String modelNum);

	// 增
	public <ModelType> int addJxzd(Jxzd jxzd);

	// 删
	public <ModelType> int deleteJxzd(String modelNum);

	// 改
	public <ModelType> int updateJxzd(Jxzd jxzd);

	// 所有数据
	public <ModelType> List<Jxzd> find(@Param("model") String s_model, @Param("coolType") String s_coolType,
			@Param("hotType") String s_hotType, @Param("environment") String s_environment, @Param("start") int start,
			@Param("size") int size);

	// 获取总记录数
	public <ModelType> Long getTotal(@Param("model") String s_model, @Param("coolType") String s_coolType,
			@Param("hotType") String s_hotType, @Param("environment") String s_environment);

	// 条件查询
	public <ModelType> List<Jxzd> selects(@Param("model") String s_model, @Param("coolType") String s_coolType,
			@Param("hotType") String s_hotType, @Param("environment") String s_environment);

	// 查询货道类别
	public <ModelType> List<String> searchGoods();

	// 查询机型
	public List<String> searchModels() throws Exception;

}
