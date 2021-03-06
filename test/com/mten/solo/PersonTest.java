package com.mten.solo;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
		Person p1 = new Person("unknown name");
		assertEquals("unknown name", p1.getName());
		assertEquals(3, p1.getMaxBooksAllowed());
	}

	public void testSetName() {
		Person p1 = new Person("unknown name");
		p1.setName("Billy");
		assertEquals("Billy", p1.getName());
	}

	public void testSetMaxBooksAllowed() {
		Person p1 = new Person("unknown name");
		p1.setMaxBooksAllowed(10);
		assertEquals(10, p1.getMaxBooksAllowed());
	}
	
	public void testToString(){
		Person p1 = new Person("unknown name");
		p1.setName("Billy");
		p1.setMaxBooksAllowed(10);
		String testString = "Billy has 10 books!";
		assertEquals(testString, p1.toString());
	}

}
