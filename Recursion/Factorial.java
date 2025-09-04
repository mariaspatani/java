/*
 Author : Maria
 Date   : Sept 5 2025
 Description : Find factorial of a number using recursion
 */
import java.util.Scanner;
public class Factorial {
	public static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return(n * factorial(n-1));
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			int result=factorial(n);
			System.out.println("Factorial: "+result);
			sc.close();		
	}
}
