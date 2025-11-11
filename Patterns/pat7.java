public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }
            // ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/* output :-
    1
   121
  12321
 1234321
123454321*/
