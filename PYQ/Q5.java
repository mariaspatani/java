/*Create a class Person with attributes name, age, and address and a method display() to display the details. 
Create a subclass Student with attributes rollno, mark1, mark2, and mark3. Override the display() method and calculate the grade. 
Create another subclass Faculty with attributes faculty_id, department, basic_pay, and DA. 
Override the display() method to calculate the total salary as (basic_pay+DA)+70% of (basic_pay+DA).
Create instances of Student and Faculty and display their details.*/
public class Person {
    // Attributes
    protected String name;
    protected int age;
    protected String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display details
    public void display() {
        System.out.println("\n--- Person Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

public class Student extends Person {
    // Attributes
    private String rollno;
    private int mark1;
    private int mark2;
    private int mark3;

    // Constructor
    public Student(String name, int age, String address, String rollno, int mark1, int mark2, int mark3) {
        // Call to base class constructor
        super(name, age, address);
        this.rollno = rollno;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Helper method to calculate grade
    private String calculateGrade() {
        int totalMarks = mark1 + mark2 + mark3;
        double average = (double) totalMarks / 3;

        if (average >= 90) {
            return "A+ (Excellent)";
        } else if (average >= 80) {
            return "A (Very Good)";
        } else if (average >= 70) {
            return "B (Good)";
        } else if (average >= 60) {
            return "C (Average)";
        } else {
            return "D (Pass)";
        }
    }

    // Overridden display method (@Override is optional but recommended)
    @Override
    public void display() {
        super.display(); // Call base class display method
        System.out.println("\n--- Student Specific Details ---");
        System.out.println("Roll No: " + rollno);
        System.out.println("Marks (M1, M2, M3): " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("**Grade: " + calculateGrade() + "**");
        System.out.println("------------------------------");
    }
}

public class Faculty extends Person {
    // Attributes
    private String faculty_id;
    private String department;
    private double basic_pay;
    private double da; // Dearness Allowance

    // Constructor
    public Faculty(String name, int age, String address, String faculty_id, String department, double basic_pay, double da) {
        // Call to base class constructor
        super(name, age, address);
        this.faculty_id = faculty_id;
        this.department = department;
        this.basic_pay = basic_pay;
        this.da = da;
    }

    // Helper method to calculate total salary
    private double calculateTotalSalary() {
        double grossPay = basic_pay + da;
        // Total Salary = Gross Pay + 70% of Gross Pay
        double totalSalary = grossPay * 1.70; 
        return totalSalary;
    }

    // Overridden display method
    @Override
    public void display() {
        super.display(); // Call base class display method
        System.out.println("\n--- Faculty Specific Details ---");
        System.out.println("Faculty ID: " + faculty_id);
        System.out.println("Department: " + department);
        System.out.printf("Basic Pay: $%.2f%n", basic_pay);
        System.out.printf("DA: $%.2f%n", da);
        
        double totalSalary = calculateTotalSalary();
        System.out.printf("**Total Salary (incl. 70%% allowance): $%,.2f**%n", totalSalary);
        System.out.println("------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- OOP Demonstration in Java ---");

        // Create an instance of Student
        Student student1 = new Student(
            "Ria Sharma", 
            21, 
            "101 Green Street, Mumbai", 
            "CS2023005", 
            95, 
            88, 
            79
        );

        // Create an instance of Faculty
        Faculty faculty1 = new Faculty(
            "Dr. Arun Menon", 
            48, 
            "B-4, University Quarters, Kochi", 
            "FCE330", 
            "Civil Engineering", 
            65000.00, 
            18000.00
        );

        // Display Student details using the overridden display() method
        student1.display();

        // Display Faculty details using the overridden display() method
        faculty1.display();
    }
}
/*
SAMPLE OUTPUT

--- OOP Demonstration in Java ---

--- Person Details ---
Name: Ria Sharma
Age: 21
Address: 101 Green Street, Mumbai

--- Student Specific Details ---
Roll No: CS2023005
Marks (M1, M2, M3): 95, 88, 79
**Grade: A (Very Good)**
------------------------------

--- Person Details ---
Name: Dr. Arun Menon
Age: 48
Address: B-4, University Quarters, Kochi

--- Faculty Specific Details ---
Faculty ID: FCE330
Department: Civil Engineering
Basic Pay: $65000.00
DA: $18000.00
**Total Salary (incl. 70% allowance): $141,100.00**
------------------------------
  */
