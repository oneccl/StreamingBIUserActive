package com.cc.streaminguiuseractive.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/3/10
 * Time: 16:22
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

@TableName("area_uw_digg")
public class AreaDouYinUser {

    private String userId;
    private String nickName;
    private String city;
    private String workId;
    private Integer digg;
    private Integer comment;
    private Integer share;

}
