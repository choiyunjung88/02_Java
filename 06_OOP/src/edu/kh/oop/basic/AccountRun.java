package edu.kh.oop.basic;

import java.util.Scanner;

public class AccountRun {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.setName("최윤정");
		ac.setAccountNumber("1234567-1234567");
		ac.setBalance(100000);
		ac.setPassword(1234);
		ac.deposit(100);
		ac.withdraw(1234, 1000000);
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();
		String name2 = sc.next();
		System.out.println(ac.getInfo(name1, name2));
	}
}
