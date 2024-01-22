package com.atguigu.spring;

import com.atguigu.spring.aop.HelloService;
import com.atguigu.spring.config.AOPOpenConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liyongqi.0501
 * @date 2023/11/18 6:01 PM
 * @description
 */
public class AOPMainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPOpenConfig.class);
		HelloService bean = context.getBean(HelloService.class);
		bean.sayHello("nihao");
	}

}
