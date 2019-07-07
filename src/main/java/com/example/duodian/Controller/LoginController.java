package com.example.duodian.Controller;

import com.example.duodian.dto.CommonResult;
import com.example.duodian.model.UserObject;
import com.example.duodian.service.LoginService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(tags = "LoginController", description = "登录信息验证")
@RequestMapping("/prefrenceArea")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @ApiOperation("获取登陆者所有信息")
    @RequestMapping(value = "/listAll", method = RequestMethod.POST)
    @ResponseBody
    public Object listAll() {
        List<UserObject> CustomerList = loginService.listAll();
        return new CommonResult().success(CustomerList);
    }
}
