package br.com.account.Models;

public class User {
    private final String firstName;
    private final String LastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.LastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.LastName;
    }
}
