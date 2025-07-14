/*
  Author: Maria
  Date :14 July 2025
  Description: Check Whether the given number is an armstrong or not
 */
import java.util.Scanner;
public class ArmstrongNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number =sc.nextInt();
		int OriginalNo=number;
		int sum=0;
		int rem;
		while(number!=0) {
			rem=number%10;
			sum=sum+rem*rem*rem;
			number=number/10;			
		}
		if(sum==OriginalNo) {
			System.out.println("The given no is an Armstrong");
		}
		else {
			System.out.println("The given no is not an Armstrong");
		}
		sc.close();
	}

}
