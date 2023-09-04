/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
/*
public class Account {
    private String name;
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(String name, String accountNumber, String accountType, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void getBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void checkMinimumBalance() {
        // Check if balance is below minimum required and impose penalty if necessary
    }
}

public class SavingsBankAccount extends Account {
    private double minimumBalance;
    private double interestRate;

    public SavingsBankAccount(String name, String accountNumber, String accountType, double balance, double minimumBalance, double interestRate) {
        super(name, accountNumber, accountType, balance);
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
    }

    public void computeInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < minimumBalance) {
            System.out.println("Withdrawal not permitted. Balance will fall below minimum required.");
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public void checkMinimumBalance() {
        if (getBalance() < minimumBalance) {
            // Impose penalty
        }
    }
}

public class CurrentAccount extends Account {
    private double minimumBalance;

    public CurrentAccount(String name, String accountNumber, String accountType, double balance, double minimumBalance) {
        super(name, accountNumber, accountType, balance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void checkMinimumBalance() {
        if (getBalance() < minimumBalance) {
            // Impose penalty
        }
    }
}*/
