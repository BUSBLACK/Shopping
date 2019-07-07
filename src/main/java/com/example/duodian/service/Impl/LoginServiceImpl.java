package com.example.duodian.service.Impl;

import com.example.duodian.model.UserObject;
import com.example.duodian.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public List<UserObject> listAll() {
        return null;
    }

    @Override
    public List<UserObject> list(String keyword, Integer pageNum, Integer pageSize) {
        return null;
    }
}
