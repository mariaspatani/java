// Count the numbers in the given set of numbers
import java.util.*;
class CountDigits {
    static int count(int n) {
        if (n == 0)
            return 0;
        return 1 + count(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Number of digits = " + count(num));
        sc.close();
    }
}
