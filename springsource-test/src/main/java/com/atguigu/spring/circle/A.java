package com.atguigu.spring.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author liyongqi.0501
 * @date 2023/11/18 4:53 PM
 * @description
 */
@Component
public class A {

	private B b;

	public A(){
		System.out.println("A 创建了");
	}

	@Autowired
	public void setB(B b) {
		this.b = b;
	}
}
