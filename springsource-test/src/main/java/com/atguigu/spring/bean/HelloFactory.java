package com.atguigu.spring.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author liyongqi.0501
 * @date 2023/11/12 9:36 PM
 * @description
 */
@Component
public class HelloFactory implements FactoryBean<Hello> {
	@Override
	public Hello getObject() throws Exception {
		return new Hello();
	}

	@Override
	public Class<?> getObjectType() {
		return Hello.class;
	}
}
