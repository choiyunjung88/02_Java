package edu.kh.attendance.model.dto;

import java.io.Serializable;

public class Attendance implements Serializable{
	private String name;
	private int age;
	private char gender;
	private int grade;
	private char assignment;
	
	public Attendance() {
		// TODO Auto-generated constructor stub
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public char getAssignment() {
		return assignment;
	}
	public void setAssignment(char assignment) {
		this.assignment = assignment;
	}
	public Attendance(String name, int age, char gender, int grade, char assignment) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.grade = grade;
		this.assignment = assignment;
	}
	


}
