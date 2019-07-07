package com.example.duodian.dao;

import com.example.duodian.model.Jubao;
import com.example.duodian.model.JubaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JubaoMapper {
    long countByExample(JubaoExample example);

    int deleteByExample(JubaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jubao record);

    int insertSelective(Jubao record);

    List<Jubao> selectByExample(JubaoExample example);

    Jubao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jubao record, @Param("example") JubaoExample example);

    int updateByExample(@Param("record") Jubao record, @Param("example") JubaoExample example);

    int updateByPrimaryKeySelective(Jubao record);

    int updateByPrimaryKey(Jubao record);
}