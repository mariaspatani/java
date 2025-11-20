import java.util.*;

class EvenWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for (String w : s.split(" ")) {
            if (w.length() % 2 == 0)
                System.out.println(w);
        }
    }
}
