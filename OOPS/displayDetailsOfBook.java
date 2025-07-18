/*
 Author :Maria
 Date :18 July 2025
 Description: Display the details of the class Book.
 */
package Book;
class Book{
	String title;
	String author;
	Double price;
	Book(){
		title="Unknown";
		author="Not assigned";
		price=0.0;			
	}
	public void displayDetails() {
		System.out.println("Title: \t"+title);
		System.out.println("Author:\t"+author);
		System.out.println("Price:\t"+price);
	}
}
public class Demo {
	public static void main(String[] args) {
		Book book=new Book();
		book.displayDetails();
	}
}
