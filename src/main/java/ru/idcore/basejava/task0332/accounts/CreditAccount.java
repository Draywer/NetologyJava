package ru.idcore.basejava.task0332.accounts;

/*Класс - Кредитный счет*/
public class CreditAccount extends Account {

    public CreditAccount(int accountNumber) {
        super();
        this.accountType = AccountType.ACCOUNT_TYPE_CREDIT_ACCOUNT;
        this.accountNumber = accountNumber;
    }

    //пополнить счет
    @Override
    public void addMoney(int amount) {
        if (balance + amount <= 0) {
            super.addMoney(amount);
        } else {
            System.out.println("Операция не доступна");
        }
    }
}
