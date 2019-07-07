package com.example.duodian.service;


import com.example.duodian.model.UserObject;

import java.util.List;

public interface LoginService {
    /**
     * 查询所有专题
     */
    List<UserObject> listAll();

    /**
     * 分页查询专题
     */
    List<UserObject> list(String keyword, Integer pageNum, Integer pageSize);
}
