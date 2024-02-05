package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { // 기능 제공용 클래스
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		// if문
		// 조건식이 true 일 때만 내부 코드 수행
		
		/*
		 * [작성법]
		 * if(조건식) {
		 * 		조건식이 true 일 때 수행할 코드
		 * }
		 * 
		 * 
		 * */
		
		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다" 출력
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.print("양수입니다");
		}
		if(input <= 0) {
			System.out.print("양수가 아니다");
		}
	}
	
	public void ex2() {

		
		// if - else 문
		// 조건식 결과가 true면 if 문,
		// false면 else 구문이 수행됨
		
		/*
		 * [작성법]
		 * if(조건식){
		 * 		조건식이 true일 때 수행될 코드
		 * } else {
		 * 		조건식이 false일 때 수행될 코드
		 * } 
		 * 
		 * */
		
		// 홀짝 검사
		// 입력받은 정수 값이 홀수이면 "홀수입니다" 출력
		// 0이면 "0입니다"
		// 짝수이면 "짝수입니다" 출력
		// else if 사용 X, 중첩 if 문 사용하기
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.print("0입니다");
		}else {
			if(input % 2 == 0) {
				System.out.print("짝수입니다");
			} else {
					System.out.print("홀수입니다");
	}
		}}

	public void ex3() {
		// 양수, 음수, 0 판별
		// if(조건식) - else if(조건식) - else
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		if(input> 0) {
			System.out.println("양수입니다");
		} else if (input <0)  {
			System.out.println("음수입니다");
		}
	}
	public void ex4() {
		
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 단, 겨울일때 온도가 -15 이하 '한파경보', -12이하 "한파 주의모"
		// 여름일 때 온도가 35도 이상 " 폭염 경보", 33도 이상 "폭염 주의보"
		// 1~2, 12 겨울
		// 3~5 봄
		// 6~8 여름
		// 9~ 11 가을
		
	}
	public void ex5() {
		System.out.print("나이 : ");
		int input = sc.nextInt();
		if(input <= 13) {
			System.out.println("어린이입니다");
		} else if (input > 19) {
			System.out.println("성인입니다");
		} else {
			System.out.println("청소년입니다");
		}
	}
	public void ex6() {
		System.out.print("점수 : ");
		int input = sc.nextInt();
		if(input >= 90 && input <= 100) {
			System.out.print("A");
		} else if (input >= 80) {
			System.out.print("B");
		} else if (input >= 70) {
			System.out.print("C");
		} else if (input >= 60) {
			System.out.print("D");
		} else if (input >= 0 && input <= 60) {
			System.out.print("F");
		} else {
			System.out.print("잘못입력하셨습니다");
		}
	}
	public void ex7() {
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println("키 : ");
		float height = sc.nextFloat();
		if (age >= 12 && age <= 100 && height >= 140.0) {
			System.out.println("탑승 가능");
		} else if (age < 12 && age >= 0) {
			System.out.println("적정 연령이 아닙니다");
		} else if (height < 140.0) {
			System.out.println("적정 키가 아닙니다");
		} else {
			System.out.println("잘못입력하셨습니다");
		}
	}
	public void ex8() {
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println("키 : ");
		float height = sc.nextFloat();
		if(age > 100 || age < 0) {
			System.out.println("나이를 잘못 입력하셨습니다");
			return;
		}else if (height > 250.0 || height < 0) {
			System.out.println("키를 잘못 입력하셧습니다");
			return;
		}
		if (age >= 12 && height >= 140.0) {
			System.out.println("탑승 가능");
		} else if (age >= 12 && height < 140.0) {
			System.out.println("나이는 적절하나, 키가 적절치 않음");
		} else if (age < 12 && height >= 140.0) {
			System.out.println("키는 적절하나, 나이는 적절치 않음");
		} else { 
			System.out.println("나이와 키 모두 적절치 않음");
		}
	}
}
