/*
 Author : Maria
 Date   : Sept 4 2025
 Description : Rock-Paper-Scissors Game.
 */

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int userScore = 0;
        int computerScore = 0;
        int rounds;

		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.println("How many rounds do you want to play?");
		
		try {
			rounds = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a number.");
            sc.close();
            return;
		}
		
		System.out.println("Ready to play " + rounds + " rounds!");

		for (int i = 1; i <= rounds; i++) {
			System.out.println("\n--- Round " + i + " ---");
			System.out.println("Enter your choice: (0 for Rock, 1 for Paper, 2 for Scissors)");
		
			int userChoice;
			try {
				userChoice = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. This round is lost.");
				sc.nextLine(); 
				continue; 
			}
			
			if (userChoice < 0 || userChoice > 2) {
				System.out.println("Invalid choice. This round is lost.");
				continue;
			}
			
			int computerChoice = random.nextInt(3);
			
			String[] choices = {"Rock", "Paper", "Scissors"};
			System.out.println("You chose: " + choices[userChoice]);
			System.out.println("The computer chose: " + choices[computerChoice]);
			
			switch(userChoice) {
	        case 0://user chose Rock
	        	if(computerChoice==1) {
	        		System.out.println("You Lose!");
	        		computerScore++;
	        	}else if(computerChoice==2){
	        		System.out.println("You Win!");
	        		userScore++;
	        	}else {
	        		System.out.println("It's a tie!");
	        	}
	        	break;
	        case 1://user chose Paper
	        	if(computerChoice==2) {
	        		System.out.println("You Lose!");
	        		computerScore++;
	        	}else if(computerChoice==0){
	        		System.out.println("You Win!");
	        		userScore++;
	        	}else {
	        		System.out.println("It's a tie!");
	        	}
	        	break;
	        case 2://user chose Scissors
	        	if(computerChoice==0) {
	        		System.out.println("You Lose!");
	        		computerScore++;
	        	}else if(computerChoice==1){
	        		System.out.println("You Win!");
	        		userScore++;
	        	}else {
	        		System.out.println("It's a tie!");
	        	}
	        	break;
			}
		}
	        	// Display the final scoreboard
	            System.out.println("\n--- Final Scoreboard ---");
	            System.out.println("Your Score: " + userScore);
	            System.out.println("Computer Score: " + computerScore);
	            
	         // Announce the final winner
	            if (userScore > computerScore) {
	                System.out.println("Congratulations! You win!");
	            } else if (computerScore > userScore) {
	                System.out.println("The computer wins. Better luck next time!");
	            } else {
	                System.out.println("The game ends in a tie!");
	            }
	            
	            System.out.println("\nThank you for playing!");
	    		sc.close();
	    	}
	}

	        
