package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;

/**
 * 商品配置辅助dao接口
 * */
public interface GoodsConfigAssistDao {

	public <ModelType> List<ModelType> findByMachCode(String machCode) throws Exception;
	
	public <ModelType> ModelType findByGoodsId(String goodsId) throws Exception;
}
