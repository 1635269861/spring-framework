package com.atguigu.spring;

import com.atguigu.spring.bean.Cat;
import com.atguigu.spring.bean.Person;
import com.atguigu.spring.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 注解版spring的用法
 * @author liyongqi.0501
 * @date 2022/11/29 5:48 PM
 * @description
 */
public class AnnotationMainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
//		Person person = context.getBean(Person.class);
//		System.out.println(person);
//		System.out.println(person.getName());

//		String[] beanDefinitionNames = context.getBeanDefinitionNames();
//		for (String beanDefinitionName : beanDefinitionNames) {
//			System.out.println(beanDefinitionName);
//		}

//		Cat cat1 = context.getBean(Cat.class);
//		System.out.println(cat1);
//		Cat cat2 = context.getBean(Cat.class);
//		System.out.println(cat2 == cat1);


		Person person1 = context.getBean(Person.class);
		Person person2 = context.getBean(Person.class);
		System.out.println(person1.getCat());
		System.out.println(person1.getCat() == person2.getCat());


	}

}
