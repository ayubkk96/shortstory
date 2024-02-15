package account;

public class BankAccount {

    private String id;
    private double balance;

    public BankAccount(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    double overdraftLimit = -100;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be greater than zero");
        }
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative");
        }
        double newBalance = balance - amount;
        if (newBalance < overdraftLimit) {
            System.out.println("You cannot take out more money, you have reach overdraft limit");
        } else {
            balance = newBalance;
        }
    }


    public double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }

}

