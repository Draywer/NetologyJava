package ru.idcore.basejava.task0332.accounts;

/*Класс - Сберегательный счет*/
public class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber) {
        super();
        this.accountType = AccountType.ACCOUNT_TYPE_SAVINGS_ACCOUNT;
        this.accountNumber = accountNumber;
    }

    //оплатить со счета
    @Override
    public void pay(int amount) {
        System.out.println("Операция не доступна");
    }

    //перевести между счетами
    @Override
    public void transfer(Account accountDestination, int amount) {
        if (balance - amount >= 0) {
            super.transfer(accountDestination, amount);
        } else {
            System.out.println("Операция не доступна");
        }
    }

}
