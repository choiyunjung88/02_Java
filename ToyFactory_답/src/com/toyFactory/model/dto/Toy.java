package com.toyFactory.model.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import com.model.dto.Toy;
import com.model.service.ToyFactory;

public class Toy {
	private String name;
	private int price;
	private String color;
	private int age;
	private int day;
	private Set<String> num;
	
	
	
	public Toy() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Toy(String name, int price, String color, int age, int day, Set<String> num) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.age = age;
		this.day = day;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public Set<String> getNum() {
		return num;
	}
	public void setNum(Set<String> num) {
		this.num = num;
	}
	
	// meterials 안에 있는 모든 재료를 문자열 형태로 만들어 반환하는 메서드
	public String getMaterialsAsString() {
		StringBuilder sb = new StringBuilder();
		for(String meterial : num) {
			sb.append(meterial).append(", ");
		}
		// 마지막 쉼표와 공백 제거하기
		if(sb.length() > 0) {
			sb.setLength(sb.length() - 2);
			
		}
		return sb.toString();
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, color, day, name, num, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color) && day == other.day
				&& Objects.equals(name, other.name) && Objects.equals(num, other.num) && price == other.price;
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + " / 사용가능연령 : " + age + " / 제조년월일 : " + day
				+ " / 재료 : " + getMaterialsAsString() ;
	}
}
