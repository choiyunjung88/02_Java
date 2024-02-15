package edu.kh.inheritance.model.dto;

public class Student extends Person{
	//private String name;
	//private int age;
	//private String nationality;
	private int grade;
	private int classroom;
	
	public Student() {}

	public Student(String name, int age, String nationality, int grade, int classroom) {
		super(name, age, nationality);
		//this.name = name;
		//this.age = age;
		//this.nationality = nationality;
		this.grade = grade;
		this.classroom = classroom;
	}

	//public String getName() {
		//return name;
	//}

//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getNationality() {
//		return nationality;
//	}
//
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	@Override
	public String toString() {
		return super.toString() + " / " + grade + " / " + classroom;
	}
}
