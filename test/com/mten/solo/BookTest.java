package com.mten.solo;

import junit.framework.TestCase;

public class BookTest extends TestCase {

	public void testBook() {
		Book b1 = new Book("Outliers");
		assertEquals("Outliers", b1.getTitle());
		assertEquals("Unknown", b1.getAuthor());
	}
	
	public void testSetAuthor() {
		Book b2 = new Book("Outliers");
		b2.setAuthor("Malcom Gladwell");
		assertEquals("Malcom Gladwell", b2.getAuthor());
	}
	//Method for retrieving the person who currently has the book.
	public void testGetPerson(){
		Book b3 = new Book ("Thingy");
		Person p3 = new Person ("That guy");
		
		//setter method to assign the person to the book 
		b3.setPerson(p3);
		
		//getter method to find out which person object has the book
		Person testPerson = b3.getPerson();
		String testName = testPerson.getName();
		
		assertEquals("That guy", testName);
		
	}

}