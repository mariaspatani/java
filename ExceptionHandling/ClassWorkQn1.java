/*
Author : Maria
Date   : Sept 24 2025
Description: Create a user defined Exception ‘InvalidNumberException’. Write a Java program that computes the average of N positive numbers .
Raise the Exception ‘InvalidNumberException’ on reading a negative number or zero as input.
*/
import java.util.Scanner;
class InvalidNumberException extends Exception{
	InvalidNumberException(String str){
		super(str);
	}
}
public class Demo {
	public static void main(String[] args) {
		int N=10;
		int number;
		float average;
		int sum=0;
		InvalidNumberException exception = new InvalidNumberException("InvalidNumberException");
		Scanner sc  = new Scanner(System.in);
		for(int i=0;i<N;i++) {
			number = sc.nextInt();
			try {
				if(number<=0) {
					throw exception;
				}
				else {
					sum= sum+number;
				}
			}
			catch (InvalidNumberException e) {
				System.out.println(e.getMessage());
			}
			average = (float)sum/N;
			System.out.println("Average ="+average);
			
		}

	}

}
