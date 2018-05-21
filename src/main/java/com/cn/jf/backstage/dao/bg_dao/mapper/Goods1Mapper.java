package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.jf.backstage.dao.bg_dao.entity.GoodsMaster;

public interface Goods1Mapper {

	public List<GoodsMaster> searchGoods(@Param("waresName") String waresName,@Param("start") int start,@Param("size") int size,@Param("operatorID") String operatorID) throws Exception;

	public Long getTotals(@Param("waresName") String s_waresName,@Param("operatorID") String operatorID) throws Exception;

	public List<GoodsMaster> searchGoods1(@Param("waresName") String s_waresName,@Param("start") int start,@Param("size") int size,@Param("operatorID") String operatorID) throws Exception;

	public Long getTotals1(@Param("waresName") String s_waresName,@Param("operatorID") String operatorID) throws Exception;

	public List<GoodsMaster> searchGoods2(@Param("waresName") String s_waresName,@Param("start") int start,@Param("size") int size,@Param("operatorID") String operatorID) throws Exception;

	public Long getTotals2(@Param("waresName") String s_waresName,@Param("operatorID") String operatorID) throws Exception;

	public String searchGoodsId(@Param("waresName") String goods) throws Exception;

	public List<GoodsMaster> searchGoodssz(@Param("waresName") String s_waresName,@Param("start") int start,@Param("size")  int size, @Param("operatorID") String operatorID) throws Exception;

	public Long getTotalssz(@Param("waresName") String s_waresName,@Param("operatorID")  String operatorID) throws Exception;
	
	public List<GoodsMaster> searchGoods1sz(@Param("waresName") String s_waresName,@Param("start") int start,@Param("size")  int size, @Param("operatorID") String operatorID) throws Exception;

	public Long getTotals1sz(@Param("waresName") String s_waresName,@Param("operatorID")  String operatorID) throws Exception;
	
	public List<GoodsMaster> searchGoods2sz(@Param("waresName") String s_waresName,@Param("start") int start,@Param("size")  int size, @Param("operatorID") String operatorID) throws Exception;

	public Long getTotals2sz(@Param("waresName") String s_waresName,@Param("operatorID")  String operatorID) throws Exception;

	public List<GoodsMaster> searchGoodsby(@Param("waresName") String s_waresName,@Param("start") int start,@Param("size")  int size, @Param("operatorID") String operatorID) throws Exception;

	public Long getTotalsby(@Param("waresName") String s_waresName,@Param("operatorID")  String operatorID) throws Exception;

}
