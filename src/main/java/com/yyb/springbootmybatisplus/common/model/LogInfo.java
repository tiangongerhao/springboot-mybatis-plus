package com.yyb.springbootmybatisplus.common.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName LogInfo类
 * @Description 日志记录类
 * @Author yyb
 * @Date 2019/5/28 13:31
 * @Vsion 1.0
 **/
@Data
public class LogInfo {

    private Long id;

    private Long userId;

    private String username;

    private String operation;

    private Integer time;

    private String method;

    private String params;

    private String ip;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date gmtCreate;

}
