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
		p1.setMaximumBooks(1);
		ml = new MyLibrary("Test");
	}
	private void addObjects() {
		ml.addBook(b1);
		ml.addBook(b2);
		ml.addPerson(p1);
		ml.addPerson(p2);
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
	
	public void testCheckout() {
		//setup objects
		setup();
		
		addObjects();
		
		assertTrue("Book did not checkout correctly", 
				ml.checkOut(b1,p1));
		assertEquals("Bob", b1.getPerson().getName());
		
		assertFalse("Book was already checked out", 
				ml.checkOut(b1,p2));
		//Check in
		assertTrue("Book checkin Failed", ml.checkIn(b1));
		//Check in a book that wasn't checked out
		assertFalse("Book was already checked in", ml.checkIn(b1));
		assertFalse("Book was never checked out", ml.checkIn(b2));
		
		//additional tests for maximumBooks
		setup();
		addObjects();
		
		assertTrue("First book did not checkout", 
				ml.checkOut(b2, p1));
		assertFalse("Second book should not have checked out",
				ml.checkOut(b1, p1));
	}

	
	public void testGetBooksForPerson(){
		setup();
		addObjects();
		assertEquals(0, ml.getBooksForPerson(p1).size());
		
		ml.checkOut(b1, p2);
		ArrayList<Book> testBooks = ml.getBooksForPerson(p2);
		assertEquals(1, testBooks.size());
		assertEquals(0, testBooks.indexOf(b1));
		
		ml.checkOut(b2,p2);
		testBooks = ml.getBooksForPerson(p2);
		assertEquals(2, testBooks.size());
		assertEquals(1, testBooks.indexOf(b2));
		
	}
}
