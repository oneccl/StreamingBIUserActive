package com.cc.streaminguiuseractive.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/3/7
 * Time: 19:12
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

@TableName("hour_uc")
public class UserInfo {

    private String hour;
    private Integer uc;

}
