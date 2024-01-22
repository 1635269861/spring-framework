package com.atguigu.spring.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author liyongqi.0501
 * @date 2023/11/13 10:24 AM
 * @description
 */
@Component
public class MyMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
	public MyMergedBeanDefinitionPostProcessor(){
		System.out.println("MyMergedBeanDefinitionPostProcessor...");
	}

	@Override
	// spring创建好对象，并且完成对象属性的赋值后执行，可以提供一个机会，来返回一个bean，替换Spring中创建好的bean
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyMergedBeanDefinitionPostProcessor...postProcessBeforeInitialization...=>"+bean+"--"+beanName);
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyMergedBeanDefinitionPostProcessor...postProcessAfterInitialization..=>"+bean+"--"+beanName);
		return null;
	}

	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		System.out.println("MyMergedBeanDefinitionPostProcessor...postProcessMergedBeanDefinition..=>"+beanName+"--"+beanType+"---"+beanDefinition);
	}

	@Override
	public void resetBeanDefinition(String beanName) {
		System.out.println("MyMergedBeanDefinitionPostProcessor...resetBeanDefinition.."+beanName);

	}

}
