/*
 Author : Maria
 Date : Sept 3 2025
 Description : A Java program to sort an array of strings based on their length in ascending order.
 */

import java.util.Scanner;
public class sortString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the no of strings");
		int n= sc.nextInt();
		sc.nextLine();
		String[] words =new String[n];
		System.out.println("enter "+n +"strings");
		for(int i=0;i<n;i++) {
			words[i]=sc.nextLine();
		}
		System.out.println("Original array of Strings");
		for(int i=0;i<n;i++) {
			System.out.print(words[i] + " ");
		}
		System.out.println();
		//sorting
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(words[j].length()>words[j+1].length()) {
					String temp=words[j];
					words[j]=words[j+1];
					words[j+1]=temp;
				}
			}
		}
		//printing the sorted string
		System.out.println("\nSorted array by length (ascending):");
		for(int i=0;i<n;i++) {
			System.out.print(words[i]+" ");
		}
		System.out.println();
	}

}
