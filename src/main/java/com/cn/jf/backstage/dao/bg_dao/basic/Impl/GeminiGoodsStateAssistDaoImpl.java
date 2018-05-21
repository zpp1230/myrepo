package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.GeminiGoodsStateAssistDao;
import com.cn.jf.backstage.dao.bg_dao.mapper.GeminiGoodsStateAssistMapper;


@Repository("geminiGoodsStateAssistDao")
public class GeminiGoodsStateAssistDaoImpl implements GeminiGoodsStateAssistDao {

	
	@Resource
	private GeminiGoodsStateAssistMapper geminiGoodsStateAssistMapper;
	
	
	@Override
	public <ModelType> List<ModelType> findByMachCode(String machCode) throws Exception {
		
		return geminiGoodsStateAssistMapper.findByMachCode(machCode);
	}

	@Override
	public <ModelType> int addGeminiGoodsStateAssist(ModelType modelType) throws Exception {
		
		return geminiGoodsStateAssistMapper.addGeminiGoodsStateAssist(modelType);
	}

	@Override
	public <ModelType> int updateGeminiGoodsStateAssist(ModelType modelType) throws Exception {
		
		return geminiGoodsStateAssistMapper.updateGeminiGoodsStateAssist(modelType);
	}

	@Override
	public <ModelType> int deleteGeminiGoodsStateAssist(ModelType modelType) throws Exception {
		
		return geminiGoodsStateAssistMapper.deleteGeminiGoodsStateAssist(modelType);
	}

}
