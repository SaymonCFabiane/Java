package entities;

public class Account {
    private int accountNumber;
    private String holderName;
    private double balance;


    
    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    
    
}
