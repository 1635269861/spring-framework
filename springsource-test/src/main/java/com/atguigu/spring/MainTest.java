package com.atguigu.spring;

import com.atguigu.spring.bean.Person;
import com.atguigu.spring.circle.B;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liyongqi.0501
 * @date 2022/11/29 4:50 PM
 * @description
 */
public class MainTest {

	public static void main(String[] args) {
		BeanFactory applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
//		Cat bean = (Cat) applicationContext.getBean("cat");
//		System.out.println(bean.getName());
//		Cat car = (Cat) applicationContext.getBean("cat");
//		System.out.println(car.getName());
		B bean = applicationContext.getBean(B.class);
		System.out.println(bean);

	}

}
