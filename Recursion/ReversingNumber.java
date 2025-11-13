//rerverse a number
import java.util.*;
class ReverseNumber {
    static int rev(int n, int revNum) {
        if (n == 0)
            return revNum;
        return rev(n / 10, revNum * 10 + (n % 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = rev(num, 0);
        System.out.println("Reversed number = " + reversed);
        sc.close();
    }
}
