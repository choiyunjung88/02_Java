package edu.kh.collection.pack3.model.service;

import java.util.HashMap;
import java.util.Map;

import edu.kh.collection.pack2.model.vo.Person;

/**
 * 
 */
public class MapService {
/*
 * Map : 특정 키워드(key)를 입력하면
 * 		 해당되는 상세한 값(Value)를 얻을 수 있는 컬렉션 객체
 * 
 * - K : V 형식으로 구성
 * 
 * - K : V 한 쌍을 "Entry"라고 부름
 * 
 * - key : 키워드 역할(== 변수명)
 * 1) 중복 X
 * -> 중복되는 key 입력시 value를 덮어씌움
 * -> key 역할의 객체는 hashCode(), equals() 오버라이딩 필수!
 * 
 * 2) 순서 유지 X ( 단, LinkedHashMap 제외)
 * 
 * * key만 묶어서 보면 Set과 같은 특징을 지니고 있음
 * -> Map.keySet() / Map.entrySet() 제공
 * 
 * - Value : 키워드에 해당하는 상세한 값
 *   key로 인해서 모든 value가 구분됨
 * -> Map.get(key) / Map.remove(key) 형태로 사용
 * 
 * 
 * 
 * */
	
	public void method1() {
		
		// HashMap 생성
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// 1. V put(K k, V v) : Map에 추가
		// - Map에 추가시
		//   중복되는 key가 없으면 null
		//   중복되는 key가 있으면 이전 value를 반환
		
		System.out.println(map.put(1, "에그마요"));
		System.out.println(map.put(2, "로티세리바베큐"));
		System.out.println(map.put(3, "스테이크앤치즈"));
		System.out.println(map.put(3, "스파이시쉬림프")); // 3 중복
		
		System.out.println(map);
		System.out.println("-------------------------");
		
		// 2. V get(K k) : key에 해당하는 value 반환
		//                 일치하는 key가 없다면 null 반환
		
		System.out.println(map.get(1)); //에그마요
		System.out.println(map.get(0)); //null
		String temp = map.get(2);
		System.out.println(map);
		// 3. int size()
		System.out.println(map.size());

		
	}

	/**
	 * Map 활용하기 - dto 대체하기
	 * 서로 다른 데이터를 한번에 묶어서 관리해야 하는 경우
	 */
	public void method4() {
		Person p1 = new Person();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
