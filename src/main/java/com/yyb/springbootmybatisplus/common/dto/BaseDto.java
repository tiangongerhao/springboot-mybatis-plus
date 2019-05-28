package com.yyb.springbootmybatisplus.common.dto;

import lombok.Data;

/**
 * @ClassName BaseDto类
 * @Description 基础数据返回类
 * @Author yyb
 * @Date 2019/5/28 14:49
 * @Vsion 1.0
 **/
@Data
public class BaseDto {

    private String code;

    private String msg;

    private Integer count;

    private Object data;
}
