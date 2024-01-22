package com.atguigu.spring.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author liyongqi.0501
 * @date 2023/11/18 4:53 PM
 * @description
 */
@Component
public class B {

	private A a;

	public B(){
		System.out.println("B 创建了");
	}

	@Autowired
	public void setA(A a) {
		this.a = a;
	}
}
