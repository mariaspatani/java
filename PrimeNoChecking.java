/*
 Author : Maria
 Date   : 13 July 2025
 Description : Java Program to check whether the given number is prime or not.
 */

import java.util.Scanner;
public class PrimeorNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int flag=0;
		int i;
		for(i=2;i<num;i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("The given number is prime");
		}
		else {
			System.out.println("The given number is not a prime");
		}
		sc.close();
	}
	

}
