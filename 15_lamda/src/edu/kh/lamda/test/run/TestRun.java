package edu.kh.lamda.test.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.kh.lamda.test.LamdaTest;

public class TestRun {

	public static void main(String[] args) {
		LamdaTest lt = new LamdaTest();
		lt.ex();

		// Comparator 의 compare메서드를 라일락으로 대체하여 사용해보기

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(8);
		numbers.add(1);
		
		System.out.println("정렬 전 : "+ numbers);
		Collections.sort(numbers, (a, b) -> a - b);
		
		Runnable runnable = () -> {
			System.out.println("Hello, Lamda!");
			
		};
		
		// 스레드 생성 및 시작
		Thread thread = new Thread(runnable);
		thread.start();
		
		
		
	}
}
