package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.TbBasicHdlbBasic;
import com.cn.jf.backstage.dao.bg_dao.entity.TbBasicHdlb;
import com.cn.jf.backstage.dao.bg_dao.mapper.TbBasicHdlbMapper;


@Repository("tbBasicHdlbBasic1")
public class TbBasicHdlbBasicImpl implements TbBasicHdlbBasic {

	@Resource
	private TbBasicHdlbMapper tbBasicHdlbMapper;
	
	public <ModelType> Long findBySize() throws Exception {

		return tbBasicHdlbMapper.findBySize();
	}

	public <ModelType> TbBasicHdlb findById(String categoryId) throws Exception {
		// TODO Auto-generated method stub
		return tbBasicHdlbMapper.findById(categoryId);
	}

	public <ModelType> int insertHdlb(ModelType tbBasicHdlb) {
		// TODO Auto-generated method stub
		return tbBasicHdlbMapper.insertHdlb(tbBasicHdlb);
	}

	public <ModelType> int updateHdlbById(String categoryId) throws Exception {
		return tbBasicHdlbMapper.updateHdlbById(categoryId);
	}

	public <ModelType> List<TbBasicHdlb> findHdlbListByPage(String categoryId,
			String goodsForm,int start,int end) throws Exception {
		// TODO Auto-generated method stub
		return tbBasicHdlbMapper.findHdlbListByPage(categoryId, goodsForm,start,end);
	}

	public <ModelType> int deleteById(String categoryId) throws Exception {
		return tbBasicHdlbMapper.deleteById(categoryId);
	}

	public <ModelType> int updateHdlb(TbBasicHdlb tbBasicHdlb) throws Exception {
		// TODO Auto-generated method stub
		return tbBasicHdlbMapper.updateHdlb(tbBasicHdlb);
	}

	public <ModelType> List<TbBasicHdlb> findByPage() {
		// TODO Auto-generated method stub
		return tbBasicHdlbMapper.findByPage();
	}

	public <ModelType> Long findBycount(String categoryId, String goodsForm) {
		// TODO Auto-generated method stub
		return tbBasicHdlbMapper.findBycount(categoryId, goodsForm);
	}

}
