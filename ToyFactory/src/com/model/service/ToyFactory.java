package com.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.model.dto.Toy;

import edu.kh.collection.pack1.model.vo.Student;

public class ToyFactory {
	private Scanner sc = new Scanner(System.in);
	private List<Toy> lst = new ArrayList<Toy>();
	
	public ToyFactory() {
		final List<String> ingre = new ArrayList<String>();
		ingre.add("면직물");ingre.add("플라스틱");
		final List<String> ingre1 = new ArrayList<String>();
		ingre1.add("면직물");ingre1.add("플라스틱");
		final List<String> ingre2 = new ArrayList<String>();
		ingre2.add("고무");ingre2.add("면직물");ingre2.add("플라스틱");
		final List<String> ingre3 = new ArrayList<String>();
		ingre3.add("면직물");ingre3.add("플라스틱");
		final List<String> ingre4 = new ArrayList<String>();
		ingre4.add("고무");ingre4.add("면직물");

		lst.add(new Toy("키시미시", 15000, "분홍색", 5, 19940505, ingre));
		lst.add(new Toy("캣냅", 27000, "보라색", 8, 19960128, ingre1));
		lst.add(new Toy("파피", 57000, "빨간색", 12, 19931225, ingre2));
		lst.add(new Toy("허기워기", 12000, "파란색", 5, 19940312, ingre3));
		lst.add(new Toy("마미롱레그", 36000, "분홍색", 8, 19950805, ingre4));
		
		
	}
	
	public void displayMenu() {
		
		try {
			
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
				
				
			} while(menuNum != 0);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void delIngredient() {
		
		
	}
	private void addIngredient() {
		
	}
	private void showAgeAble() {
		
	}
	private void showDay() {
		Comparator<Toy> nameComparator = Comparator.comparing(Toy::getDay);
		Collections.sort(lst, nameComparator);
		show(lst);
	}
	private void delete() {
		System.out.print("삭제할 장난감의 이름을 입력하세요: ");
		String name = sc.next();
		for (Toy ty : lst) {
			if(ty.getName().equals( name)) {
				int index = lst.indexOf(ty);
				lst.remove(index);
				System.out.println("장난감이 삭제되었습니다.");
				break;
			}
		}

	}
	private void add() {
		System.out.println("<새로운 장난감 추가>");
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("색상 : ");
		String color = sc.next();
		System.out.print("제조일 (YYYYMMDD 형식으로 입력): ");
		int day = sc.nextInt();
		
			String menuNum = "q";
			List<String> ing = new ArrayList<String>();
			do {
				System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요): ");
				menuNum = sc.nextLine();
				if (!menuNum.equals("q")) {
					ing.add(menuNum);
				}
			} while(!menuNum.equals("q"));
	
		Toy newToy = new Toy(name, price, color, age, day, ing);
		lst.add(newToy);
		System.out.println("새로운 장난감이 추가되었습니다.");
	}
	private void show(List<Toy> list) {
		int i = 1;
		for(Toy ty : list) {
			System.out.print(i++ + ". ");
			System.out.println(ty);
		}
	}
	public static void main(String[] args) {
		ToyFactory tf = new ToyFactory();
		tf.displayMenu();
	}
}
