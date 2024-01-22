package com.atguigu.spring.bean;

import lombok.Data;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author liyongqi.0501
 * @date 2022/11/29 5:59 PM
 * @description
 */
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Component
public class Cat {

	private String name;


	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
