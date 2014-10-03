package com.mten.tutorial;

public class Book {
	//fields
	public String title;
	public String author;
	//constructor
	public Book(String string) {
		this.title = string;
		this.author = "unknown author";
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	
	
	
}
