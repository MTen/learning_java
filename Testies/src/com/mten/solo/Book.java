package com.mten.solo;

public class Book {
	//fields
	public String author;
	public String title;
	
	//constructor
	public Book(String title) {
		this.title = title;
		this.author = "Unknown";
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

}
