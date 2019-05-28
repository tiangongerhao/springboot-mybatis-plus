package com.yyb.springbootmybatisplus.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName IndexController类
 * @Description TODO
 * @Author yyb
 * @Date 2019/5/28 13:16
 * @Vsion 1.0
 **/
@Controller
@RequestMapping(value = "/web")
public class IndexController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

}
