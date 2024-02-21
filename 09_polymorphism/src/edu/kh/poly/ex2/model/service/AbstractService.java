package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.vo.Fish;
import edu.kh.poly.ex2.model.vo.Person;

public class AbstractService {
	public void ex1() {
		// Animal al = new Animal ();
		// 객체화 할수 없음 추상클래스라서
		
		// 클래스 : 객체의 속성, 기능을 정의한 것(일종의 설계도)
		// 추상 클래스 : 미완성 메서드를 포함한 클래스 (미완성 설계도)
		// -> 미완성 설계도로는 객체를 만들 수 없다 -> 오류발생
		
		// -> Animal을 상속받아 미완성 부분을 구현한
		// 클래스를 이용해 객체 생성
		// 추상클래스를 상속받은 자식 객체 생성
		Person p1 = new Person();
		
		p1.setName("홍길동");
		
		// 상속받은 기능 호출
		p1.setType("척추동물");
		p1.setEatType("잡식");
		
		p1.eat();
		p1.breath();
		p1.move();
		
		Fish f1 = new Fish();
		
		f1.eat();
		f1.breath();
		f1.move();
		
		
		
		
		
	}
}
