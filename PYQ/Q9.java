/* Problem Statement:
 You are asked to create a Java class Student that keeps track of the number of student objects 
created using a static variable.
 Each time a new Student object is created, the counter should increase automatically. Also, create a 
method to display the number of students created so far.
 Requirements:
 1.Create a class Student with:
 •A non-static variable name to store the student's name.
 •A static variable studentCount to store the total number of students created.
 •A constructor that accepts the student name and increases the count.
 •A static method getStudentCount() that returns the value of studentCount.
 2.In the Main class:
 •Create 3 Student objects with names.
 •Print the number of students using the static method.*/
public class Student {
    // Non-static variable
    String name;
    // Static variable to track number of students
    static int studentCount = 0;
    // Constructor
    public Student(String name) {
        this.name = name;
        studentCount++;  // Increase count whenever object is created
    }
    // Static method to return student count
    public static int getStudentCount() {
        return studentCount;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating 3 Student objects
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");
        // Printing total number of students created
        System.out.println("Total Students Created: " + Student.getStudentCount());
    }
}


  
