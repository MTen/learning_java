package com.mten.tutorial;

import java.util.ArrayList;

public class MyLibrary {

	String name;
	ArrayList<Book> books;
	ArrayList<Person> people;

	public MyLibrary(String name) {
		this.name = name;
		books = new ArrayList<Book>();
		people = new ArrayList<Person>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

	public void addBook(Book book) {
		this.books.add(book);
		
	}

	public void removeBook(Book book) {
		this.books.remove(book);
	}


	public void addPerson(Person person) {
		this.people.add(person);
		
	}

	public void removePerson(Person person) {
		this.people.remove(person);
	}

}
