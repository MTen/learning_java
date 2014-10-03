package com.mten.solo;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
		Person p1 = new Person();
		assertEquals("unknown name", p1.getName());
		assertEquals(3, p1.getMaxBooksAllowed());
	}

	public void testSetName() {
		Person p1 = new Person();
		p1.setName("Billy");
		assertEquals("Billy", p1.getName());
	}

	public void testSetMaxBooksAllowed() {
		Person p1 = new Person();
		p1.setMaxBooksAllowed(10);
		assertEquals(10, p1.getMaxBooksAllowed());
	}

}
