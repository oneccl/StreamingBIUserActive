package com.cc.streaminguiuseractive.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.cc.streaminguiuseractive.dao.UserMapper;
import com.cc.streaminguiuseractive.entity.DouYinUser;
import com.cc.streaminguiuseractive.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/3/7
 * Time: 19:21
 * Description:
 */
@Service
public class UserInfoService {

    @Autowired
    UserMapper userMapper;

    public List<UserInfo> getAll(){
        try {
            return userMapper.queryAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
