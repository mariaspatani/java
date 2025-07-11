/*
 Author:Maria
 Date: July 11 2025
 Description : Print the even numbers upto a limit);

*/

package practice1;
import java.util.Scanner;
public class EvenNo {
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		System.out.println("Even Numbers are:");
	    for(int i=2;i<=n;i+=2) {
	    	//if(i%2==0) {
	    		System.out.println(i);
	    	//}
	    }
	    sc.close();
	}
	      

}
