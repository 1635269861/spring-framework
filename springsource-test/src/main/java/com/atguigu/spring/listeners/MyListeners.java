package com.atguigu.spring.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author liyongqi.0501
 * @date 2023/11/18 11:58 AM
 * @description
 */
@Component
public class MyListeners implements ApplicationListener<ContextRefreshedEvent> {
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("容器刷新完成");
	}
}
