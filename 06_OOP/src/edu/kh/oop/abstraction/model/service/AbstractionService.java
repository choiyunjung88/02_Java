package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능 (비지니스 로직)을 제공하는 클래스
public class AbstractionService {
	
	//ctrl + shift + o : 해당 클래스에서 임포트 안된 것 전부 임포트하기
	public void ex1() {
		// 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1
		// new People(); : 새로운 People 객체를 Heap 영역에 생성
		
		// ** 클래스 이름이 자료형처럼 사용된다
		// == 그래서 클래스를 '사용자 정의 자료형'이라고도 한다**
		/*
		p1.name = "홍길동";
		p1.gender = '남';
		p1.pNo = "200303-123456";
		p1.address = "서울시 중구 남대문로 120 그레이츠청계 3층 E강의장";
		p1.phone = "010-1234-1234";
		p1.age = 4;
		
		System.out.println("p1의 name : " + p1.name);
		System.out.println("p1의 gender : " + p1.gender);
		System.out.println("p1의 pNo : " + p1.pNo);
		System.out.println("p1의 address : " + p1.address);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age);
	}*/
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setpNo("200303-123456");
		p1.setAddress("서울시 중구 남대문로 120 그레이츠청계 3층 E강의장");
		p1.setPhone("010-1234-1234");
		p1.setAge(4);
		
		System.out.println("p1의 name : " + p1.getName());
		System.out.println("p1의 gender : " + p1.getGender());
		System.out.println("p1의 pNo : " + p1.getpNo());
		System.out.println("p1의 address : " + p1.getAddress());
		System.out.println("p1의 phone : " + p1.getPhone());
		System.out.println("p1의 age : " + p1.getAge());
		p1.tax();
		p1.vote();
		
		// 본인 객체
		People yj = new People();
		
		yj.setName("최윤정");
		yj.setAddress("서울시 용산구");
		yj.setAge(23);
		yj.setGender('여');
		yj.setPhone("010-5654-4545");
		yj.setpNo("020808-3234332");
		
		System.out.println("yj의 name : " + yj.getName());
		System.out.println("yj의 gender : " + yj.getGender());
		System.out.println("yj의 pNo : " + yj.getpNo());
		System.out.println("yj의 address : " + yj.getAddress());
		System.out.println("yj의 phone : " + yj.getPhone());
		System.out.println("yj의 age : " + yj.getAge());
		yj.tax();
		yj.vote();
	}}
