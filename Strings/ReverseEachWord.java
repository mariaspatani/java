//Java program that takes a sentence from the user, then reverses each word individually but keeps the sentence order intact.
import java.util.Scanner;
public class ReverseWordsManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read a full sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Process each word
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = reverseWord(word);
            System.out.print(reversedWord + " ");
        }

        sc.close();
    }

    // Method to reverse a word without using StringBuilder
    public static String reverseWord(String word) {
        char[] chars = word.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        return reversed;
    }
}
