/*
 Author : Maria 
 Date 	: Sept 3 2025
 Description : A java program to sort an array of integers in the descending order.
 */
import java.util.Scanner;
public class array {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter the number of integers you want to sort");
		int n=sc.nextInt();
		int[] num=new int[n];
		System.out.println("Enter "+n +"integers");
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("Original Array");
		for(int i=0;i<n;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		//sorting
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				//swapping
				if(num[j]<num[j+1]) {//change "<" to ">" to find the ascending order
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		//printing the sorted the array
		System.out.println("Sorted Array:");
		for(int i=0;i<n;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		
	}

}
