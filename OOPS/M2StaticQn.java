class Book{
	String title;
	String author;
	 int bookID;
	static int bookCounter=1000;
	static final String LIBRARY_NAME="Central Library";
Book(){
	this.title="Wings Of Fire";
	this.author="APJ";
	
}
Book(String title, String author){
	this.title=title;
	this.author=author;
	
}
public void displayInfo() {
	System.out.println("Title: "+title);
	System.out.println("Author: "+author);
	System.out.println("BookID: "+bookID);
}
public void displayInfo(String title, String author,int bookID) {
	System.out.println("Title: "+title);
	System.out.println("Author: "+author);
	System.out.println("BookID: "+bookID);
	
}
public static void displayTotalBooks() {
	//System.out.println("Book Count: "+)
}
}
public class DemoStatic {
	public static void main(String[] args) {
		Book book1=new Book()
	}

}
