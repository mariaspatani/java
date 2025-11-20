/*How do you create user defined exceptions in Java? write a Java program to (s) find the average of n numbers .
Raise a userdefined exception ifthe average exceeds 100.*/
import java.util.*;

// User-defined exception
class HighAverageException extends Exception {
    HighAverageException(String msg) {
        super(msg);
    }
}

public class AverageDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int sum = 0;
            System.out.println("Enter " + n + " numbers:");

            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }

            double avg = sum / (double)n;
            System.out.println("Average = " + avg);

            // Raise user-defined exception
            if (avg > 100) {
                throw new HighAverageException("Average exceeds 100!");
            }

        } catch (HighAverageException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
