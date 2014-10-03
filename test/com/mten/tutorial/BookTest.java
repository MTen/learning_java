package com.mten.tutorial;

import junit.framework.TestCase;

public class BookTest extends TestCase {

	public void testBook() {
		Book b1 = new Book("Harry Potter");
		assertEquals("Harry Potter", b1.title);
		assertEquals("unknown author", b1.author);
	}
	
	public void testSetAuthor() {
		Book b2 = new Book("50 Shades of Grey");
		b2.setAuthor("Some Weirdo");
		assertEquals("Some Weirdo", b2.getAuthor());
	}
	
	public void testGetPerson() {
		Book b3 = new Book("War and Peace");
		Person p3 = new Person();
		p3.setName("Elvis");
		
		//method to say book is loand to this person
		
		b3.setPerson(p3);
		
		//get the name of the person who has the book
		
		//Person testPerson = b3.getPerson();
		//String testName = testPerson.getName();
		String testName = b3.getPerson().getName();
		
		assertEquals("Elvis", testName);
	}
}
