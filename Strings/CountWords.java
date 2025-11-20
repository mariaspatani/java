import java.util.*;

class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();
        String[] words = s.split(" ");

        System.out.println("Word Count: " + words.length);
    }
}
