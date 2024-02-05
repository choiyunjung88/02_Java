package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
		Scanner sc = new Scanner(System.in);
	public void practice1() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		if (input < 0) {
			System.out.println("양수만 입력해주세요");
		} else if (input % 2 == 1) {
			System.out.println("홀수입니다");
		} else {
			System.out.println("짝수입니다");
		}
	}
	public void practice2() {
		System.out.print("국어점수 : ");
		int ko = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		if (ko >= 40 && math >= 40 && eng >=40 && (ko+math+eng)/3 >=60) {
			System.out.println("국어 : " + ko);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + (ko + math + eng));
			System.out.println("평균 : " + (ko + math + eng)/3);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	public void practice3() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		int days;
		switch (month) {
		case 1: {
			days = 31;
			break;
		}
		case 3: {
			days = 31;
			break;
		}
		case 5: {
			days = 31;
			break;
		}
		case 7: {
			days = 31;
		}
		case 8: {
			days = 31;
			break;
		}
		case 10: {
			days = 31;
			break;
		}
		case 12: {
			days = 31;
			break;
		}
		case 4: {
			days = 30;
			break;
		}
		case 6: {
			days = 30;
			break;
		}
		case 9: {
			days = 30;
			break;
		}
		case 11: {
			days = 30;
			break;
		}
		case 2: {
			days = 28;
			break;
		}
		default:
			days = 0;
			System.out.println(month+"월은 잘못 입력된 달입니다.");
		}
		System.out.println(month+"월은 "+days+"일까지 있습니다.");
	}
	
	public void practice4() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		double bmi = weight/(height * height);
		System.out.println("BMI 지수 : "+bmi);
		String body = "";
		if (bmi < 18.5) {
			body = "저체중";
		} else if (bmi < 23) {
			body = "정상체중";
		} else if (bmi < 25) {
			body = "과체중";
		} else if (bmi < 30) {
			body = "비만";
		} else {
			body = "고도 비만";
		}
		System.out.println(body);
	}
}
