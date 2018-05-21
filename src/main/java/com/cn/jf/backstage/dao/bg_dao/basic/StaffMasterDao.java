package com.cn.jf.backstage.dao.bg_dao.basic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface StaffMasterDao {
    public <ModelType> int deleteById(ModelType modelType) throws Exception;
	public <ModelType> int add(ModelType modelType) throws Exception;
	public <ModelType> ModelType findById(ModelType modelType)throws Exception;
	public <ModelType> List<ModelType> findByParams(Map<String,Object> params)throws Exception;
	public <ModelType> List<ModelType> findByParam(Map<String,Object> params)throws Exception;
	public <ModelType> ModelType findByOneParams(Map<String,Object> params)throws Exception;
	public <ModelType> List<ModelType> findByBiz(ModelType modelType,Map<String,Object> params)throws Exception;
	public <ModelType> int modifyById(ModelType modelType)throws Exception;
	public int findCount(Map<String,Object> params)throws Exception;
	public int findCount_1(Map<String,Object> params)throws Exception;
	public <ModelType> List<ModelType> findByPage(String orderByField,String orderBy,Map<String,Object> params)throws Exception;
	
	public <ModelType> List<ModelType> findByParamsPermain(@Param("params")Map<String,Object> params);
    public <ModelType> List<ModelType> findByParamsReplenish(@Param("params")Map<String,Object> params);
}
