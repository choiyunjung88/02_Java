package edu.kh.array.practice.run;

import java.util.Scanner;

public class PracticeService {

	public void practice1() {
		int[] arr = new int[9];
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			arr[i-1] = i;
			System.out.print(arr[i-1]);
			if ((i-1) % 2 == 0) {
				sum += i;
			}
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
		
	}

	public void practice2() {
		int[] arr = new int[9];
		int sum = 0;
		for (int i = 9; i > 0; i--) {
			arr[9-i] = i;
			System.out.print(arr[9-i]);
			if ((9-i) % 2 == 0) {
				sum += 9-i;
			}
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		for (int i =0; i < input; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i =0; i < 5; i++) {
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
			arr[i] = input;
		}
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		int index = 0;
		boolean flag = false;
		for (int i = 0; i < 5; i++) {
			if (arr[i] == search) {
				index = i;
				System.out.println("인덱스 : "+index);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
		
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String texts = sc.nextLine();
		System.out.print("문자 : ");
		char search = sc.next().charAt(0);
		char[] text = new char[texts.length()];
		for (int i =0; i < texts.length();i++) {
			text[i] = texts.charAt(i);
		}
		int num = 0;
		System.out.print("application에 i가 존재하는 위치(인덱스) :");
		for (int i = 0; i < texts.length(); i++) {
			if (text[i] == search) {
				System.out.print(" "+i);
				num++;
			}
		}
		System.out.println();
		System.out.println("i 개수 : " + num);
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		for(int i = 0; i<num; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int mem = sc.nextInt();
			arr[i] = mem;
		}
		int sum = 0;
		for(int i = 0; i < num; i++) {
			System.out.print(arr[i]+ " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	public void practice7() {
		
	}
}
