package com.cc.streaminguiuseractive.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/3/8
 * Time: 17:13
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

@TableName("uw_digg")
public class DouYinUser {

    private String userId;
    private String nickName;
    private Integer digg;

}
