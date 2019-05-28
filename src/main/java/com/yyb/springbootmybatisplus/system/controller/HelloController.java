package com.yyb.springbootmybatisplus.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloController类
 * @Description TODO
 * @Author yyb
 * @Date 2019/5/27 13:27
 * @Vsion 1.0
 **/
@Controller
@RequestMapping(value = "/system")
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello world！";
    }


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "system/login";
    }


    @RequestMapping(value = "/main",method = RequestMethod.GET)
    public String main(){
        return "system/main";
    }


}
