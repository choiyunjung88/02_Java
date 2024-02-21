package edu.kh.collection.pack4.model.service;

import java.util.ArrayList;
import java.util.List;

public class JavaAPIService {

	/*
	 * - wrap : 감싸다 , 포장하다
	 * 
	 * 기본자료형을 객체로 감싸는 클래스
	 * 기본자료형의 객체화
	 * 왜 컬렉션처럼 객체만 ㅊㄹ리하는 줄 모르겟네
	 * 기본자료형도 취급가능한 ㅎㅕㅇ태로 바꾸기 위해서
	 * 박식 언박싱을 자동으로 술해오디도록
	 * 
	 * 
	 * */
	
	
	public void method1() {
		int num1 = 100; //int
		// 삭제 예정인 방법 ㅂ쓰지마
		Integer wrap1 = num1;
		
		int num2 = wrap1;
		
		long num3 = 10_000_000_000L;
		Long wrap2= num3;
		long num4 = wrap2;
		
		List<Integer>list = new ArrayList<Integer>();
		
		list.add(1000);
		list.add(2000);
		list.add(3000);
		
		System.out.println(list.get(0)+list.get(1)+list.get(2));
		
		
		
		
		
	}
	
	/**
	 * 
	 * 
	 * 
	 * 
	 */
	public void method2() {
		System.out.println(Byte.BYTES);
		System.out.println(Byte.SIZE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Double.NaN);
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.POSITIVE_INFINITY);
		
		
		System.out.println(Boolean.FALSE);
		System.out.println(Boolean.TRUE);
		
		System.out.println("String -> 기본 자료형 변환");
		
		// html 연결시 많이 사용
		// html 관련 모든 값은 string
		
		byte b = Byte.parseByte("1");
		
		short s = Short.parseShort("2");
		int i = Integer.parseInt("3");
		long l = Long.parseLong("4");
		float f = Float.parseFloat("0");
		double d = Double.parseDouble("0");
		boolean bool = Boolean.parseBoolean("true");
		System.out.println("기본 자료형 -> String 변환");		
		long test1 = 12345678910L;
		String change = test1 + "";
		
		int test2 = 400;
		String change2 = Integer.valueOf(test2).toString();
		
		double test3 = 4.321;
		String change3 = Double.valueOf("3").toString();
		
		
		
		
		
		
	}
	
	
	
	public void method3() {
		
	}
	
	public void method5() {
		String temp1 ="abcd";
		
	}
	
	/**
	 * StringBuilder/ StringBuffer 크랠스
	 * 가변성을 가짐 스트링의 불변성 문제를 해결한클래스
	 * 기본 16글자 저장할 크기로 생성
	 * 저장되는 문자열의 길이에 따라 크기가 증가/감소
	 * 마음대로 문자열 수정, 삭제 가능
	 * 수정삭제를 해도 추가적인객체생성이없어효율좋음
	 * StringBuilder : Thread Safe 미제공 (비동기)
	 * -> 멀티쓰레드 환경에서는 StringBuilder 사용시
	 *     쓰레드 충돌 가능성 있음 -> 글자가 깨지거나 오류가 발생
	 *     단일 쓰레드 환경에서 유리
	 *     
	 * StringBuffer : Thread Safe 제공(동기)
	 *  속도면에서는 성능떨어짐
	 *  멀티쓰레드 환경에서는	 *  멀티쓰레드 환경에서 유리
	 */
	public void method6() {
		//StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder();
		//StringBuilder 객체에 문자열을 쌓아나가는 방식으로 사용
		// 뒤에 추가append 앞에 추가(insert)
		sb.append("오늘 점심은 ");
		System.out.println(System.identityHashCode(sb));
		sb.append("무엇을 먹을까요? ");
		System.out.println(System.identityHashCode(sb));
		sb.insert(0, "2월 21일 ");
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb);
		
		//StringBuilder -> String 변환
		String temp = sb.toString(); // 객체에 저장된 필드를 문자열로 반환
		
		// String[] 문자열.split("구분자")
		// - 문자열을 "구분자"를 기준으로 쪼개어 String[]로 반환
		String[] arr = temp.split(" ");
		for(String str : arr) {
			System.out.println(str);
		}
		
		System.out.println("-------------------------");
		// equalsIgnoreCase() : 문자열을 비교할 때 대소문자를 무시하고 비교하는 메서드
		
		String str1 = "hello";
		String str2 = "HELLO";
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("두 문자열은 동일합니다");
		}else {
			System.out.println("두 문자열은 다릅니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}