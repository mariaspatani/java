/*
Create a base class Book with the following:
Instance variables:
title (String)
author (String)
price (double)
Constructor to initialize the above values.
Method displayDetails() to print the book’s details.
Create a derived class EBook that extends Book:
Additional instance variable: fileSizeMB (double).
Constructor to initialize all values (use super for inherited fields).
Override displayDetails() to include file size information.
Create another derived class PrintedBook that extends Book:
Additional instance variable: numberOfPages (int).
Constructor to initialize all values (use super for inherited fields).
Override displayDetails() to include number of pages information.
In the main() method:
Create one object each of EBook and PrintedBook.
Call displayDetails() on both objects.*/

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
