package com.mten.solo;

import java.util.*;;

public class MyLibrary {
	//fields set to package private
	String name;
	ArrayList<Book> books;
	ArrayList<Person> people;

	//Constructor
	public MyLibrary(String name) {
		this.name = name;
		this.books = new ArrayList<Book>();
		this.people = new ArrayList<Person>();
	}

	// Users can addBooks to their library library.addBook(book ref)
	public void addBook(Book book) {
		this.books.add(book);
	}
	
	//returns an array of book objects
	public ArrayList<Book> getBooks() {
		return books;
	}
	//removes a book object from the book array
	public void removeBook(Book book) {
		this.books.remove(book);
	}
	
	

}
