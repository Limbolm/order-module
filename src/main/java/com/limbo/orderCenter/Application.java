package com.limbo.orderCenter;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 程序启动入口
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.limbo.orderCenter.*"})
@MapperScan("com.limbo.orderCenter.mapper")
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
