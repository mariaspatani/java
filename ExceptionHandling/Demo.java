//Exception Handling 
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandlingDemo{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	 try {
		
		System.out.println("Enter a whole number to divide: ");
		int x=sc.nextInt();
		
		System.out.println("Enter a whole number to divide: ");
		int y=sc.nextInt();
		
		int z=x/y;
		System.out.println("result: "+z);
	}
	catch(ArithmeticException e){
		System.out.println("you can't divide by zero!");
	}
	catch(InputMismatchException e){
		System.out.println("please enter a number");
	}
	 catch(Exception e) {
		 System.out.println("Something went wrong");
	 }
	 finally {
		 sc.close();
	 }
  }
} 
