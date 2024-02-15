package com.hw1.model.vo;

public class Employee extends Person{
	private int salary;
	private String dept;
	
	public Employee() {
		super();
	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

@Override
public String information() {
	// TODO Auto-generated method stub
	return super.information() + String.format(" / 급여 : %d / 부서 : %s", salary, dept);
}
	
	
}
