package BankAccount;

public class User {
    private long accountNumber;
    private double accountBalance;
    private long contactNumber;

    public User(){
        this.accountNumber = 3459234325L;
        this.accountBalance = 800.00d;
        this.contactNumber = 9952530211L;  
    }

    public User(long accountNumber,double accountBalance,long contactNumber){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.contactNumber = contactNumber;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public long getContactNumber(){
        return contactNumber;
    }


    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }

    public void setContactNumber(long contactNumber){
        this.contactNumber = contactNumber;
    }

}
