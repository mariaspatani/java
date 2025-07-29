import java.util.Scanner;
class Student{
	String name;
	static int studentCount= 0;
	
	Student(){
		this.name= name;
		studentCount++;	
	}
	public void printDetails(){
		System.out.println("Name:" +name);
		System.out.println("StudentCount:"+studentCount);
		
	}
	
}

public class DemoStatic {
	public static void main(String[] args) {
		String name;
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the name");
	    //name= sc.nextLine();
		Student student1 =new Student();
		student1.printDetails();
		Student student2 =new Student();
		student2.printDetails();
		
	}

}
