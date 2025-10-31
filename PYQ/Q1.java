/*You are developing a simple Banking Application in Java. The application allows a user to withdraw money from their bank account. You must ensure the following:
• If the user tries to withdraw more money than the account balance, an 
InsufficientBalanceException (custom exception) should be thrown. • The program must use proper try, catch, throw, throws, and finally blocks.

• The finally block should always display “Transaction Completed.”
Write a Java program for this scenario and explain the flow of execution.*/
// Custom Exception Class

class InsufficientBalanceException extends Exception {
 
 public InsufficientBalanceException(String message) {
   super(message);

 }

}

// BankAccount class

class BankAccount {

 private double balance;

 // Constructor

 public BankAccount(double balance) {

 this.balance = balance;

 }

 // Withdraw method that throws the custom exception

 public void withdraw(double amount) throws 

InsufficientBalanceException {

 if (amount > balance) {

 throw new InsufficientBalanceException("Insufficient balance! 

You tried to withdraw " + amount);

 } else {

 balance -= amount;

 System.out.println("Withdrawal successful! Remaining balance: 

" + balance);

 }

 }

}

// Main Class

public class BankingApp {

 public static void main(String[] args) {

 BankAccount account = new BankAccount(5000); // initial balance

 try {
   System.out.println("Attempting to withdraw ₹6000...");

 account.withdraw(6000); // this will throw exception

 } 

 catch (InsufficientBalanceException e) {

 System.out.println("Exception: " + e.getMessage());

 } 

 finally {

 System.out.println("Transaction Completed.");

 }

 // Second transaction (successful case)

 try {

 System.out.println("\nAttempting to withdraw ₹2000...");

 account.withdraw(2000); // this will succeed

 } 

 catch (InsufficientBalanceException e) {

 System.out.println("Exception: " + e.getMessage());

 } 

 finally {

 System.out.println("Transaction Completed.");

 }

 }

}
