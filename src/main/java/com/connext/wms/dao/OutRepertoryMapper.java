package com.connext.wms.dao;

import com.connext.wms.entity.OutRepertory;
import com.connext.wms.entity.OutRepertoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OutRepertoryMapper {
    void updateWhenCancel(OutRepertory outRepertory);

    long countByExample(OutRepertoryExample example);

    long countByConditions(String outRepoOrderId,String selectStatus);

    int deleteByExample(OutRepertoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OutRepertory record);

    int insertSelective(OutRepertory record);

    List<OutRepertory> selectByKey1(String key);

    List<OutRepertory> selectByExample(OutRepertoryExample example);

    List<OutRepertory> selectByPage();

    List<OutRepertory> unclearSelect(String outRepoOrderId,String selectStatus);

  /*  OutRepertory selectByExample(Integer outRepoId);*/

    OutRepertory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OutRepertory record, @Param("example") OutRepertoryExample example);

    int updateByExample(@Param("record") OutRepertory record, @Param("example") OutRepertoryExample example);

    int updateByPrimaryKeySelective(OutRepertory record);

    int updateByPrimaryKey(OutRepertory record);

    OutRepertory selectByOutRepoOrderNo(String outRepoOrderNo);

    List<OutRepertory> selectOutRepoByPage(Integer start,Integer size);
}