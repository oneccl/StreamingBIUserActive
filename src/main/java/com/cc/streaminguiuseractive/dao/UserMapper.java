package com.cc.streaminguiuseractive.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cc.streaminguiuseractive.entity.DouYinUser;
import com.cc.streaminguiuseractive.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/3/7
 * Time: 19:11
 * Description:
 */

@Mapper
public interface UserMapper extends BaseMapper<UserInfo> {

    @Select("select * from hour_uc")
    List<UserInfo> queryAll();

}
