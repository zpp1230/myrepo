package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;


public interface GeminiGoodsStateAssistDao {

	public <ModelType> List<ModelType> findByMachCode(String machCode) throws Exception;
	
	public <ModelType> int addGeminiGoodsStateAssist(ModelType modelType) throws Exception;
	
	public <ModelType> int updateGeminiGoodsStateAssist(ModelType modelType) throws Exception;
	
	public <ModelType> int deleteGeminiGoodsStateAssist(ModelType modelType) throws Exception;
}
