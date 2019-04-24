package com.kumua.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * 应用启动类
 *
 * @author AIR
 * @date 2019/4/24
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.kumua.project"})
public class Application extends SpringBootServletInitializer{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

    /**
     * 应用入口函数
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
