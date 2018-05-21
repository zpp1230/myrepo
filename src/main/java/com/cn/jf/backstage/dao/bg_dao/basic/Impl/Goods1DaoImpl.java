package com.cn.jf.backstage.dao.bg_dao.basic.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cn.jf.backstage.dao.bg_dao.basic.Goods1Dao;
import com.cn.jf.backstage.dao.bg_dao.entity.GoodsMaster;
import com.cn.jf.backstage.dao.bg_dao.mapper.Goods1Mapper;
@Repository("Goods1Dao")
public class Goods1DaoImpl implements Goods1Dao{

	@Resource
	private Goods1Mapper goods1Mapper;
	public List<GoodsMaster> searchGoods(String waresName,int start,int size,String operatorID) throws Exception {
	
		return goods1Mapper.searchGoods(waresName,start,size,operatorID);
	}
	
	public Long getTotals(String s_waresName,String operatorID) throws Exception {
		
		return goods1Mapper.getTotals(s_waresName,operatorID);
	}

	
	public List<GoodsMaster> searchGoods1(String s_waresName, int start, int size,String operatorID) throws Exception {
		
		return goods1Mapper.searchGoods1(s_waresName,start,size,operatorID);
	}

	
	public Long getTotals1(String s_waresName,String operatorID) throws Exception {
		
		return goods1Mapper.getTotals1(s_waresName,operatorID);
	}

	
	public List<GoodsMaster> searchGoods2(String s_waresName, int start, int size,String operatorID) throws Exception {
		
		return goods1Mapper.searchGoods2(s_waresName,start,size,operatorID);
	}

	
	public Long getTotals2(String s_waresName,String operatorID) throws Exception {
		
		return goods1Mapper.getTotals2(s_waresName,operatorID);
	}

	
	public String searchGoodsId(String goods) throws Exception {
		
		return goods1Mapper.searchGoodsId(goods);
	}

	
	public List<GoodsMaster> searchGoodssz(String s_waresName, int start, int size, String operatorID)
			throws Exception {
		
		return goods1Mapper.searchGoodssz(s_waresName,start,size,operatorID);
	}


	public Long getTotalssz(String s_waresName, String operatorID) throws Exception {
		
		return goods1Mapper.getTotalssz(s_waresName,operatorID);
	}
	
	public List<GoodsMaster> searchGoods1sz(String s_waresName, int start, int size, String operatorID)
			throws Exception {
		
		return goods1Mapper.searchGoods1sz(s_waresName,start,size,operatorID);
	}


	public Long getTotals1sz(String s_waresName, String operatorID) throws Exception {
		
		return goods1Mapper.getTotals1sz(s_waresName,operatorID);
	}
	
	public List<GoodsMaster> searchGoods2sz(String s_waresName, int start, int size, String operatorID)
			throws Exception {
		
		return goods1Mapper.searchGoods2sz(s_waresName,start,size,operatorID);
	}


	public Long getTotals2sz(String s_waresName, String operatorID) throws Exception {
		
		return goods1Mapper.getTotals2sz(s_waresName,operatorID);
	}

	
	public List<GoodsMaster> searchGoodsby(String s_waresName, int start, int size, String operatorID)
			throws Exception {
		
		return goods1Mapper.searchGoodsby(s_waresName,start,size,operatorID);
	}


	public Long getTotalsby(String s_waresName, String operatorID) throws Exception {
		
		return goods1Mapper.getTotalsby(s_waresName,operatorID);
	}

}
