/* Create a school application with  a class called person. Create name and dateofl3irth        (9)
 as member variables. Create a class called Teacher that inherits from the Person class.
 The teacher will have additional properties like salary, and the subject that the teacher
 teaches.Create  a class  called  Student that  inherits  from Person  class.  This class will
 have  a member variable  called  studentld.  Create a class called  College  Student that
 inherits  from  Student class.  This class will  have collegeName, the year in which the
 student  is  studying  (first/second/third/fourth)  etc.  Create  objects  of each  of these
 classes, invoke and test the methods that are available in these classes.*/
// Person class
class Person {
    String name;
    String dateOfBirth;

    Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

// Teacher inherits from Person
class Teacher extends Person {
    double salary;
    String subject;

    Teacher(String name, String dateOfBirth, double salary, String subject) {
        super(name, dateOfBirth);
        this.salary = salary;
        this.subject = subject;
    }

    void displayTeacherInfo() {
        displayPersonInfo();
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println();
    }
}

// Student inherits from Person
class Student extends Person {
    String studentId;

    Student(String name, String dateOfBirth, String studentId) {
        super(name, dateOfBirth);
        this.studentId = studentId;
    }

    void displayStudentInfo() {
        displayPersonInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println();
    }
}

// CollegeStudent inherits from Student
class CollegeStudent extends Student {
    String collegeName;
    String yearOfStudy;

    CollegeStudent(String name, String dateOfBirth, String studentId,
                   String collegeName, String yearOfStudy) {
        super(name, dateOfBirth, studentId);
        this.collegeName = collegeName;
        this.yearOfStudy = yearOfStudy;
    }

    void displayCollegeStudentInfo() {
        displayStudentInfo();
        System.out.println("College Name: " + collegeName);
        System.out.println("Year of Study: " + yearOfStudy);
        System.out.println();
    }
}
// Main class to test
public class SchoolApplication {
    public static void main(String[] args) {
        // Creating objects
        Teacher t1 = new Teacher("Mrs. Anu", "12-03-1980", 45000, "Mathematics");
        Student s1 = new Student("Rahul", "20-06-2005", "ST1023");
        CollegeStudent c1 = new CollegeStudent("Meera", "15-09-2004", "CS2341",
                                               "St. Joseph College", "Second Year");

        // Displaying information
        System.out.println("Teacher Details:");
        t1.displayTeacherInfo();

        System.out.println("Student Details:");
        s1.displayStudentInfo();

        System.out.println("College Student Details:");
        c1.displayCollegeStudentInfo();
    }
}
