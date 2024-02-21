package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.vo.Car;
import edu.kh.poly.ex1.model.vo.Spark;
import edu.kh.poly.ex1.model.vo.Tesla;

public class PolyService {

	public void ex1() {
		//다형성 확인 예제
		//Car 객체 생성
		Car car = new Car();
		//부모타입 참조변수 = 부모객체
		
		// tesla 객체 생성
		Tesla tesla = new Tesla();
		
		// 다형성
		
		// 부모타입 참조변수 = 자식객체
		Car car2 = new Tesla(); //오류발생안함
				// 테슬라 객체를 참조하는 변수의 타입이 카이기 때문에
				// 테슬라 객ㅊ체가 부모 객체로 변화함.
		Car car3 = new Spark();
		
		// 다형성 업캐스팅 작성 방법
		
		// 자식객체가 부모객체로 변하였기 때문에
		// 자식만의 고유한 필드, 메서드를 사용할 수 없다.
		
		car.setEngine("6기통 엔진");
		car.setFuel("휘발유");
		car.setWheel(4);
		//Car 메서드 모두 사용 가능
		
		tesla.setEngine("전기모터");
		tesla.setFuel("전기");
		tesla.setWheel(4);
		tesla.setBatteryCapacity(1000000);
		//tesla 부모, 본인의 메서드 모두 사용가능
		
		car2.setEngine("전기모터");
		car2.setFuel("전기");
		car2.setWheel(4);
		// 부모흉내내서 본인 것 사용못함
		
		car3.setEngine("경차엔진");
		car3.setFuel("휘발유");
		car3.setWheel(4);
		
		// 다형성을 이용한 객체 배열
		// 객체배열 : 같은 객체 참조 자료형의 변수를 하나의 묶음으로 다루는 것
		// 부모 타입 참조 자료형의 변수를 하나의 묶음으로 다루는 것
		
		Car[] arr = new Car[3]; // 부모타입 참조변수 배열 선언 및 할당
		// 각 배열 요소 Car 타입 참조변수
		
		arr[0] = car;
		
		arr[1] = car2; // tesla 주소
		
		arr[2] = car3; // Spark 주소
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 인덱스의 엔진 : "+ arr[i].getEngine());
			
		}
		// 상속 + 다형성
		// 상속 특징 : Car 상속 클래스는 모두 겟엔진을 가지고 있다
		// 다형성 : 부모타입 참조변수 arr[i]로 자식 객체를 참조할 수 있다.
	}
	
	// 전달받은 카 또는 자식객체의 엔진 연료, 바퀴갯수를 출력하는 메서드
	// 매개변수에 부모타입 참조변수를 작성하면 모든 자식 객체를 전달받을 수 있다.
	//부모타입 ㅊ참조변수 = 자식타입객체 (업케스팅 모양과 같음)
	public void printCar(Car temp) {
		System.out.println("엔진 : "+temp.getEngine());
		System.out.println("연료 : "+temp.getFuel());
		System.out.println("바퀴 갯수 : "+temp.getWheel());
		System.out.println();
	}
	public void ex2() {
		// 업캐스팅을 이용한 매개변수 이용법
		Tesla t = new Tesla("전기모터","전기",4,10000);
		Spark s = new Spark("경차 엔진", "휘발유", 4, 0.5);
		Car c = new Car("경유엔진", "경유", 12);
		printCar(t);
		printCar(s);
		printCar(c);
	}
	}
  