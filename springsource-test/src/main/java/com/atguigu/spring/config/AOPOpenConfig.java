package com.atguigu.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author liyongqi.0501
 * @date 2023/11/18 5:56 PM
 * @description
 */
@EnableAspectJAutoProxy // 开启自动代理
@Configuration
@ComponentScan(basePackages = {"com.atguigu.spring.aop"})
public class AOPOpenConfig {

}
