package edu.kh.oop.basic;

import java.util.Scanner;

public class AccountRun {
	public static void main(String[] args) {
		
		// Account 객체 생성
		Account a1 = new Account();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("계좌번호 : ");
		String accNum = sc.next();
		
		System.out.print("잔액 : ");
		long bal = sc.nextLong();
		
		System.out.print("비밀번호 지정 : ");
		String pw = sc.next();
		
		
		
		a1.setName(name);
		a1.setAccountNumber(accNum);
		a1.setBalance(bal);
		a1.setPassword(pw);
		
		System.out.println( a1.getName() );
		System.out.println( a1.getAccountNumber() );
		System.out.println( a1.getBalance() );
		System.out.println( a1.getPassword() );
		
		a1.deposit(50000);
		a1.withdraw("1234", 2000); // 비밀번호 불일치
		a1.withdraw("7890", 200000000); // 잔액부족
		a1.withdraw("7890", 1000);
		
		System.out.println("=========================");
		Account a2 = new Account();
		
		a2.setAccountNumber("7777-777-77777");
		a2.setName("박수찬");
		a2.setBalance(1000);
		a2.setPassword("1111");
		
		a2.deposit(10000);
		a2.withdraw("2222", 1000);
		a2.withdraw("1111", 1000000);
		a2.withdraw("1111", 5000);
		
		
		
		
		
		
	}
}
