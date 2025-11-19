/*Write a Java class named Book that demonstrates constructor overloading. Your class should,have three constructors:
A default constructor that sets default values for the book’s title, author, and price. A constructor that takes only the title as a parameter and 
sets default values for other fields. A constructor that takes title, author, and price as parameters and sets them accordingly. 
 Include a method display() to print the details of the book. In the main method, create three Book objects using each constructor and call the display() method*/
class Book {
    String title;
    String author;
    double price;
    // 1. Default constructor
    Book() {
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
    }
    // 2. Constructor with only title
    Book(String t) {
        title = t;
        author = "Unknown Author";
        price = 0.0;
    }
    // 3. Constructor with title, author, price
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    // display() method
    void display() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
        System.out.println();
    }
    public static void main(String[] args) {
        // Creating objects using each constructor
        Book b1 = new Book();
        Book b2 = new Book("Java Programming");
        Book b3 = new Book("Data Structures", "Mark Smith", 450.50);
        // Display details
        b1.display();
        b2.display();
        b3.display();
    }
}
