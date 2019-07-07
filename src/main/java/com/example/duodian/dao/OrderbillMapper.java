package com.example.duodian.dao;

import com.example.duodian.model.Orderbill;
import com.example.duodian.model.OrderbillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderbillMapper {
    long countByExample(OrderbillExample example);

    int deleteByExample(OrderbillExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Orderbill record);

    int insertSelective(Orderbill record);

    List<Orderbill> selectByExample(OrderbillExample example);

    Orderbill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Orderbill record, @Param("example") OrderbillExample example);

    int updateByExample(@Param("record") Orderbill record, @Param("example") OrderbillExample example);

    int updateByPrimaryKeySelective(Orderbill record);

    int updateByPrimaryKey(Orderbill record);
}