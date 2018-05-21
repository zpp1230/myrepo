package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;
import com.cn.jf.backstage.dao.bg_dao.basic.SplbDao;
import com.cn.jf.backstage.dao.bg_dao.entity.Splb;
import com.cn.jf.backstage.dao.bg_dao.mapper.SplbMapper;
@Repository("SplbDao")
public class SplbDaoImpl implements SplbDao{
	@Resource
	private SplbMapper splbMapper;

	public <ModelType> Splb getSplbByGoodsTypeCode(String goodsTypeCode) throws Exception {
		
		return splbMapper.getSplbByGoodsTypeCode(goodsTypeCode);
	}


	public <ModelType> int addSplb(Splb splb) throws Exception {
	
		return splbMapper.addSplb(splb);
	}


	public <ModelType> int updateSplb(Splb splb) throws Exception {
		
		return splbMapper.updateSplb(splb);
	}

	public List<Splb> find(String s_goodsType, int start, int size,String emplCode) throws Exception {
		return splbMapper.find(s_goodsType,start,size,emplCode);
	}



	public Long getTotal(String s_goodsType,String emplCode) throws Exception {

		return splbMapper.getTotal(s_goodsType, emplCode);
	}


	public int deleteSplb(String goodsTypeCode) throws Exception {
	
		return splbMapper.deleteSplb(goodsTypeCode);
	}
}
