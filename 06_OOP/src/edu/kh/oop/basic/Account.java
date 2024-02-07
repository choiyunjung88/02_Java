package edu.kh.oop.basic;

import java.util.Arrays;

// 이름 계좌번호 잔액 비밀번호
// 메서드 getter/setter deposit() withdraw()
// deposit() : 전달받은 금액을 잔액에 누적한 후 현재 잔액을 콘솔에 출력
// withdraw() : 비밀번호와 출금할 금액을 전달받아와, 조건에 맞으면 잔액에서 차감 후 현재 잔액 출력

public class Account {
	private String name;
	private String accountNumber;
	private int balance;
	private int password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	public void deposit(int account) {
		this.balance += account;
		System.out.println(balance);
	}
	public void withdraw(int pw, int account) {
		if (pw != this.password) {
			System.out.println("비밀번호 불일치");
		}else if (account > this.balance) {
			System.out.println("잔액 부족");
		}else {
			this.balance -= account;
			System.out.println(balance);
			
		}
	}
	 public String getInfo(String name1, String name2) {
		 String[] arr = new String[2];
		 arr[0] = name1;
		 arr[1] = name2;
		 return Arrays.toString(arr);
	 }
}
