package com.atguigu.spring.factorybeam;

import com.atguigu.spring.bean.Car;
import com.atguigu.spring.bean.Cat;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author liyongqi.0501
 * @date 2023/4/7 6:03 PM
 * @description
 */
public class CarFactoryBean implements FactoryBean<Car> {

	private String carInfo;
	@Override
	public Car getObject() throws Exception {
		String[] carInfos = this.carInfo.split(",");
		Car car = new Car();
		car.setMaxSpeed(Integer.parseInt(carInfos[0]));
		car.setBrand(carInfos[1]);
		car.setPrice(Double.parseDouble(carInfos[2]));
		return car;
	}

	public String getCarInfo() {

		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}

	public void getCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}

	@Override
	public Class<?> getObjectType() {
		return Cat.class;
	}
}
