package br.com.account.Models;

public class User {
    private final String firstName;
    private final String lastName;
    private final Address address;

    public User(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAddress() {
        return this.address.street();
    }

    public void showUser() {
        System.out.println("User: " + this.firstName + " " + this.lastName);
        System.out.println("Address: Street" + this.address.street() + " Number: " + this.address.number());
    }
}
