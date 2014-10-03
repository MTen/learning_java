package com.mten.solo;

import com.mten.solo.Book;

import junit.framework.TestCase;

public class TestBook extends TestCase {

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

}