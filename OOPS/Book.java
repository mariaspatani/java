import java.util.Scanner;
 class Book {
	//Scanner sc= new Scanner(System.in);
	String title;
	String author;
	String publisher;
	Book(String publisher){//add constructor
		this.publisher = publisher;
	//Scanner sc =new Scanner(System.in);
	}
	Scanner sc =new Scanner(System.in);
	public void readBookDetails() {
		System.out.println("Enter the title of the book");
		title=sc.nextLine();
		System.out.println("Enter the author name");
		author=sc.nextLine();
	}
	public void printDetails() {
	System.out.println("Title:"+title);
	System.out.println("Author:"+ author);
	System.out.println("Publisher:"+ publisher);
	}
}
public class Oops_demo {
	public static void main(String[] args) {
		Book book =new Book("DC Books");
		//Book book = new Book();
		//Scanner sc = new Scanner(System.in);
		book.readBookDetails();
		//book.title="How to have a beautiful mind";
		//book.author ="Edward De Bono";
		//System.out.println("Title:"+book.title);
		//System.out.println("Author:"+book.author);
		//System.out.println("Publisher
		book.printDetails();
		//sc.close();	
	}	
}


