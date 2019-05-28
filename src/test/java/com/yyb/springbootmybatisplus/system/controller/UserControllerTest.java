package com.yyb.springbootmybatisplus.system.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yyb.springbootmybatisplus.system.dao.UserDao;
import com.yyb.springbootmybatisplus.system.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void login() {

        //查询全部的用户信息
        List<User> userList = userDao.selectList(null);

        User user = new User();
        user.setUserName("刘备");
        user.setUserAddress("常山");

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNotNull("user_name");
        queryWrapper.isNotNull("user_address");
        queryWrapper.setEntity(user);
        List<Map<String, Object>> maps = userDao.selectMaps(queryWrapper);
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }

//        List<User> userList1 = userDao.selectList(queryWrapper);

//        System.out.println(userList1.get(0).getUserId());

    }
}

























