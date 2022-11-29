package com.atguigu.spring;

import com.atguigu.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liyongqi.0501
 * @date 2022/11/29 4:50 PM
 * @description
 */
public class MainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Person bean = applicationContext.getBean(Person.class);
		System.out.println(bean);

	}

}
