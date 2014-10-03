package com.mten.tutorial;

import java.util.ArrayList;

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
		p1 = new Person();
		p2 = new Person();
		p1.setName("Bob");
		p2.setName("GRAW");
		ml = new MyLibrary("Test");
	}
	// test constructor
	public void testMyLibrary(){
		MyLibrary ml = new MyLibrary("Test");
		
		assertEquals("Test", ml.name);
		
		assertTrue(ml.books instanceof ArrayList);
		assertTrue(ml.people instanceof ArrayList);
	}

	//removeBook, addBook
	public void testBookMethods() {
		//create test objects
		setup();
		
		//test initial size to be 0
		assertEquals(0, ml.getBooks().size());
		
		ml.addBook(b1);
		ml.addBook(b2);
	
		assertEquals(2, ml.getBooks().size());
		assertEquals(0, ml.getBooks().indexOf(b1));
		assertEquals(1, ml.getBooks().indexOf(b2));
		
		ml.removeBook(b1);
		assertEquals(1, ml.getBooks().size());
		assertEquals(0, ml.getBooks().indexOf(b2));
		
		ml.removeBook(b2);
		assertEquals(0, ml.getBooks().size());
	}

	//addPerson, removePerson
	public void testPeopleMethods() {
		//create test object
		setup();
		
		//test initial size to be 0
		assertEquals(0, ml.getPeople().size());
		
		//adding people to the library
		ml.addPerson(p1);
		ml.addPerson(p2);
		
		//Making sure people were added properly
		assertEquals(2, ml.getPeople().size());
		assertEquals(0, ml.getPeople().indexOf(p1));
		assertEquals(1, ml.getPeople().indexOf(p2));
		
		ml.removePerson(p1);
		assertEquals(1, ml.getPeople().size());
		assertEquals(0, ml.getPeople().indexOf(p2));
		
		ml.removePerson(p2);
		assertEquals(0, ml.getPeople().size());
		
	}
	

	//checkOutBook, checkInBook
	//getAvailableBooks
	//getCheckedOutBooks
	//getBooksForPerson
}
