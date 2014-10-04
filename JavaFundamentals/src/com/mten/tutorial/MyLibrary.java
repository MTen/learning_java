package com.mten.tutorial;

import java.util.ArrayList;
import java.util.Iterator;

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

	public boolean checkOut(Book b1, Person p1) {
		int booksOut = this.getBooksForPerson(p1).size();
		if ((b1.getPerson() == null) &&
				(booksOut < p1.getMaximumBooks())){
			b1.setPerson(p1);
			return true;
		}else{
			return false;
		}
	}

	public boolean checkIn(Book b1) {
		if (b1.getPerson() != null) {
			b1.setPerson(null);
			return true;
		}else{
			return false;
		}
	}

	public ArrayList<Book> getBooksForPerson(Person p1) {
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book aBook : this.getBooks()) {
			if ((aBook.getPerson() != null) && 
					(aBook.getPerson().getName()
							.equals(p1.getName()))) 
			{
			result.add(aBook);
			}
		}
		return result;
	}

	public ArrayList<Book> getAvailableBooks() {
		ArrayList<Book> result = new ArrayList<Book>();
			for (Book aBook : this.getBooks()) {
				if (aBook.getPerson() == null) {
					result.add(aBook);
				}
			}
		return result;
	}

	public ArrayList<Book> getUnavailableBooks(Person p1) {
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book aBook : this.getBooks()) {
			if (aBook.getPerson() != null) {
				result.add(aBook);
			}
		}
	return result;

	}
	
	public String toString() {
		return this.getName() + ": " + 
				this.getBooks().size() + " books; " +
				this.getPeople().size() + " people.";
	}
}
