package com.atguigu.spring.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author liyongqi.0501
 * @date 2022/11/29 5:36 PM
 * @description
 *
 * Aware接口：帮我们装配Spring底层的一些组件
 * 1. Bean的功能增强全部都是由BeanPostProcessor+InitialzingBean（合起来完成的）
 */
@Data
@Component
public class Person implements ApplicationContextAware, MessageSourceAware, InitializingBean {
	private String name;
	private Cat cat;


	private ApplicationContext applicationContext;

	private MessageSource messageSource;

//	@Autowired
	// 发现Autorewired是怎么完成的
	public void setCat(Cat cat) {
		System.out.println("Person Cat set");
		this.cat = cat;
	}

	public Person() {
		System.out.println("Person被创建了。。。。");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Person name set....");
		this.name = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext 方法执行，。，。，");
		this.applicationContext = applicationContext;
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Cat getCat(){
		return this.cat;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Person...afterPropertiesSet");
	}

	public void myInitMethod(){
		System.out.println("myInitMethod方法执行了....");
	}
}
