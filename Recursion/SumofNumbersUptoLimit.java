/*
 Author : Maria
 Date   : Sept 5 2025
 Description : Find sum of the numbers upto a limit using recursion.
 */
import java.util.Scanner;
public class SumofNosUptoLimit {
	public static int sum (int n) {
		if(n>0) {
			return (n+sum(n-1));
		}
		else {
			return 0;
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit");
	int n=sc.nextInt();
	int result=sum(n);
	System.out.println("Sum: "+result);
	sc.close();
}
}

