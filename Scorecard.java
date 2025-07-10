/* 
  Author : Maria
  Date   : 10 July 2025
  Description :  Scorecard of a student
  */

package demo;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mark:");
		int mark = sc.nextInt();
		if(mark>=90){
			System.out.println("Grade S");
		}
		else if(mark>85) {
			System.out.println("Grade A+");
		}
		else if(mark>75) {
			System.out.println("Grade A");
		}
		else {
			System.out.println("Grade B");
		}
		sc.close();
}
}
