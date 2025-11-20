import java.util.*;
class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++)
            if (a[i] == key)
                found = true;

        if (found)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
