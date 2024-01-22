package com.atguigu.spring.processor.bean;

import com.atguigu.spring.bean.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author liyongqi.0501
 * @date 2023/11/13 10:18 AM
 * @description
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		System.out.println("MyBeanPostProcessor....创建了...");
	}
	// 能够给一个机会，直接new出来对象返回可以覆盖spring中创建的对象，直接替代spring中创建的bean
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("MyBeanPostProcessor......postProcessBeforeInitialization...");
//		if (beanName.equals("person")) {
//			Person person = new Person();
//			person.setName("朱蕊");
//			return person;
//		}
		return bean;
	}

	@Override
	// 提供一个方法，返回一个bean来替换spring中创建的bean，在postProcessBeforeInitialization方法后执行
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor......postProcessAfterInitialization...");
//		if (beanName.equals("person")) {
//			Person person = new Person();
//			person.setName("小猴");
//			return person;
//		}
		return bean;
	}
}
