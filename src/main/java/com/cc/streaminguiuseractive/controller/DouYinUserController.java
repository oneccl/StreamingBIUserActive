package com.cc.streaminguiuseractive.controller;

import com.cc.streaminguiuseractive.entity.DouYinUser;
import com.cc.streaminguiuseractive.service.DouYinUserService;
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
 * Date: 2023/3/8
 * Time: 17:22
 * Description:
 */
@CrossOrigin
@RestController
public class DouYinUserController {

    @Autowired
    DouYinUserService douYinUserService;

    private List<DouYinUser> preList = new ArrayList<>();

    // 全国榜
    @RequestMapping("douYinData")
    public Object getDouYinData(){
        List<DouYinUser> list = douYinUserService.findAll();
        if (list!=null && list.size()>0){
            preList.clear();
            preList.addAll(list);
            return list;
        }
        return preList;
    }

    // 地区(城市)榜
    @RequestMapping("areaDouYinData")
    public Object getDataByCity(String city){
        return douYinUserService.findByCity(city);
    }

    @RequestMapping("getCities")
    public Object getCities(){
        return douYinUserService.findCities();
    }


}
