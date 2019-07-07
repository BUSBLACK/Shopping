package com.example.duodian.dao;

import com.example.duodian.model.Chatrecord;
import com.example.duodian.model.ChatrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatrecordMapper {
    long countByExample(ChatrecordExample example);

    int deleteByExample(ChatrecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Chatrecord record);

    int insertSelective(Chatrecord record);

    List<Chatrecord> selectByExample(ChatrecordExample example);

    Chatrecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Chatrecord record, @Param("example") ChatrecordExample example);

    int updateByExample(@Param("record") Chatrecord record, @Param("example") ChatrecordExample example);

    int updateByPrimaryKeySelective(Chatrecord record);

    int updateByPrimaryKey(Chatrecord record);
}