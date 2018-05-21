package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.jf.backstage.dao.bg_dao.entity.TbBasicHdlb;



public interface TbBasicHdlbBasic{
	
	public <ModelType> Long findBySize() throws Exception;
	
	public <ModelType> TbBasicHdlb findById(String categoryId) throws Exception;
	
	public <ModelType> int insertHdlb(ModelType tbBasicHdlb);
	
	public <ModelType> int updateHdlbById(String categoryId) throws Exception;
	
	public <ModelType> List<TbBasicHdlb> findHdlbListByPage(String categoryId,
			String goodsForm,int start,int end) throws Exception;
	
	public <ModelType> int deleteById(String categoryId) throws Exception;
	
	public <ModelType> int updateHdlb(TbBasicHdlb tbBasicHdlb) throws Exception;
	
	public <ModelType> List<TbBasicHdlb> findByPage();
	
	public<ModelType> Long findBycount(String categoryId,String goodsForm);
	
}
