/*Write aJava program by creating a'student' class having the following data members: rollNumber, name, mathMarks, phyMarks, chemMarks and
methods getRequiredDetails0 - to get required input and displayAverage0 to calculate average marks and display it. In class 'Implement' create an
object ofthe Student class and get the required details from user and display the average marks ofthat student.*/
/**
 * SimpleStudent.java
 * This is a simplified example for beginners demonstrating how to:
 * 1. Define a class (Student).
 * 2. Define data members (variables).
 * 3. Define a constructor using the 'this' keyword (NEW).
 * 4. Define a method (displayAverage).
 * 5. Create an object and call a method (in the main method).
 */
public class Student {

    // --- 1. Define the Student Class Structure ---
   
    String name;
    int rollNumber;
    int mathMarks;
    int phyMarks;
    int chemMarks;

    /**
     * Constructor: Initializes the Student object's data members.
     * We use the 'this' keyword here to distinguish between the local
     * parameters (like 'name') and the class's instance variables (this.name).
     */
    public Student(String name, int rollNumber, int mathMarks, int phyMarks, int chemMarks) {
        // 'this.name' refers to the class variable; 'name' refers to the parameter.
        this.name = name;
        this.rollNumber = rollNumber;
        this.mathMarks = mathMarks;
        this.phyMarks = phyMarks;
        this.chemMarks = chemMarks;
    }

    // --- 2. Define a Method (Function) ---

    /**
     * Calculates the average marks and prints the result to the console.
     */
    public void displayAverage() {
        // Calculate the sum of all marks
        int totalMarks = mathMarks + phyMarks + chemMarks;

        // Calculate the average (using float for a precise result)
        float average = (float) totalMarks / 3;

        // Display the results
        System.out.println("--- Student Data Analysis ---");
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Marks: %.2f\n", average);
        System.out.println("-----------------------------");
    }

    // --- 3. Main Method to Run the Code ---

    public static void main(String[] args) {
        // Create an object (instance) of the SimpleStudent class, passing the initial values
        // This calls the constructor defined above.
        Student myStudent = new Student("Alex Johnson", 101, 85, 78, 92);
        
        // Call the method on the object to perform the calculation and display
        myStudent.displayAverage();
    }
}
