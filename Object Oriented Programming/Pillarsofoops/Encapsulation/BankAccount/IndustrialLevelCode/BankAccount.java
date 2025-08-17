package BankAccount.IndustrialLevelCode;

public class BankAccount {
    private final long accountNumber;
    private double balance;
    private String contactNumber;

    // Constructor with mandatory fields and validation
    public BankAccount(long accountNumber, double initialBalance, String contactNumber) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        if (!isValidContact(contactNumber)) {
            throw new IllegalArgumentException("Contact number is invalid.");
        }
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.contactNumber = contactNumber;
    }

    // Getters
    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    // Setters
    public void setContactNumber(String contactNumber) {
        if (!isValidContact(contactNumber)) {
            throw new IllegalArgumentException("Contact number is invalid.");
        }
        this.contactNumber = contactNumber;
    }

    // Deposit method with validation
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    // Withdraw method with validation
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return false;
        }
        balance -= amount;
        return true;
    }

    // Basic validation for contact numbers (adjust as needed for your context)
    private boolean isValidContact(String contact) {
        return contact != null && contact.matches("\\d{10}");
    }
}
