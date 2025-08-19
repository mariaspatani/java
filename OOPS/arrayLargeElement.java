/*
  Author : Maria
  Date   : 19 August 2025
  Description : Finding the largest number in an array
 */

import java.util.Scanner;
public class ArrayDemo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of elements in the array");
		int n= sc.nextInt();
		int [] array = new int [n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		System.out.print("The given array is ");
		
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+"\t");
		}
		//finding largest element in the array
		int large;
		large = array[0];
		for(int i=0;i<n;i++) {
			if(array[i]>large) {
				large=array[i];
			}		
		}
		System.out.println("\nThe Largest number: "+large);	
		
	}
	
}
