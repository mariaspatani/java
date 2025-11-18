import java.util.Scanner;

class Even {
    public static void printWords(String s) {
        for (String w : s.split(" ")) {
            // if length is even
            if (w.length() % 2 == 0)
                System.out.println(w);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();  
        printWords(s);
    }
}
