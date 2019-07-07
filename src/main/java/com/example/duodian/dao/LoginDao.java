package com.example.duodian.dao;

import com.example.duodian.model.UserObject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
@Mapper
public interface LoginDao {
List<UserObject> getUserInformation (@Param("UserName") UserObject UserName, @Param("PassWord") UserObject PassWord);

}
