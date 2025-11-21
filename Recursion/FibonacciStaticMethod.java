import java.util.Scanner;

public class FibonacciRecursion {

    // Recursive method to print Fibonacci terms
    static void printFibonacci(int count, int n1, int n2) {
        if (count == 0)
            return;

        int n3 = n1 + n2;
        System.out.print(n3 + " ");
        printFibonacci(count - 1, n2, n3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter number of terms: ");
        int count = sc.nextInt();

        System.out.print("Enter first number (n1): ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number (n2): ");
        int n2 = sc.nextInt();

        // Print first two numbers
        System.out.print(n1 + " " + n2 + " ");

        // Print remaining terms
        printFibonacci(count - 2, n1, n2);
    }
}
