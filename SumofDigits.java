/*
  Author: Maria
  Date :15 July 2025
  Description: Sum of the Digits.
 */
import java.util.Scanner;
public class SumofDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n =sc.nextInt();
		int sum=0;
		while(n!=0){
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("The sum of Digits: "+ sum);
		sc.close();
	}

}
