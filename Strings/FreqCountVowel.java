//Java program that reads a string and counts the frequency of each vowel (a, e, i, o, u).
import java.util.Scanner;
public class VowelFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        // Array to store frequencies of vowels
        int[] freq = new int[5]; // [a, e, i, o, u]

        // Count vowels
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case 'a': freq[0]++; break;
                case 'e': freq[1]++; break;
                case 'i': freq[2]++; break;
                case 'o': freq[3]++; break;
                case 'u': freq[4]++; break;
            }
        }

        // Print results
        System.out.println("Vowel frequencies:");
        System.out.println("a: " + freq[0]);
        System.out.println("e: " + freq[1]);
        System.out.println("i: " + freq[2]);
        System.out.println("o: " + freq[3]);
        System.out.println("u: " + freq[4]);

        sc.close();
    }
}
