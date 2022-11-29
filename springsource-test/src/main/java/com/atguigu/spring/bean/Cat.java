package com.atguigu.spring.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author liyongqi.0501
 * @date 2022/11/29 5:59 PM
 * @description
 */
@Component
@Scope(scopeName = "prototype")
public class Cat {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Cat : name : " + name;
	}
}
