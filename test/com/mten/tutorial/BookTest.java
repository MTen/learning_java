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
	
}
