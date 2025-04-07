package br.com.account;

import br.com.account.Models.Address;
import br.com.account.Models.User;
import br.com.account.Utils.Account;

public class Main {

    public static void main(String[] args) {
        var address = new Address("Rua Amazonas", "82 A", "Rua Amazonas");

        System.out.println(address.street());

        var userAccount = new User(
                "Allan", "Rodrigues", address);

        userAccount.showUser();

        var createAccount = new Account();
        createAccount.setUser(userAccount);
        createAccount.setAccountType("Conta Corrente");
        createAccount.deposit(500.00);
        createAccount.withdraw(200.00);
        System.out.println("Tipo de conta: " + createAccount.accountType());
        System.out.println("Conta criada com sucesso!");
        System.out
                .println("Titular: " + createAccount.user().getFirstName() + " " + createAccount.user().getLastName());
        System.out.println("Endereço: " + createAccount.user().getAddress());
        System.out.println("Saldo: " + createAccount.balance());
    }
}