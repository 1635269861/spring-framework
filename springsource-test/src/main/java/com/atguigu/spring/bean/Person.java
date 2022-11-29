package com.atguigu.spring.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author liyongqi.0501
 * @date 2022/11/29 5:36 PM
 * @description
 */
@Data
@ToString
@Component
public class Person {
	private String name;

//	@Autowired
	private Cat cat;

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Lookup //@Bean注入对象的时候不生效，只有@Component才生效
	public Cat getCat() {
		return cat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
