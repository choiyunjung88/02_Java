package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	private static int count=0;
	//private Product[] pro;
	Scanner sc = new Scanner(System.in);
	int menu = 0;
	Product[] pro = new Product[5];
	public void mainMenu() {
		do {
			System.out.println("========== 제품 관리 메뉴 =========");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: productInput(); break;
			case 2: productPrint(); break;
			case 0: System.out.println("프로그램 종료..."); break;
			default: System.out.println("메뉴에 있는 번호만 입력해주세요");
			}
		}while(menu != 0);
	}
	
	public void productInput() {
		System.out.print("id : ");
		int id = sc.nextInt();
		System.out.print("name : ");
		String name = sc.next();
		System.out.print("price : ");
		int price = sc.nextInt();
		System.out.print("tax : ");
		double tax = sc.nextDouble();
		pro[getCount()]= new Product(id, name, price, tax);
	}
	
	public void productPrint() {
		for(int i = 0; i < getCount(); i++) {
			System.out.println(pro[i].information());
			
		}
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		ProductController.count = count;
	}
}
