package com.example.duodian.dao;

import com.example.duodian.model.Example;
import com.example.duodian.model.ExampleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExampleMapper {
    long countByExample(ExampleExample example);

    int deleteByExample(ExampleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Example record);

    int insertSelective(Example record);

    List<Example> selectByExampleWithBLOBs(ExampleExample example);

    List<Example> selectByExample(ExampleExample example);

    Example selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Example record, @Param("example") ExampleExample example);

    int updateByExampleWithBLOBs(@Param("record") Example record, @Param("example") ExampleExample example);

    int updateByExample(@Param("record") Example record, @Param("example") ExampleExample example);

    int updateByPrimaryKeySelective(Example record);

    int updateByPrimaryKeyWithBLOBs(Example record);

    int updateByPrimaryKey(Example record);
}