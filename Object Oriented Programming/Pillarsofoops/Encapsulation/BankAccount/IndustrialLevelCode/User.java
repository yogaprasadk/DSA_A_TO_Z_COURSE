package BankAccount.IndustrialLevelCode;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a new bank account with user input and validation
        System.out.print("Enter account number: ");
        long accNumber = sc.nextLong();
        System.out.print("Enter initial balance: ");
        double initBalance = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter contact number (10 digits): ");
        String contact = sc.nextLine();

        BankAccount userAccount;
        try {
            userAccount = new BankAccount(accNumber, initBalance, contact);
        } catch (IllegalArgumentException e) {
            System.out.println("Could not create account: " + e.getMessage());
            sc.close();
            return;
        }

        boolean running = true;
        while (running) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Update Contact Number");
            System.out.println("5. View Account Details");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + userAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    sc.nextLine();
                    try {
                        userAccount.deposit(dep);
                        System.out.println("Deposit successful. New Balance: ₹" + userAccount.getBalance());
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double wit = sc.nextDouble();
                    sc.nextLine();
                    try {
                        boolean success = userAccount.withdraw(wit);
                        if (success) {
                            System.out.println("Withdrawal successful. New Balance: ₹" + userAccount.getBalance());
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter new contact number: ");
                    String newContact = sc.nextLine();
                    try {
                        userAccount.setContactNumber(newContact);
                        System.out.println("Contact number updated successfully.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Account Number: " + userAccount.getAccountNumber());
                    System.out.println("Contact Number: " + userAccount.getContactNumber());
                    System.out.println("Balance: ₹" + userAccount.getBalance());
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        sc.close();
        System.out.println("Thank you for banking with us!");
    }
}