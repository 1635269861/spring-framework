package com.atguigu.spring.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

/**
 * @author liyongqi.0501
 * @date 2023/11/13 10:25 AM
 * @description
 */
@Component // bean进行代理增强
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

	public MySmartInstantiationAwareBeanPostProcessor(){
		System.out.println("MySmartInstantiationAwareBeanPostProcessor...");
	}
	// 预测Bean的类型，最后一次改变组件的类型，干预组件的类型，直接改变Bean Type
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor...predictBeanType=>"+beanClass+"--"+beanName);
		return null;
	}
	// 返回我们要使用的构造器
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName)

			throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor...determineCandidateConstructors=>"+beanClass+"--"+beanName);
		// 返回指定的构造器
		return null;
	}
	// 返回早期的Bean引用
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor...getEarlyBeanReference=>"+bean+"--"+beanName);

		return bean;
	}


}
