/*
  Call the static method to show the total number of students.
 */
  class Student{
	String name;
	int rollNumber;
	static int studentCount=0;
	Student(String name, int rollNumber){
		this.name=name;
		this.rollNumber=rollNumber;
		studentCount++;
	}
	public void displayCount() {
		System.out.println("Student Count:"+ " "+studentCount);
		
	}
}
public class Static {
	public static void main(String[] args) {
		String name;
		int rollNumber;
		Student student1=new Student("Abc",1);
		Student student2 =new Student("Cde",2);
		Student student3 =new Student("Efg",3);
		student3.displayCount();
	}

}
