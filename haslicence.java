/*
 Author : Maria 
 Date : 13 July 2025
 Description : Java program that ask the user to input their licence status and age using nested loop*/
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you age:");
        int age=sc.nextInt();
        System.out.println("Do u have licence or not? (1 0r 0)");
        int haslicence=sc.nextInt();
        if(age>=18){
            if(haslicence==1){
            System.out.println("You can drive");
            }
            else{
                System.out.println("You can't drive");
            }
        }
        else{
            System.out.println("You are too young");
        }
        sc.close();
        
    }
}
