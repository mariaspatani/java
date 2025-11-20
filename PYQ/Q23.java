/*create a package reversepackage. Add a crass Reverse in it with a method 
 reverse$ to print the reverse of a string without using buirt-in methods. create
 a crass outside the package and use this method to reverse a string.*/

package reversepackage;

public class Reverse {
    public String reverseStr(String s) {
        String rev = "";

        // Reverse string without using built-in methods
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }
}


import reversepackage.Reverse;
import java.util.Scanner;

public class TestReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Reverse r = new Reverse();
        String reversed = r.reverseStr(str);

        System.out.println("Reversed String: " + reversed);
    }
}
