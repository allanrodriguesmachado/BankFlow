package br.com.account.Models;

public class Address {
    private final String street;
    private final Integer number;

    public Address(String street, Integer number) {
        this.street = street;
        this.number = number;
    }

    public String getstreet() {
        return this.street;
    }

    public Integer getNumber() {
        return this.number;
    }
}
