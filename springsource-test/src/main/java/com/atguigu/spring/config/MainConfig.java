package com.atguigu.spring.config;

import com.atguigu.spring.bean.Cat;
import com.atguigu.spring.bean.Person;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liyongqi.0501
 * @date 2023/6/11 1:20 PM
 * @description
 */
@Configuration
//@ComponentScan(basePackages = {"com.atguigu.spring.bean", "com.atguigu.spring.listeners"})
//@ComponentScan(basePackages = {"com.atguigu.spring.bean"})

//@ComponentScan(basePackages = {"com.atguigu.spring.circle"})
@ComponentScan(basePackages = {"com.atguigu.spring.listeners"})
// 使用Import导入对象
@Import({Person.class, MainConfig.MyImportBeanDefinitionRegister.class})
public class MainConfig {

//	@Bean
//	public Person person(){
//		Person person = new Person();
//		person.setName("李永琪");
//		return person;
//	}

	@Bean
	public Cat cat(){
		return new Cat();
	}

	 static class MyImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar{
		@Override
		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
											BeanDefinitionRegistry registry) {
			// Bean Definition
			RootBeanDefinition catDefinition = new RootBeanDefinition();
			catDefinition.setBeanClass(Cat.class);
			// 可以声明定义信息，不是实例化对象的方法
			registry.registerBeanDefinition("tomcat", catDefinition);
		}
	}
}
