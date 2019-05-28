package com.yyb.springbootmybatisplus.system.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yyb.springbootmybatisplus.common.dto.BaseDto;
import com.yyb.springbootmybatisplus.system.dao.UserDao;
import com.yyb.springbootmybatisplus.system.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController类
 * @Description TODO
 * @Author yyb
 * @Date 2019/5/27 14:00
 * @Vsion 1.0
 **/
@Controller
@RequestMapping(value = "/system")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/listUser")
    public String listUser(){
        return "/system/user/userList";
    }



    @ResponseBody
    @RequestMapping(value = "/userQuery",method = RequestMethod.GET)
    public BaseDto userQuery(){

        BaseDto baseDto = new BaseDto();
        List<User> users = userDao.selectList(null);

        baseDto.setCode("0");
        baseDto.setData(users);
        baseDto.setMsg("用户信息查询成功");

        return baseDto;
    }

    @ResponseBody
    @RequestMapping(value = "/login1",method = RequestMethod.GET)
    public String login1(User user){

        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();

        userQueryWrapper.setEntity(user);

        User user1 = userDao.selectOne(userQueryWrapper);

        System.out.println(user1);

        return null;
    }







}
