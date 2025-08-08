/*
  Author : Maria 
  Date   : 8 August 2025
  Description : Inheritance practice question1(slideno 11)
 */

class Book{
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println("Title :"+title);
		System.out.println("Author :"+author);
		System.out.println("Price :"+price);
	}
}
    class Ebook extends Book{
		double fileSize;
	 Ebook(String title,String author,double price,double fileSize){
		 super(title,author,price);
		 this.fileSize=fileSize;
		 }
	 public void displayDetails() {
			super.displayDetails();
			System.out.println("File Size :"+fileSize+"\n");
		}
	
	}
    class PrintedBook extends Book{
    	int numberofPages;
      PrintedBook(String title,String author,double price, int numberofPages){
    	 super(title,author,price);
    	 this.numberofPages=numberofPages;	 
      }
      public void displayDetails() {
    	  super.displayDetails();
    	  System.out.println("Number of Pages: "+numberofPages);      
    }
}
public class Demo1 {
	public static void main(String[]args){
		Ebook book1=new Ebook("How to have Beautiful Mind","Edward De Bono",115.75,256.89);
		book1.displayDetails();
		PrintedBook bookP=new PrintedBook("Wings of Fire","A.P.J",99.99,200);
		bookP.displayDetails();
	}

}
