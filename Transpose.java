//Transponse of a 2D Matrix

import java.util.Scanner;
public class Transpose {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of rows and cols of a matrix");
		int m=sc.nextInt();//row size
		int n=sc.nextInt();//column size
		int [][] array = new int [m][n];
		int [][]transpose=new int[n][m];
		System.out.println("Enter the elements:");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		System.out.println("The Matrix is:");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+"\t");
			}		
			System.out.println();
	}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				transpose[i][j]=array[j][i];
			   }
			}
		System.out.println("The Transpose of a Matrix:");
		for(int j=0;j<array.length;j++) {
			for(int i=0;i<array[j].length;i++) {
				System.out.print(transpose[j][i]+"\t");
			}
			System.out.println();
        }
 }
}
