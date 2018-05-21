package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.jf.backstage.dao.bg_dao.entity.TbBasicHdlb;

/**
 * 货道类别接口
 * */
public interface TbBasicHdlbMapper {

	/**
	 * 查询所有的货道类别数据
	 * */
	public<ModelType> Long findBySize() throws Exception;
	
	/**
	 * 根据ID查询一条货道类别数据
	 * */
	public<ModelType> TbBasicHdlb findById(@Param(value="categoryId")String categoryId) throws Exception;
	
	/**
	 * 新增数据
	 * @return 
	 * */
//	public void insertHdlb(TbBasicHdlb tbBasicHdlb) throws Exception;
	
	public<ModelType> int insertHdlb(ModelType tbBasicHdlb);
	
	/**
	 * 更新数据
	 * */
	public<ModelType> int updateHdlbById(@Param(value="categoryId")String categoryId) throws Exception;
	
	/**
	 * 分页查询
	 * */
	public<ModelType> List<TbBasicHdlb> findHdlbListByPage(@Param("categoryId")String categoryId,
			@Param("goodsForm")String goodsForm,@Param("start")int start,
			@Param("end")int end) throws Exception;
	
	/**
	 * 删除数据
	 * @return 
	 * */
	public<ModelType> int deleteById(@Param(value="categoryId")String categoryId) throws Exception;
	
	/**
	 * 更新数据
	 * @return 
	 * */
	public<ModelType> int updateHdlb(TbBasicHdlb tbBasicHdlb) throws Exception;
	
	
	public<ModelType> List<TbBasicHdlb> findByPage();
	
	
	public<ModelType> Long findBycount(@Param("categoryId")String categoryId,
			@Param("goodsForm")String goodsForm);
}
