package com.cc.streaminguiuseractive.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cc.streaminguiuseractive.entity.AreaDouYinUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/3/10
 * Time: 16:31
 * Description:
 */
@Mapper
public interface AreaDouYinUserDao extends BaseMapper<AreaDouYinUser> {

    @Select("select * from area_uw_digg where city=#{city}")
    List<AreaDouYinUser> queryByCity(String city);

    // 获取所有城市
    @Select("select distinct city from area_uw_digg")
    List<String> queryCities();

}
