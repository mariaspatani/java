/* Write aJava program by creating a'student' class having the following data (7)
 members: rollNumber, name, mathMarks, phyMarks, chemMarks and
 methods getRequiredDetails0 - to get required input and displayAverage0 
to calculate average marks and display it. In class 'Implement' create an
 object ofthe Student class and get the required details from user and display
 the average marks ofthat student.*/
import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int mathMarks, phyMarks, chemMarks;

    // Method to get required input
    void getRequiredDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();

        sc.nextLine(); // to clear buffer

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Mathematics Marks: ");
        mathMarks = sc.nextInt();

        System.out.print("Enter Physics Marks: ");
        phyMarks = sc.nextInt();

        System.out.print("Enter Chemistry Marks: ");
        chemMarks = sc.nextInt();
    }

    // Method to calculate and display average marks
    void displayAverage() {
        double avg = (mathMarks + phyMarks + chemMarks) / 3.0;
        System.out.println("\nAverage Marks of " + name + " = " + avg);
    }
}

public class Implement {
    public static void main(String[] args) {
        Student s = new Student();   // creating object
        s.getRequiredDetails();      // getting input
        s.displayAverage();          // displaying average
    }
}
