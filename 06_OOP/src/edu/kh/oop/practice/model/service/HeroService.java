package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	public void ex1() {
		Hero h1 = new Hero();
		h1.setNickName("iron man");
		h1.setJob("CEO");
		h1.setHp(100);
		h1.setMp(10);
		h1.setLevel(0);
		h1.setExp(0);
		h1.attack(500);
		h1.magicJump();
		
		Hero h2 = new Hero();
		h1.setNickName("spider man");
		h1.setJob("student");
		h1.setHp(100);
		h1.setMp(100);
		h1.setLevel(0);
		h1.setExp(0);
		h1.attack(100);
		h1.magicJump();
		
		
		
		// 현실 객체 : object 
		// 객체 지향 언어 : 객체들로 묶고 기능으로 설명하는 것
		// 자바 객체 : 동일한 성질을 갖는 것들을 객체로 묶음
		// class : 객체에 대한 설명을 구현한 것
		// new 연산자 : 새로운 객체를 생성하는 연산자
		// 추상화 : 동일한 성질을 가지는 객체를 추상적으로 묶는 것
		// 캡슐화 : 어디서든지 객체에 접근할 수 없도록 private 설정을 하는 것
		// 캡슐화 원칙 : 모든 객체는 캡슐화 되어야한다
		// 메서드/기능의 정의란 : 객체가 할 수 있는 행동
		// 메서드의 호출이란 : 객체가 실제 행동을 함
		// return : 값을 반환함
		// public String ex1() {
		//			return "Hi";
		//}
		//위 메서드 상세히 해석 : 이름이 ex1인 메서드로서 매개변수는 없고 "Hi"라는 String 값을 반환한다.

		
		// 현실 객체 : 자신의 속성과 기능이 다른 것들과 구분되어 식별 가능한 것
		// 객체 지향 언어 : 현실 세게는 각각의 객체로 이루어져 있으며 발생하는 모든 사건은 객체간의 상호작용이다. 이 개념을 컴퓨터로 옯겨 놓아 만들어 낸 것이 객체 지향 언어이다.
		// 자바 객체 : 클래스에 정의된 내용대로 new 연산자를 통해 메모리영역에 생성된 것
		// class : 객체의 특성에 대한 정의를 한 것
		// new 연산자 : 새로운 객체를 생성하는 연산자
		// 추상화 : 유연성을 확보하기 위해 구체적인 것은 제거한다는 의미.
		//작성하려는 클래스의 속성과 기능 중 프로그램에서 필요한 공통점을 추출하고, 
		//불필요한 부분을 제거하는 과정
		// 캡슐화 : 추상화를 통해 정리된 데이터들과 기능을 하나로 묶어 관리하는 기법. 
		//클래스의 가장 중요한 목적인 데이터의 직접 접근제한을 원칙으로 하여 클래스 외부에서 
		//데이터의 직접적인 접근을 막고, 대신 간접적으로 데이터에 접근할 수 있게 
		//메소드를 클래스 내부에 작성하는 방법.
		// 캡슐화 원칙 : 1. 클래스의 멤버 변수에 대한 접근 권한은 private을 원칙으로 한다.
		//2. 클래스의 멤버 변수에 대한 연산처리를 목적으로 하는 멤버 메소드는 클래스 내부에 작성한다.
		//3. 멤버 메소드는 클래스 밖에서 접근할 수 있도록 public으로 설정한다.
		// 메서드/기능의 정의란 : 객체가 할 수 있는 행동
		// 메서드의 호출이란 : 객체가 실제 행동을 함
		// return : 값을 반환함
		// public String ex1() {
		//			return "Hi";
		//}
		//위 메서드 상세히 해석 : 이름이 ex1인 메서드로서 매개변수는 없고 "Hi"라는 String 값을 반환한다.

		
		
		// 현실 객체 : 속성과 기능을 가진 독립적으로 인식되는 모든 것
		// 객체 지향 언어 : 객체 간의 상화작용에 대한 개념을 컴퓨터로 옮겨 만들어낸 것.
		// 자바 객체 : 클래스에 정의된 내용대로 new 연산자를 통해 메모리 영역에 생성한 것
		// class : 객체의 속성과 기능에 대한 정의를 한 것 (설계)
		// new 연산자 : new
		// 추상화 : 동일한 성질을 가지는 객체를 추상적으로 묶는 것
		// 캡슐화 : 어디서든지 객체에 접근할 수 없도록 private 설정을 하는 것
		// 캡슐화 원칙 : 모든 객체는 캡슐화 되어야한다
		// 메서드/기능의 정의란 : 객체가 할 수 있는 행동
		// 메서드의 호출이란 : 객체가 실제 행동을 함
		// return : 값을 반환함
		// public String ex1() {
		//			return "Hi";
		//}
		//위 메서드 상세히 해석 : 
	}
}
