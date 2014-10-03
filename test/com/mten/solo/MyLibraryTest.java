package com.mten.solo;

import java.util.*;
import junit.framework.TestCase;

public class MyLibraryTest extends TestCase {


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
	
	
}
