package com.hw1.model.dto;

public abstract class Book {
	private String title;
	private String author;
	
	public Book() {
		super();
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	public abstract void displayInfo();
}
