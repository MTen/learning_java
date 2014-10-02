package com.mten.tutorial;

public class Person {
	//fields
	private String name; //Name of the person
	private int maximumBooks; //Most books the person can check out
	
	//constructors
	public Person() {
		name = "unknown name";
		maximumBooks = 3;
	}
	
	//methods
	public String getName() {
		return name;
	}
	
	public void setName(String anyName) {
		name = anyName;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
}
