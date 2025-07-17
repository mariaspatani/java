/*
 Author :Maria
 Date:18 July 2025
 Description : Printing the details of a student
 */
import java.util.Scanner;
//creating class
class Maria{
	String name;
	int rollNo;
	float cgpa;

Scanner sc=new Scanner(System.in);
public void readDetails() {
	System.out.println("Enter the name");
	name =sc.nextLine();
	System.out.println("Enter the rollNo");
	rollNo = sc.nextInt();
	System.out.println("Enter the CGPA");
    cgpa = sc.nextFloat();
}
public void printDetails() {
	System.out.println("Name: "+ name);
	System.out.println("RollNO:"+ rollNo);
	System.out.println("CGPA: "+ cgpa);
 }
}
//main class
public class BioData {
	public static void main(String[] args) {
		Maria maria =new Maria();//object 
		maria.readDetails();
		maria.printDetails();
	}
}
