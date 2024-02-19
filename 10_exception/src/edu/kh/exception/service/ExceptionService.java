package edu.kh.exception.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {

	private Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		System.out.println("두 정수를 입력받아 나누기한 몫을 출력");
		System.out.println("정수 1 입력 : ");
		int input1 = sc.nextInt();
		System.out.println("정수 2 입력 : ");
		int input2 = sc.nextInt();
		
		
		try {
			System.out.println("결과 : " + input1/ input2);// 산술적 예외 0으로 나눌 수 없다
		} catch(ArithmeticException e) {
			System.out.println("infinity");
			
		}
		
		
		
		if(input2 != 0) {
			System.out.println("결과 : " + input1/ input2);
			} else {
			System.out.println("infinity");
		}
	}
	
	public void ex2() {
		// 여러가지 예외에 대한 처리 방법
		
		try {
		System.out.println("입력 1 : ");
		int num1 = sc.nextInt();
		System.out.println("입력 2 : ");
		int num2 = sc.nextInt();
		System.out.println("결과 : "+ num1/num2);
		String str = null;
		System.out.println(str.charAt(0));
		
	} catch(InputMismatchException e){
		System.out.println("타입에 맞는 값만 넣어 주세요");
	} catch(ArithmeticException e) {
		System.out.println("0으로 나눌 수 없습니다");
	} catch(Exception e) {
		// Exception 클래스 : 모든 예외의 최상위 부모
		// 다형성 - 업캐스팅 : 부모타입 참조변수로 자식객체 참조
		// 상위타입의 예외 클래스를 catch 문에 작성하면
		// 다형성 업캐스팅에 의해 모두 잡아서 처리 가능
		
		System.out.println("뭔지 모르겠으나 예외가 발생해서 처리함");
		e.printStackTrace();
		// 발생한 예외에 대한 메서드와 위치에 대한 모든 내용을 출력
		// 예외 발생 지점 추적
	}
	
	
	}
	
	public void ex3() {
		// try - catch - finally
		// finally : try 구문에서 예외가 발생 하든 말든 무조건 마지막에 수행
		try { 
			System.out.println("입력 1 : ");
			int num1 = sc.nextInt();
			System.out.println("입력 2 : ");
			int num2 = sc.nextInt();
			System.out.println("결과 : "+ num1/num2);
			
		}catch(ArithmeticException e) {
			System.out.println("예외 처리 됨");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			System.out.println(e);
		}finally {
			System.out.println("무조건 처리됨");
			sc.close(); // 스캐너 통로 닫기 : 메모리 누수 방지
		}
		
		
		
		
	}
}

// 자바 자료구조 모음 리스트 셋 맵 
// Wrapper Class 기본 자료형을 객체 형태로 업그레이드
// Wrapper 클래스 8가지
// Boolean, Byte, Short, Lok