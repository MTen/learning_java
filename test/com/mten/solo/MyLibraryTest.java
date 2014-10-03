package com.mten.solo;

import java.util.*;
import junit.framework.TestCase;

public class MyLibraryTest extends TestCase {
	
	private Book b1;
	private Book b2;
	private Person p1;
	private Person p2;
	private MyLibrary ml;
	
	public void setup() {
		b1 = new Book("Book1");
		b2 = new Book("Book2");
		p1 = new Person("Guy");
		p2 = new Person("Gal");
		ml = new MyLibrary("MINE");
	}

	// Create constructor
	public void testMyLibrary() {
		//Make Constructor take a named parameter
		MyLibrary ml = new MyLibrary("Test");
		//Make sure obj.name = parameter
		assertEquals( "Test", ml.name);
		//Make sure array of books is an Array object
		assertTrue(ml.books instanceof ArrayList);
		//Make sure array of people is an Array object
		assertTrue(ml.people instanceof ArrayList);
	}
	
	public void testBookMethods(){
		//Create objects and make sure library is empty
		setup();
		assertEquals(0, ml.books.size());
		
		//Add books to library
		ml.addBook(b1);
		ml.addBook(b2);
		assertEquals(2, ml.books.size());
		assertEquals(0, ml.getBooks().indexOf(b1));
		assertEquals(1, ml.getBooks().indexOf(b2));
		
		//Remove books from library
		ml.removeBook(b1);
		assertEquals(1, ml.books.size());
		assertEquals(0, ml.getBooks().indexOf(b2));
	}
	
	
}
