/* Explain how the following scenario is implemented. Create a package (7)
 "reversepackage". Add a class Reverse into it and write a method rev 0 which
 reverses a number. Import this package in another class outside the package and
 find the reverse of a number given as command line argument*/

package reversepackage;

/**
 * The Reverse class provides a method to reverse an integer.
 * It is located inside the 'reversepackage' package.
 */
public class Reverse {

    /**
     * Reverses the digits of an integer number.
     * For example, if the input is 123, the output is 321.
     *
     * @param number The integer to be reversed.
     * @return The reversed integer.
     */
    public int rev(int number) {
        int reversed = 0;
        int temp = number; // Use a temporary variable for calculation
        // Handle negative numbers by working with the absolute value
        boolean isNegative = temp < 0;
        if (isNegative) {
            temp = -temp;
        }
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        // Apply the negative sign back if the original number was negative
        return isNegative ? -reversed : reversed;
    }
}

import reversepackage.Reverse;
import java.util.Scanner; // Needed to read user input

/**
 * MainApp class demonstrates how to use code from a separate package.
 * It asks the user for a number and uses the 'Reverse' tool to flip it.
 */
public class MainApp {
    
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0; // Initialize variable

        System.out.println("--- Simple Reverse Number App ---");
        System.out.print("Enter a whole number: ");

        // We use a try-catch block to handle errors, like the user typing letters
        try {
            // 1. Read the number from the user
            inputNumber = scanner.nextInt();

            // 2. Create the Reverse tool from the 'reversepackage'
            // The 'import' statement at the top allows us to use Reverse here.
            Reverse revTool = new Reverse();
            
            // 3. Use the rev() method to get the reversed number
            int reversedNumber = revTool.rev(inputNumber);

            // 4. Display the result
            System.out.println("\n--- Result ---");
            System.out.println("Original: " + inputNumber);
            System.out.println("Reversed: " + reversedNumber);

        } catch (java.util.InputMismatchException e) {
            // This happens if the user types something that isn't a number
            System.out.println("\nError: That was not a valid integer. Please try again with a number.");
        } catch (Exception e) {
            // Catch any other unexpected error
            System.out.println("\nAn unexpected error occurred: " + e.getMessage());
        } finally {
            // Always close the scanner when done to free up resources.
            scanner.close();
        }
    }
}

