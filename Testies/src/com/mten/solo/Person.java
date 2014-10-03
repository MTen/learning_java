package com.mten.solo;

public class Person {
	//fields
	private String name;
	private int maxBooksAllowed;
	
	//constructors
	
	public Person() {
		name = "unknown name";
		maxBooksAllowed = 3;
	}
	
	//methods
	
	//getter for name
	public String getName() {
		return name;
	}
	//setter for name
	public void setName(String anyName) {
		name = anyName;
	}
	
	public int getMaxBooksAllowed() {
		return maxBooksAllowed;
	}

	public void setMaxBooksAllowed(int maxBooksAllowed) {
		this.maxBooksAllowed = maxBooksAllowed;
	}
	
	public String toString() {
		return this.getName()+ " has " +this.getMaxBooksAllowed()+ " books!";
	}
	
}

