import java.util.Scanner;
/**
 * Creating BankAccount class.
 * By using constructor creating accountNumber and balance.
 * It provides methods to deposit and withdraw the amount.
 */
 class BankAccount {
     // creating class for BankAccount
     private double accountNumber; // use
     private double balance;
     // creating constructor 1 For a new account with zero balance
     public BankAccount(int accountNumber){
         this.accountNumber = accountNumber;
         this.balance = 0.0;
     }
     // creating constructor 2 for a new account with an initial deposit
     public BankAccount(int accountNumber, double balance) {
         this.accountNumber = accountNumber;
         this.balance = balance;
     }
     // Method to deposit amount
     public void deposit(double amount) {
             balance += amount;
             System.out.println("Deposited:" + amount);
             System.out.println("Remaining Balance:" + balance);
         }
         // Method to withdraw amount
     public void withdraw(double amount) {
         if (amount > balance) {
             System.out.println("Insufficient Balance");
         } else {
             balance -= amount;
             System.out.println("Withdrawn:" + amount);
             System.out.println("Remaining Balance:" + balance);
         }
     }
 }
    public class Main {
     // creating main class
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Creating object using Constructor 1
            BankAccount b1 = new BankAccount(1001,0.0);
            {
                System.out.println("Enter your depositing amount:");
                b1.deposit(sc.nextDouble());
            }
            // Creating object using Constructor 2
            BankAccount b2 = new BankAccount(1002,20000);
            {
                System.out.println("Enter your depositing amount:");
                b2.deposit(sc.nextDouble());
            }
            // Creating object using overloaded constructor
            BankAccount b3 = new BankAccount(1003,15000);
            {
                System.out.println("Enter your withdrawing amount:");
                b3.withdraw(sc.nextDouble());
            }
        }
    }




