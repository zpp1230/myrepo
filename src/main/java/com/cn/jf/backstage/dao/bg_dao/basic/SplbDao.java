package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;

import com.cn.jf.backstage.dao.bg_dao.entity.Splb;

public interface SplbDao {
	
	public <ModelType> Splb getSplbByGoodsTypeCode(String goodsTypeCode) throws Exception;

	public <ModelType> int addSplb(Splb splb) throws Exception;

	public <ModelType> int updateSplb(Splb splb) throws Exception;

	public List<Splb> find(String goodsType, int start, int size,String emplCode) throws Exception;

	public Long getTotal(String goodsType,String emplCode) throws Exception;

	public int deleteSplb(String goodsTypeCode) throws Exception;
}
