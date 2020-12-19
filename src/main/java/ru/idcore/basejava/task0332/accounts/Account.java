package ru.idcore.basejava.task0332.accounts;

public abstract class Account {
    protected AccountType accountType;
    protected int accountNumber;
    protected int balance;

    protected Account() {
        this.balance = 0;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public int getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Account account = (Account) object;
        return accountType.equals(account.accountType) && balance == account.balance;
    }

    @Override
    public String toString() {
        return "\nНомер счета: " + accountNumber +
                "\nТип счета: " + accountType +
                "\nБаланс счета: " + balance;

    }

    //оплатить со счета
    public void pay(int amount) {
        balance -= amount;
        System.out.println("Платеж выполнен успешно");
    }

    //перевести между счетами
    public void transfer(Account accountDestination, int amount) {
        balance -= amount;
        accountDestination.addMoney(amount);
        System.out.println("Операция списания выполнена успешно");
    }

    //пополнить счет
    public void addMoney(int amount) {
        balance += amount;
        System.out.println("Операция пополнения выполнена успешно");
    }
}
