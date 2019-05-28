package com.yyb.springbootmybatisplus.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @ClassName MybatisPlusConfig类
 * @Description TODO
 * @Author yyb
 * @Date 2019/5/27 17:31
 * @Vsion 1.0
 **/
@Configuration

@MapperScan("com.yyb.springbootmybatisplus")
public class MybatisPlusConfig {


    @Bean
    public PaginationInterceptor paginationInterceptor() {

        return new PaginationInterceptor();

    }

    @Bean

    public PerformanceInterceptor performanceInterceptor() {

        PerformanceInterceptor performanceInterceptor =new PerformanceInterceptor();

        //格式化sql语句

        Properties properties =new Properties();

        properties.setProperty("format", "faalse");

        performanceInterceptor.setProperties(properties);

        return performanceInterceptor;

    }




}
