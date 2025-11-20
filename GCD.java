import java.util.Scanner;

public class GCD {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;   // remainder
            a = temp;
        }
        return a; // GCD
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int gcd = findGCD(n1, n2);
        System.out.println("GCD = " + gcd);
    }
}
