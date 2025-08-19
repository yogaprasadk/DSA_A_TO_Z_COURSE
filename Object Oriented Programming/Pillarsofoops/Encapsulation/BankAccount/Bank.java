package BankAccount;

import java.util.Scanner;

public class Bank {
    static Scanner S = new Scanner(System.in);
    public static void main(String[] args) {
        
        User yogaAccount = new User();
        System.out.println("Account No:"+yogaAccount.getAccountNumber());

        System.out.println("Account Balance: "+yogaAccount.getAccountBalance());

        System.out.println("Accout Number: "+yogaAccount.getContactNumber());

        yogaAccount.setAccountBalance(2000.00);
        
        System.out.println("Account Balance: "+yogaAccount.getAccountBalance());

        yogaAccount.setContactNumber(902345612L);
        System.out.println("Accout Number: "+yogaAccount.getContactNumber());
        
        
        S.close();
    }
}
