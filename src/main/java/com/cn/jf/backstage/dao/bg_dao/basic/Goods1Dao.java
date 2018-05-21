package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;

import com.cn.jf.backstage.dao.bg_dao.entity.GoodsMaster;

public interface Goods1Dao {
	
	public String searchGoodsId(String goods) throws Exception;

	public List<GoodsMaster> searchGoods(String waresName, int start, int size, String operatorID) throws Exception;

	public Long getTotals(String s_waresName, String operatorID) throws Exception;

	public List<GoodsMaster> searchGoods1(String s_waresName, int start, int size, String operatorID) throws Exception;

	public Long getTotals1(String s_waresName, String operatorID) throws Exception;

	public Long getTotals2(String s_waresName, String operatorID) throws Exception;

	public List<GoodsMaster> searchGoods2(String s_waresName, int start, int size, String operatorID) throws Exception;

	public List<GoodsMaster> searchGoodssz(String s_waresName, int start, int size, String operatorID) throws Exception;

	public Long getTotalssz(String s_waresName, String operatorID) throws Exception;
	
	public List<GoodsMaster> searchGoods1sz(String s_waresName, int start, int size, String operatorID) throws Exception;

	public Long getTotals1sz(String s_waresName, String operatorID) throws Exception;
	
	public List<GoodsMaster> searchGoods2sz(String s_waresName, int start, int size, String operatorID) throws Exception;

	public Long getTotals2sz(String s_waresName, String operatorID) throws Exception;

	public List<GoodsMaster> searchGoodsby(String s_waresName, int start, int size, String operatorID) throws Exception;

	public Long getTotalsby(String s_waresName, String operatorID) throws Exception;

}
