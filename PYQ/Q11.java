/*
Create a class Book with:
Instance variables: String title, String author, final int bookID.
A static variable int bookCounter initialized to 1000.
A static final variable LIBRARY_NAME = "Central Library".
Constructors:
A default constructor that sets default values for title and author.
A parameterized constructor that takes title and author as parameters.
Each constructor should assign a unique bookID using the static bookCounter.
Method Overloading:
displayInfo() – displays book title, author, ID.
displayInfo(boolean showLibrary) – if showLibrary is true, also show LIBRARY_NAME.
Static Method:
displayTotalBooks() – prints total number of books added.
In main():
Create 3 Book objects using both constructors.
Demonstrate both overloaded displayInfo() methods.
Display total books using the static method.
*/

class Book{
	String title;
	String author;
	 int bookID;
	static int bookCounter=1000;
	static final String LIBRARY_NAME="Central Library";
	static int totalBooks=0;
Book(){
	this.title="Wings Of Fire";
	this.author="APJ";
	this.bookID=bookCounter++;
	totalBooks++;
}
Book(String title, String author){
	this.title=title;
	this.author=author;
	this.bookID=bookCounter++;
	totalBooks++;
}
public void displayInfo() {
	System.out.println("Title: "+title);
	System.out.println("Author: "+author);
	System.out.println("BookID: "+bookID);
}
public void displayInfo(boolean showLibrary) {
	System.out.println("Title: "+title);
	System.out.println("Author: "+author);
	System.out.println("BookID: "+bookID);
	if (showLibrary) {
            System.out.println("Library: " + LIBRARY_NAME);
        }
}
public static void displayTotalBooks() {
	System.out.println("Book Count: "+ totalBooks);
}
}
public class DemoStatic {
	public static void main(String[] args) {
		Book book1=new Book(); 
		Book book2=new Book("How to have beautiful minds ","Edward de Bono");
		Book book3= new Book("The Alchemist","Paulo Coelho");
		System.out.println("Book 1 Info:");
        	book1.displayInfo(); 
		System.out.println("Book 2 Info:");
        	book2.displayInfo(true); 
		System.out.println("Book 3 Info:");
        	book3.displayInfo(false); 
		Book.displayTotalBooks();
	}

}
