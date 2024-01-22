package com.atguigu.spring;

import com.atguigu.spring.aop.HelloService;
import com.atguigu.spring.bean.Cat;
import com.atguigu.spring.bean.Hello;
import com.atguigu.spring.bean.HelloFactory;
import com.atguigu.spring.bean.Person;
import com.atguigu.spring.circle.A;
import com.atguigu.spring.circle.B;
import com.atguigu.spring.config.AOPOpenConfig;
import com.atguigu.spring.config.MainConfig;
import com.atguigu.spring.listeners.AppEventPublisher;
import com.atguigu.spring.listeners.ChangeEvent;
import com.atguigu.spring.listeners.MessageEvent;
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
//		HelloService bean = context.getBean(HelloService.class);
//		bean.sayHello("zhangsan");

//		Person bean = context.getBean(Person.class);
//		System.out.println(bean.getName());
//		for (String beanDefinitionName : context.getBeanDefinitionNames()) {
//			System.out.println(beanDefinitionName);
//		}

//		Cat bean1 = context.getBean(Cat.class);
//		Cat bean2 = context.getBean(Cat.class);
//		System.out.println(bean1 == bean2);
//
//		Person person1 = context.getBean(Person.class);
//		System.out.println(person1);
//		Person person2 = context.getBean(Person.class);
//		System.out.println(person2.getAnimal() == person1.getAnimal());
//		Person bean = context.getBean(Person.class);
//		System.out.println(bean.getCat());
//		A bean = context.getBean(A.class);
//		System.out.println(bean);
//		Hello bean2 = context.getBean(Hello.class);
//		System.out.println(bean2 == bean1);
		//测试事件
//		AppEventPublisher eventPublisher = context.getBean(AppEventPublisher.class);
//		eventPublisher.publish(new A());
//		eventPublisher.publish(new MessageEvent("hello，你好"));
//		eventPublisher.publish(new ChangeEvent(eventPublisher,"sending..."));

//		Hello bean = context.getBean(Hello.class);
//		System.out.println(bean);
//
//		HelloFactory bean1 = context.getBean(HelloFactory.class);
//		System.out.println(bean1);

//		Object helloFactory = context.getBean("helloFactory");
//		System.out.println(helloFactory.getClass()); // class com.atguigu.spring.bean.Hello
//		Object bean = context.getBean("&helloFactory");
//		System.out.println(bean.getClass()); // class com.atguigu.spring.bean.HelloFactory

	}

}
