package com.example.duodian.model;

import java.io.Serializable;
import java.util.Date;

public class UserObject implements Serializable {
    private  String UserName;
    private  String PassWord;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }
}
