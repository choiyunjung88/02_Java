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
}
