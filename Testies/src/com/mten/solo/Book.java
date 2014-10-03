package com.mten.solo;

import com.mten.solo.Person;

public class Book {
	//fields
	String author;
	String title;
	Person person;
	
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

	public void setPerson(Person p3) {
		this.person = p3;
		
	}

	public Person getPerson() {
		return this.person;
	}
}
