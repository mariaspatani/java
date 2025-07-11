/*
 Author:Maria
 Date: July 11 2025
 Description :Check whether the given number is palindrome or not.
 */
package practice1;

import java.util.Scanner;

public class PalindromeNo {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		int originalNum = num;
		int rev=0;
		int rem;
		while(num > 0) {
			 rem = num % 10;
			 rev=rev*10+rem;
			 num=num/10;
		}
		if(originalNum==rev){
			System.out.println("The given number is a Palindrome");	 
		}
		else {
			System.out.println("The given number is not palindrome");
		}
		sc.close();
		
			
		}

}
