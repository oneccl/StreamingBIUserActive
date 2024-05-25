package com.cc.streaminguiuseractive.service;

import com.cc.streaminguiuseractive.dao.AreaDouYinUserDao;
import com.cc.streaminguiuseractive.dao.DouYinUserDao;
import com.cc.streaminguiuseractive.entity.AreaDouYinUser;
import com.cc.streaminguiuseractive.entity.DouYinUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/3/8
 * Time: 17:21
 * Description:
 */
@Service
public class DouYinUserService {

    @Autowired
    DouYinUserDao douYinUserDao;

    public List<DouYinUser> findAll(){
        try {
            return douYinUserDao.queryAll();
        } catch (Exception ignored) {
        }
        return null;
    }

    @Autowired
    AreaDouYinUserDao areaDouYinUserDao;

    public List<AreaDouYinUser> findByCity(String city){
        return areaDouYinUserDao.queryByCity(city);
    }

    public List<String> findCities(){
        return areaDouYinUserDao.queryCities();
    }


}
