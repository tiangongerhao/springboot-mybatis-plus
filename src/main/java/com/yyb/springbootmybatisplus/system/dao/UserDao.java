package com.yyb.springbootmybatisplus.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yyb.springbootmybatisplus.system.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserDao类
 * @Description TODO
 * @Author yyb
 * @Date 2019/5/27 13:48
 * @Vsion 1.0
 **/
@Mapper
public interface UserDao extends BaseMapper<User> {

   User selectOne(Integer integer);
}
