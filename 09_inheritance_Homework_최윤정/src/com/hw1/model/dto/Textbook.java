package com.hw1.model.dto;

public class Textbook extends Book{
	
	private String subject;
	
	public Textbook() {
		super();
	}
	
	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
