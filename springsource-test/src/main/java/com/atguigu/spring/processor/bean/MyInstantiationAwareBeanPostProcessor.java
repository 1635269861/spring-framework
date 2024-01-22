package com.atguigu.spring.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.config.TypedStringValue;
import org.springframework.stereotype.Component;

/**
 * @author liyongqi.0501
 * @date 2023/11/13 10:22 AM
 * @description
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	public MyInstantiationAwareBeanPostProcessor() {
		System.out.println("MyInstantiationAwareBeanPostProcessor...创建了...");
	}
	// 初始化之前，后置处理，给我们一个机会，给这个组件创建对象的回调，如果返回不为空，则直接使用返回的对象
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor...postProcessBeforeInstantiation...");
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor...postProcessAfterInstantiation...");
		return true; //返回false我们给bean赋值的的流程全部结束,将不会进行属性的赋值，对应populateBean的方法
	}

	@Override // 利用自定义的逻辑实现对应的pvs设置，pvs设置的是键值对，也就是对应的属性信息，@Autowire注解也是通过这个方法来实现的，可以参考AutowiredAnnotationBeanPostProcessor
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessor...postProcessProperties...");
		// 下面的示例是修改propertyValue的值
//		if ("person".equals(beanName)) {
//			for (PropertyValue pv : pvs) {
//				String name = pv.getName();
//				if (name.equals("name")) {
//					TypedStringValue value = (TypedStringValue) pv.getValue();
//					value.setValue("李永器");
//				}
//			}
//		}

		return pvs;
	}
}
