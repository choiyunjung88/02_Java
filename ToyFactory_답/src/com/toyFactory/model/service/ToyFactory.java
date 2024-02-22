package com.toyFactory.model.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.toyFactory.model.dto.Toy;

public class ToyFactory {

	
	private Scanner sc = new Scanner(System.in);
	
	private Set<Toy> toySet = new HashSet<Toy>(); // 중복된 Toy 객체가 없도록 저장할 컬렉션 중 Set
	private Map<Integer, String> meterialMap = new HashMap<Integer, String>();
	
	public ToyFactory() {
		// 기본 등록된 재료
		meterialMap.put(1,  "면직물");
		meterialMap.put(2,  "플라스틱");
		meterialMap.put(3,  "유리");
		meterialMap.put(4,  "고무");	
		
		
		// 다섯개 장난감 생성하기
		new Toy("키시미시", 15000, "분홍색", 5, 19940505, addMaterials(1, 2) );
		new Toy("캣냅", 27000, "보라색", 8, 19960128, addMaterials(1, 2) );
		new Toy("파피", 57000, "빨간색", 12, 19931225, addMaterials(1, 2) );
		new Toy("허기워기", 12000, "파란색", 5, 19940312, addMaterials(1, 2) );
		new Toy("마미롱레그", 36000, "분홍색", 8, 19950805, ingre4)
		
		
	}
	
	//materials 에 전달 받은 값들을 추가하고 Set으로 반환하느 메서드
	public Set<String> addMaterials(Integer...newMaterials){
		Set<String> addedMaterials = new HashSet<String>();
		for (Integer materialKey : newMaterials) {
			
			// 맵에서 해당번호 key에 해당하는 재료를 가져와 추가
			
			String materialValue = meterialMap.get(materialKey);
			if (materialValue != null) {
				addedMaterials.add(materialValue);
			}
		}
		return addedMaterials;
	}
	
	
public void displayMenu() {

			int menuNum = 0;
			do {

				System.out.println("<< 플레이타임 공장 >>");
				System.out.println("1. 전체 장난감 조회하기");
				System.out.println("2. 새로운 장난감 만들기");
				System.out.println("3. 장난감 삭제하기");
				System.out.println("4. 장난감 제조일 순으로 조회하기");
				System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
				System.out.println("6. 재료 추가");
				System.out.println("7. 재료 제거");

				System.out.print("선택 : ");
				
				menuNum = sc.nextInt();
				
d				
				try {
					menuNum = sc.nextInt();
					
					switch(menuNum) {
					case 1 : show(lst); break;
					case 2 : add(); break;
					case 3 : delete(); break;
					case 4 : showDay(); break;
					case 5 : showAgeAble(); break;
					case 6 : addIngredient(); break;
					case 7 : delIngredient(); break;
					default : System.out.println("잘못 입력하셨습니다.메뉴에 있는 번호를 입력해주세요"); break;

					}
			} catch (Exception e) {
				System.out.println("알맞은 입력을 해라...");
				sc.nextLine();
				menuNum = -1;
			}
		
				
			} while(menuNum != 0);
	
}	



	public void displayAlways() {
		
	}


	public void createNewToy() throws Exception{
		
		System.out.println("<재료 추가>");
		System.out.println("--현재 등록된 재료--");
	}

	








	
}
