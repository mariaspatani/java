/*
 Author :Maria
 Date :18 July 2025
 Description: Display the details of the class Student(input their details).
 */
package Book;
import java.util.Scanner;
class Student{
	String name;
	int rollNo;
	String dept;
	//parameterized constructor
	Student(String name,int rollNo, String dept){
		this.name=name;
		this.rollNo=rollNo;
		this.dept=dept;
	}
	public void printStudentInfo() {
		System.out.println("Name:" +name);
		System.out.println("Rollno:"+rollNo);
		System.out.println("Department:"+dept);
	}
}

public class Demo2 {
	public static void main(String[] args) {
		String name;
		int rollNo;
		String dept;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
	    name= sc.nextLine();
	    System.out.println("Enter the RollNo");
	    rollNo= sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter the Department");
	    dept= sc.nextLine();
		Student student=new Student(name,rollNo,dept);//without scanning we can input the values here
		student.printStudentInfo();		
	}
}
