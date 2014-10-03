package com.mten.tutorial;

public class Book {
	//fields
	String title;
	String author;
	Person person;
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
	public void setPerson(Person person) {
		this.person = person;
		
	}
	public Person getPerson() {
		return this.person;
	}
	
	
	
}
