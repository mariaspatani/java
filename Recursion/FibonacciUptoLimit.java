/*
 Author : Maria
 Date   : Sept 5 2025
 Description : Find fibonacci series upto a limit using recursion
 */
import java.util.Scanner;
public class Fibonacci {
	public static int fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return (fibonacci(n-1)+fibonacci(n-2));
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(fibonacci(i)+ " ");
			sc.close();
		}
	}
}
