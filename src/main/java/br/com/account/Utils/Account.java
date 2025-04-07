package br.com.account.Utils;

import br.com.account.Models.User;

public class Account {
    private String accountType;
    private double balance;
    private User user;

    public double balance() {
        return this.balance;
    }

    public User user() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String accountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        if (this.balance >= value) {
            this.balance -= value;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
