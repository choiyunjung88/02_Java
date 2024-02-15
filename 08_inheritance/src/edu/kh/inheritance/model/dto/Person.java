package edu.kh.inheritance.model.dto;

//DTO Data Trasgerpll
public class Person {
	private String name;
	private int age;
	private String nationality;
	
	public Person() {};

	public Person(String name, int age, String nationality) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public void move() {
		System.out.println("사람은 움직일 수 있다.");
	}
	@Override
	public String toString() {
		//object의 toString() 재정의
		return name + " / " + age + " / " + nationality;
	}
}
