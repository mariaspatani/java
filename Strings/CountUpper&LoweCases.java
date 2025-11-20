import java.util.*;

class CaseCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int upper = 0, lower = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) upper++;
            else if (Character.isLowerCase(ch)) lower++;
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}
