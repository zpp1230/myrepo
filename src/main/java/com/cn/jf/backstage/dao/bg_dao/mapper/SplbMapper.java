package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.jf.backstage.dao.bg_dao.entity.Splb;

public interface SplbMapper {

	public <ModelType> Splb getSplbByGoodsTypeCode(String goodsTypeCode) throws Exception;

	public <ModelType> int addSplb(Splb splb) throws Exception;

	public <ModelType> int updateSplb(Splb splb) throws Exception;

	public List<Splb> find(@Param("goodsType") String goodsType, @Param("start") int start, @Param("size") int size,@Param("operatorID") String emplCode)
			throws Exception;

	public Long getTotal(@Param("goodsType") String goodsType,@Param("operatorID") String emplCode) throws Exception;

	public int deleteSplb(@Param("goodsTypeCode") String goodsTypeCode) throws Exception;

}
