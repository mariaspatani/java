/*
 Author : Maria
 Date   : 13 July 2025
 Description : Java Program to print factorial of a number.
 */
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args){
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num =sc.nextInt();
	  int fact=1,i;
	  for (i=1;i<=num;i++) {
		  fact=fact*i;
	  }
	  System.out.println("The Factorial of a number is: " + fact);
	  sc.close();
	}
	  

}
