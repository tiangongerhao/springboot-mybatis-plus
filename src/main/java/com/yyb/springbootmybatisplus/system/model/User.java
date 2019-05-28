package com.yyb.springbootmybatisplus.system.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @ClassName User类
 * @Description TODO
 * @Author yyb
 * @Date 2019/5/27 13:44
 * @Vsion 1.0
 **/
@Data
@ToString
public class User {

    private Integer userId;

    private String userName;

    @JsonIgnore
    private String userPwd;

    private Integer userAge;

    private String userAddress;

    private String userEmail;

    private String userGender;

    private Date userCreateTime;

    private Date userModifyTime;


}
