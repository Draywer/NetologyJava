package ru.idcore.basejava.task0332.clients;

import ru.idcore.basejava.task0332.accounts.Account;

import java.util.Arrays;

public class Client {
    private String name;
    private Account[] accounts;

    public Client(String name, Account[] accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "\nКлиент: " + name + "\n" + Arrays.toString(accounts);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;

        Client client = (Client) object;
        return name.equals(client.name) && Arrays.equals(accounts, client.accounts);
    }

}
