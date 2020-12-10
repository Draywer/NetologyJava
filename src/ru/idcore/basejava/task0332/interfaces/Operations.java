package ru.idcore.basejava.task0332.interfaces;

import ru.idcore.basejava.task0332.accounts.Account;

public interface Operations {
    //оплатить со счета
    void pay(int amount);

    //перевести со счета
    void transfer(Account account, int amount);

    //пополнить счет
    void addMoney(int amount);

}
