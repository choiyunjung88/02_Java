package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

public class InheritanceService {
		public void ex1() {
			Person p = new Person();
			
			p.setName("홍길동");
			p.setAge(25);
			p.setNationality("대한민국");
			
			System.out.println(p.getName());
			System.out.println(p.getAge());
			System.out.println(p.getNationality());
			System.out.println("=========================");
			
			Student std = new Student();
			
			std.setGrade(3);
			
			Employee emp = new Employee();
			
			
		}
		
		
		
		public void ex3() {
			Student std = new Student();
			Employee emp = new Employee();
			std.move(); // 오버라이딩 X -> Person의 메소드 수행
		}
		
		//toString 오버라이딩 확인 예제
		public void ex4() {
			Person p = new Person("김철수", 17, "한국");
			System.out.println(p.toString());
			System.out.println(p);
			// print 구문 수행시 참조변수 명을 작성하면
			// 자동으로 toString() 메소드를 호출해서 출력해준다
			System.out.println("------------------------------");
			
			Student std = new Student("이백점", 18, "미국", 2, 6);
			
			System.out.println(std.toString());
			Employee emp = new Employee("김노동", 30, "한국", "삼성전자");
			System.out.println(emp);
		}
	}

