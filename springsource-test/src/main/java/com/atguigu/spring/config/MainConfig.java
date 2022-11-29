package com.atguigu.spring.config;

import com.atguigu.spring.bean.Cat;
import com.atguigu.spring.bean.Person;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author liyongqi.0501
 * @date 2022/11/29 5:51 PM
 * @description
 */
@Configuration
//@Import({ MainConfig.MyImportRegister.class})
@ComponentScan("com.atguigu.spring")
public class MainConfig {

//	@Bean
	public Person person(){
		Person person = new Person();
		person.setName("里斯");
		return person;
	}


   public static class MyImportRegister implements ImportBeanDefinitionRegistrar{

		/**
		 *
		 * @param importingClassMetadata annotation metadata of the importing class
		 * @param registry current bean definition registry Bean定义信息的注册中心
		 *                       里面都是BeanDefinition，不可以给属性设置，只能设置类的相关信息
		 */
		@Override
		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
			RootBeanDefinition catBeanDefinition = new RootBeanDefinition();
			catBeanDefinition.setBeanClass(Cat.class);
			// spring 这个实例的名字
			registry.registerBeanDefinition("tomCat", catBeanDefinition);
		}
	}

}
