package gr.aueb.cf.ch8.exersices;

import java.util.Scanner;

public class SimpleBankExersice {

    static double balance = 500;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("--- Simple Bank Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to deposit: ");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw: ");
                    amount = scanner.nextInt();
                    withdraw(amount);
                    break;
                case 3:
                    System.out.println("Current balance: $" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using Simple Bank\nGoodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    public static void withdraw(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Amount must be positive");
            }
            if (amount >= balance) {
                throw new IllegalArgumentException("Amount must be less than balance");
            }
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            throw e;
        }
    }

    public static void deposit(double amount) throws Exception {
        try {
            if (amount <= 0) {
                throw new Exception("Amount must be positive");
            }
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            throw e;
        }
    }
}
