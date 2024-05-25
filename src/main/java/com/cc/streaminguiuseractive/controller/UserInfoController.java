package com.cc.streaminguiuseractive.controller;

import com.cc.streaminguiuseractive.entity.UserInfo;
import com.cc.streaminguiuseractive.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/3/7
 * Time: 19:29
 * Description:
 */

@CrossOrigin
@RestController
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("getData")
    public Object getData(){
        return userInfoService.getAll();
    }

}
