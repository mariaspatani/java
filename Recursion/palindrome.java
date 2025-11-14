import java.util.*;

class PalindromeCheck {
    static int reverse(int n, int revNum) {
        if (n == 0)
            return revNum;
        return reverse(n / 10, revNum * 10 + (n % 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = reverse(num, 0);
        if (num == rev)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is Not Palindrome");
        sc.close();
    }
}
