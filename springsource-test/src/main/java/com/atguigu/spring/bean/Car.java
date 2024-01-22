package com.atguigu.spring.bean;

/**
 * @author liyongqi.0501
 * @date 2023/4/7 6:04 PM
 * @description
 */
public class Car {

	private Integer maxSpeed;

	private String brand;

	private Double price;

	public Integer getMaxSpeed() {
		return maxSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
