package application;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class ProgramBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holderName = sc.nextLine();
        Account account = new Account(accountNumber, holderName);
        System.out.print("Is there na initial deposit (Y/N)? ");
        char sn = sc.nextLine().charAt(0);
        double balance;

        if(sn == 'y' || sn == 'Y'){
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
            account.deposit(balance);
        }

        System.out.println();

        System.out.println("Account data: ");
        System.out.printf("Account: " + account.getAccountNumber() + ", Holder: " + account.getHolderName() + ", Balance: $ %.2f", account.getBalance());
        System.out.println();
        System.out.println();
        System.out.print("Enter a deposit value: ");
        balance = sc.nextDouble();
        account.deposit(balance);
        System.out.println("Updated account data: ");
        System.out.printf("Account: " + account.getAccountNumber() + ", Holder: " + account.getHolderName() + ", Balance: $ %.2f", account.getBalance());
        System.out.println();

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        balance = sc.nextDouble();
        account.sake(balance);
        System.out.println("Updated account data: ");
        System.out.printf("Account: " + account.getAccountNumber() + ", Holder: " + account.getHolderName() + ", Balance: $ %.2f", account.getBalance());
        System.out.println();
        System.out.println();
        System.out.println();

        sc.close();

    }
}
