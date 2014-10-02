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
	
	/**
	 * @return the maxBooksAllowed
	 */
	public int getMaxBooksAllowed() {
		return maxBooksAllowed;
	}

	/**
	 * @param maxBooksAllowed the maxBooksAllowed to set
	 */
	public void setMaxBooksAllowed(int maxBooksAllowed) {
		this.maxBooksAllowed = maxBooksAllowed;
	}	
}

