package com.hw1.model.dto;

public class Poetry extends Book{
	private int numberOfPoems;

	public Poetry() {
		super();
	}

	
	
	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}



	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.printf("[");
	}
	
}
