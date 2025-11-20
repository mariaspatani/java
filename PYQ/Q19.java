//Java program to check Anagram
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "bac";

        // Convert both strings to lowercase and remove spaces
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not same, they are not anagrams
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        // Convert to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The strings are Anagrams");
        } else {
            System.out.println("The strings are NOT Anagrams");
        }
    }
}
