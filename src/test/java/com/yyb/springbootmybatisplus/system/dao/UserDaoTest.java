package com.yyb.springbootmybatisplus.system.dao;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yyb.springbootmybatisplus.system.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    /**
     * @return void
     * @Author yyb
     * @Description 查询测试
     * @Date 2019/5/27
     * @Param []
     **/
    @Test
    public void test1() {

        List<User> users = userDao.selectList(null);

        Assert.assertEquals(4, users.size());
        users.forEach(System.out::println);
    }


    @Test
    public void test2() {
        User user = userDao.selectOne(7);

        System.out.println(user);
    }

    @Test
    public void test3() {
        User user = new User();
        user.setUserName("赵云");
        user.setUserAddress("常山");
        user.setUserAge(28);
        user.setUserGender("男");
        user.setUserPwd("123456");
        user.setUserEmail("zhaoyun@qq.com");
        user.setUserCreateTime(new Date());
        user.setUserModifyTime(new Date());
        int insert = userDao.insert(user);

        System.out.println(insert);
    }

    /**
     * @return void
     * @Author yyb
     * @Description 分页查询测试
     * @Date 2019/5/28
     * @Param []
     **/
    @Test
    public void test4() {

        HashMap<String, Object> map = new HashMap<>();

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("user_id");

        Page<User> page = new Page<>(2, 3);

        IPage<Map<String, Object>> mapIPage = userDao.selectMapsPage(page, queryWrapper);

        System.out.println(mapIPage.getRecords().size());
        System.out.println(JSON.toJSONString(mapIPage));
        String string = JSON.toJSONString(mapIPage);

        Map<String, Object> objectMap = stringToMap(string);

        objectMap.forEach((k, v) -> System.out.println("key= "+k + ":" +" and value= " + v));

        for (Map.Entry<String, Object> entry : objectMap.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }


    /**
     * @Author yyb
     * @Description string转map
     * @Date 2019/5/28
     * @Param [map]
     * @return java.util.Map<java.lang.String,java.lang.Object>
     **/
    public static Map<String, Object> stringToMap(String map) {

        if (map.startsWith("{")) {
            map = map.substring(1, map.length());
        }
        if (map.endsWith("}")) {
            map = map.substring(0, map.length() - 1);
        }

        Map map1 = new HashMap(16);
        String[] out = map.split(",");
        for (String anOut : out) {
            String[] inn = anOut.split(":");
            map1.put(inn[0], inn[1]);
        }
        System.out.println(map1);

        return map1;


    }


}