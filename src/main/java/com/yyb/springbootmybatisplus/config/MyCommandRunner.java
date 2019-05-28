package com.yyb.springbootmybatisplus.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyCommandRunner类
 * @Description 配置启动浏览器
 * @Author yyb
 * @Date 2019/5/28 13:53
 * @Vsion 1.0
 **/
@Component
public class MyCommandRunner implements CommandLineRunner {


    @Value("${server.port}")
    private String port;

    @Override
    public void run(String... args) {
        try {
            Runtime.getRuntime().exec("cmd   /c   start   http://localhost:" + port);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
