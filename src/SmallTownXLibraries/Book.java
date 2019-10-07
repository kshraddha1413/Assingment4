package SmallTownXLibraries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//Title (should be The Da Vinci Code): The Da Vinci Code
//Rented? (should be false): false
//Rented? (should be true): true
//Rented? (should be false): false 

public class Book {

	String title;
	boolean borrowed;

	public static void main(String[] arguments) {
		// Small test of the Book class
		Book example = new Book("The Da Vinci Code");
		System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
		System.out.println("Borrowed? (should be false): " + example.isBorrowed());
		example.borrowed();
		System.out.println("Borrowed? (should be true): " + example.isBorrowed());
		example.returned();
		System.out.println("Borrowed? (should be false): " + example.isBorrowed());
	}

	// Creates a new Book
	public  Book(String bookTitle) {
		title = bookTitle;
	}

	// Marks the book as rented
	public void borrowed() {
		borrowed=true;
	}

	// Marks the book as not rented
	public void returned() {
		borrowed=false;
		
	}

	// Returns true if the book is rented, false otherwise
	public boolean isBorrowed() {
		return borrowed;
	}

	// Returns the title of the book
	public String getTitle() {
      return title;
	}

}
