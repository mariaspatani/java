/* Discuss about bitwise, relational and conditional operators in Java with examples and compare its precedence*/
public class OperatorDemo {

    public static void main(String[] args) {
        // --- 1. Bitwise Operators (Applied to integers) ---
        int a = 10;  // Binary: 0000 1010
        int b = 6;   // Binary: 0000 0110

        System.out.println("=== 1. Bitwise Operators ===");
        System.out.println("a = " + a + " (0000 1010), b = " + b + " (0000 0110)");
        
        // Bitwise AND (&)
        System.out.println("a & b (AND):   " + (a & b) + "  // 0000 0010 (2)"); 
        
        // Bitwise OR (|)
        System.out.println("a | b (OR):    " + (a | b) + " // 0000 1110 (14)");

        // Bitwise XOR (^)
        System.out.println("a ^ b (XOR):   " + (a ^ b) + " // 0000 1100 (12)");

        // Bitwise Left Shift (<<)
        // Multiplies 'a' by 2^2 = 4
        System.out.println("a << 2 (L. Shift): " + (a << 2) + " // 1010 00 (40)");
        
        // Bitwise Unary NOT (~) - Applies to 'a'
        System.out.println("~a (NOT):      " + (~a) + " // Inverts bits (result is two's complement)");
        
        System.out.println("\n----------------------------------\n");
        
        // --- 2. Relational Operators (Applied to integers) ---
        int x = 15;
        int y = 10;
        
        System.out.println("=== 2. Relational Operators (Returns boolean) ===");
        System.out.println("x = " + x + ", y = " + y);

        // Equal To (==)
        System.out.println("x == y:  " + (x == y));
        
        // Not Equal To (!=)
        System.out.println("x != y:  " + (x != y));

        // Greater Than (>)
        System.out.println("x > y:   " + (x > y));
        
        // Less Than or Equal To (<=)
        System.out.println("x <= 15: " + (x <= 15));
        
        System.out.println("\n----------------------------------\n");

        // --- 3. Conditional (Ternary) Operator (? :) ---
        int score = 75;
        String grade;
        
        // Syntax: (Condition ? ValueIfTrue : ValueIfFalse)
        grade = (score > 90) ? "A" : "B or lower";
        
        System.out.println("=== 3. Conditional (Ternary) Operator ===");
        System.out.println("Score: " + score);
        System.out.println("Grade is: " + grade); // Output: B or lower

        // Nested Conditional Example
        score = 95;
        String status = (score > 90) ? "Excellent" : ((score > 70) ? "Good" : "Needs Improvement");
        System.out.println("New Score: " + score + ", Status: " + status); // Output: Excellent
        
        System.out.println("\n----------------------------------\n");

        // --- 4. Precedence Example (Relational vs. Bitwise) ---
        // In the expression below, Relational operators (==, !=, <, etc.) have higher precedence
        // than binary Bitwise operators (&, |, ^).
        
        int p = 5;  // 0101
        int q = 7;  // 0111
        boolean check = true;
        
        System.out.println("=== 4. Precedence Example (Relational vs. Bitwise) ===");
        
        // Expression: check && p == q | p < 10
        // Order of evaluation:
        // 1. p == q (Relational, false)
        // 2. p < 10 (Relational, true)
        // 3. (p == q) | (p < 10) -> false | true (Logical/Bitwise OR is NOT what we intended, but is used here)
        // 4. check && result (Logical AND)
        
        // For demonstration, let's use the precedence example given in the previous response:
        // Relational (>) is higher than Bitwise OR (|)
        
        // Precedence order: 
        // 1. a > b (true)
        // 2. a | 1 (10 | 1 = 11)
        System.out.println("a | b > 10: " + (a | b > 10)); // a | (b > 10) -> 10 | false -> Error
        
        // Correcting the example to show intended precedence:
        // We use parentheses to enforce the standard (p | q) operation
        System.out.println("(a | b) > 10: " + ((a | b) > 10) + " // a|b is 14. 14 > 10 is true.");
        
        // Without parentheses, the Relational operator (>) is evaluated BEFORE the Bitwise OR (|), 
        // which would cause an error because you cannot use '|' between an integer and a boolean. 
        // This confirms that Relational (11, 10) is indeed higher than Binary Bitwise (| at 7).
    }
}
