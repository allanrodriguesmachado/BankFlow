package br.com.account;

import br.com.account.Models.Address;
import br.com.account.Models.User;

public class Main {

    public static void main(String[] args) {
        var address = new Address("Rua Amazonas", 82);

        var userAccount = new User(
                "Allan", "Rodrigues", address);

        userAccount.showUser();
    }
}