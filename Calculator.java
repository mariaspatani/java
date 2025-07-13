/*
 Author : Maria
 Date   : 13 July 2025
 Description : Calculator
 */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
      
        System.out.println("Enter the operator (+, -, *, /):");
        String op = sc.nextLine();

        int result = switch (op) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                    yield 0;                     
                } else {
                    yield  num1 / num2;
                }
             }            
            default -> {
                System.out.println("Invalid operator!");
                yield 0;
            }
        };
        System.out.println("Result: " + result);
        sc.close();
    }
}
