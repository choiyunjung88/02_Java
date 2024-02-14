package edu.kh.objarray.practice.model.vo;

public class Employee {
	private int num;
	private String name;
	private String dept;
	private String job;
	private int sal;
	
	public Employee(){}
	
	public Employee(int num, String name, String dept, String job, int sal) {
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.sal = sal;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}
