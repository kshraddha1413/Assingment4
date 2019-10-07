package SmallTownXLibraries;
//Library hours:

//Libraries are open daily from 9am to 5pm.
//
//Library addresses:
//10 Main St.
//228 Liberty St.
//
//Borrowing The Lord of the Rings:
//You successfully borrowed The Lord of the Rings
//Sorry, this book is already borrowed.
//Sorry, this book is not in our catalog.
//
//Books available in the first library:
//The Da Vinci Code
//Le Petit Prince
//A Tale of Two Cities
//
//Books available in the second library:
//No book in catalog

//Returning The Lord of the Rings:
//You successfully returned The Lord of the Rings
//
//Books available in the first library:
//The Da Vinci Code
//Le Petit Prince
//A Tale of Two Cities
//The Lord of the Rings

public class Library {
	String booktitlecollection = "";
	String address;

	public Library(String add) {
		this.address = add;

	}

// Add the missing implementation to this class
	public static void main(String[] args) { // Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");
// Add four books to the first library 
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));

// Print opening hours and the addresses 
		System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();

		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();

// Try to borrow The Lords of the Rings from both libraries 
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();

// Print the titles of all available books from both libraries 
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();

// Return The Lords of the Rings to the first library 
		System.out.println("Returning The Lord of the Rings:"); 
		firstLibrary.returnBook("The Lord of the Rings"); 
		System.out.println(); 
// Print the titles of available from the first library 
		System.out.println("Books available in the first library:"); 
		firstLibrary.printAvailableBooks(); 
	}

	public void addBook(Book book) {
		booktitlecollection = booktitlecollection + book.title + "1";
	}

	public static void printOpeningHours() {
		String hour = "9AM to 4 PM";
		System.out.println(hour);
	}

	public void printAddress() {
		System.out.println(address);
	}

	public void borrowBook(String title) {
		if (booktitlecollection.contains(title)) {
			System.out.println("You successfully borrowed The Lord of the Rings");
			booktitlecollection.replace(title, "");
		} else {
			System.out.println("Sorry, this book is already borrowed.");
		}

	}

}
