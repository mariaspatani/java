/* 
  Author : Maria
  Date   : 10 July 2025
  Description : Check Whether the person is eligible to vote or not.
 */

package demo;

import java.util.Scanner;

public class Ifdemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		if(age>18) {
				System.out.println("Eligible to vote");
		}
		else {
			    System.out.println("Not eligible to vote");
		}
		sc.close();
			
 }
}
