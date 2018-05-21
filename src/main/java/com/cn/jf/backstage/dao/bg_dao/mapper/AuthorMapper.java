package com.cn.jf.backstage.dao.bg_dao.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface AuthorMapper {
    public <ModelType> int insert(ModelType record);
    public <ModelType> int updateByPrimaryKey(ModelType record);
    public <ModelType> List<ModelType> selectParams(@Param("params")Map<String,Object> params);
    public <ModelType> int deleteByPrimarayKeyForModel(ModelType record);
    public <ModelType> int deleteByPrimarayKey(@Param("params")Map<String,Object> params);
    public <ModelType> List<ModelType> serchRole(@Param("params")Map<String,Object> params);
    public <ModelType> List<ModelType> serchRoleAutor(@Param("params")Map<String, Object> params);
    public  int deleteauthallot(@Param("params")Map<String,Object> params);
    public  int insertauthallot(@Param("params")Map<String,Object> params);
    public <ModelType> ModelType selectParamsEmplAutorInfo(@Param("params")Map<String,Object> params);
}