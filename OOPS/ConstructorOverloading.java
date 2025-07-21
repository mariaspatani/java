/*
 Author : Maria
 date:21 July 2025
 Description: Constructor Overloading Example
 */
class Student{
	int rollNumber;
	String name;
	String dept;
	Student(){
		System.out.println("First Constructor Initiated");
		rollNumber=1;
		name="Maria";
		dept="CSE";
	}
	Student(int rollNumber){
		System.out.println("Second Constructor Initiated");
		this.rollNumber=rollNumber;
		
	}
	Student(int rollNumber,String name){
		System.out.println("Third Constructor Initiated");
		this.rollNumber=rollNumber;
		this.name=name;
	}
	Student(int rollNumber,String name,String dept){
		System.out.println("Fouth Constructor Initiated");
		this.rollNumber=rollNumber;
		this.name=name;
		this.dept=dept;
	}
	public void displayDeytails() {
		System.out.println("RollNo :"+rollNumber);
		System.out.println("Name: "+name);
		System.out.println("Department: "+dept);
		
	}
}
public class ConstructorOverloadingDemo {
	public static void main(String[] args) {
		Student student=new Student();
		student.displayDeytails();
		Student student2 = new Student(53);
		student2.displayDeytails();
		Student student3 = new Student(47,"keerthana");
		student3.displayDeytails();
		Student student4 = new Student(54,"Meenakshi","Civil");
		student4.displayDeytails();				
	}
}
