package com.model.dto;

import java.util.HashMap;
import java.util.List;


public class Toy implements Comparable<Toy>{
	private String name;
	private int price;
	private String color;
	private int age;
	private int day;
	private List<String> num;
	private HashMap<String, String> ing;
	
	public Toy() {
	}
	
	public Toy(String name, int price, String color, int age, int day, List<String> num) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.age = age;
		this.day = day;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public HashMap getIng() {
		return ing;
	}

	public List<String> getNum() {
		return num;
	}

	public void setNum(List<String> num) {
		this.num = num;
	}

	public void setIng(HashMap<String, String> ing) {
		this.ing = ing;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + " / 사용가능연령 : " + age + " / 제조년월일 : " + day
				+ " / 재료 : " + num ;
	}
	@Override
	public int compareTo(Toy other) {
		return this.day - other.day;
	}
}
