package edu.kh.poly.ex2.model.vo;

public class Fish extends Animal{

	// 알트시프트에스 -> override/implements...
	
	public Fish() {
		// TODO Auto-generated constructor stub
	}
	
	public Fish(String type, String eatType) {
		super(type, eatType);
	}
	
	@Override
	public String toString() {
		return "Fish : " + super.toString();
	}

	@Override
	public void eat() {
		System.out.println("입을 뻐끔뻐끔");
	}

	@Override
	public void breath() {
		System.out.println("아가미 호흡");
	}

	@Override
	public void move() {
		System.out.println("꼬리로 헤엄");
	}
	
}
