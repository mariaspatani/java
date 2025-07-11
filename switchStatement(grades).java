/*
  Author : Maria
  Date   : July 11 2025
  Description : The program to print the grade and result using switch statements.
 */


package practice1;
import java.util.Scanner;
public class Grade1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the grade:");
		String grade =sc.nextLine();		
		String result = switch(grade) {
		case"O" -> "Outstanding Performance";
		case"A" -> "Excellent Performance";
		case"B"-> "Good performance";
		case"C"->"Average Performace";
		case"P"->"Pass";
		case"F"->"Fail";
		default-> "Invalid Grade";
		};
		
		System.out.println("Grade: "+ grade );
		System.out.println("Result: "+ result);
		
		
	}

}
