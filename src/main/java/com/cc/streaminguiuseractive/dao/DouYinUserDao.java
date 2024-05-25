package com.cc.streaminguiuseractive.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cc.streaminguiuseractive.entity.AreaDouYinUser;
import com.cc.streaminguiuseractive.entity.DouYinUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/3/8
 * Time: 17:20
 * Description:
 */
@Mapper
public interface DouYinUserDao extends BaseMapper<DouYinUser> {

    @Select("select * from uw_digg")
    List<DouYinUser> queryAll();

}
