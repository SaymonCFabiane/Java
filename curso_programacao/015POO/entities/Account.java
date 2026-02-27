package entities;

public class Account {
    private int accountNumber;
    private String holderName;
    private double balance;

    
    public Account(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }
    public Account(double balance) {
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

    public void deposit(double  balance){
        this.balance += balance;
    }

    public void sake(double balance){
        this.balance = this.balance - balance - 5;
    }
    
}
