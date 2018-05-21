package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GeminiGoodsStateAssistMapper {

	public <ModelType> List<ModelType> findByMachCode(@Param("machCode") String machCode) throws Exception;
	
	public <ModelType> int addGeminiGoodsStateAssist(ModelType modelType) throws Exception;
	
	public <ModelType> int updateGeminiGoodsStateAssist(ModelType modelType) throws Exception;
	
	public <ModelType> int deleteGeminiGoodsStateAssist(ModelType modelType) throws Exception;
	
}
