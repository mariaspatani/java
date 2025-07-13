/*
 Author : Maria
 Date   : 13 July 2025
 Description : Java Program to print prime numbers upto a liimit.
 */

import java.util.Scanner;
public class PrimeNoUptoLimit {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit= sc.nextInt();
		int i,j;
		for(i=2;i<limit;i++) {
			int flag=0;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
		
		if(flag==0){
			System.out.print(i+"  ");
		}
	  }
		sc.close();
		
	}

}
