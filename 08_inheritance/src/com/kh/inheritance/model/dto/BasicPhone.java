package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone {
	private boolean hasPhysicallKeyboard;
	
	public BasicPhone() {}

	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicallKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicallKeyboard = hasPhysicallKeyboard;
	}
	
	public void checkKeyboard() {
		if (hasPhysicallKeyboard) {
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
		}
	}
	
}
