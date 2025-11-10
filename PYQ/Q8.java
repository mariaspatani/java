 /*Q. Create a user defined exception 'InvalidAgeException'. Write aJava program ,Raise the Exception
 'InvalidAgeException' if age is less than 18*/

    public InvalidAgeException(String message) {
        // Call the constructor of the parent Exception class to set the error message
        super(message);
    }
}
// 2. Validation Logic Class: AgeValidator

public class AgeValidator {
    public static void validateAge(int age) throws InvalidAgeException {
        System.out.println("Attempting to validate age: " + age);
      
        if (age < 18) {
            throw new InvalidAgeException("Age restriction violation: Age (" + age + ") is less than the required minimum of 18.");
        } else {
            System.out.println("Validation successful! Age is 18 or over.");
        }
    }
}
// 3. Main Execution Class
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Age Validation Demonstration ---");
        System.out.println("\n==========================================");
        System.out.println("TEST 1: Age = 25 (Expected: Success)");
        try {
            AgeValidator.validateAge(25);
            System.out.println("Result: User is allowed access.");
        } catch (InvalidAgeException e) {
            // This block should not execute for age 25
            System.err.println("Unexpected Error: " + e.getMessage());
        }
        System.out.println("==========================================");
        System.out.println("\n\n==========================================");
        System.out.println("TEST 2: Age = 16 (Expected: Exception)");
        try {
            AgeValidator.validateAge(16);
           
            System.out.println("Validation completed without error (Should not be printed).");
        } catch (InvalidAgeException e) {
            
            System.err.println("Custom Exception Caught Successfully:");
            System.err.println("Error Type: " + e.getClass().getName());
            System.err.println("Error Message: " + e.getMessage());
            System.err.println("Action Taken: User access or registration denied.");
        } finally {
          
            System.out.println("Age validation process concluded.");
        }
        System.out.println("==========================================");
    }
}
