package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.cn.jf.backstage.dao.bg_dao.entity.Pay;

public interface GoodsMasterMapper {
	public int deleteByPrimaryKey(String id);
    public <ModelType> int insert(ModelType record);
    public <ModelType> int insertSelective(ModelType record);
    public <ModelType> ModelType selectByPrimaryKey(ModelType modelType);
    public <ModelType> List<ModelType> selectByParams(@Param("model")ModelType modelType,@Param("params")Map<String,Object> params);
    public <ModelType> int updateByPrimaryKeySelective(ModelType record);
    public <ModelType> int updateByPrimaryKey(ModelType record);
    public int selectCount(@Param("params")Map<String,Object> params);
    public <ModelType> List<ModelType> selectParams(@Param("params")Map<String,Object> params);
    public <ModelType> List<ModelType> selectByPage(@Param("orderByField") String orderByField,@Param("orderBy") String orderBy,@Param("params")Map<String,Object> params);
    public <ModelType> int deleteByPrimarayKeyForModel(ModelType record);
    public Pay getPayObj(@Param("params")Map<String,Object> params) throws Exception;
    public <ModelType> ModelType findByNumParams(@Param("params")Map<String, Object> params) throws Exception;
}
