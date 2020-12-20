package ru.idcore.basejava.task0332;

import ru.idcore.basejava.task0332.clients.Client;
import ru.idcore.basejava.task0332.accounts.Account;
import ru.idcore.basejava.task0332.accounts.CheckingAccount;
import ru.idcore.basejava.task0332.accounts.CreditAccount;
import ru.idcore.basejava.task0332.accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Иванов И.И.",
                new Account[]{
                new CheckingAccount(100000),
                new CreditAccount(100001),
                new SavingsAccount(100002)});

        System.out.println(client);

        System.out.println("");

        //пример пополнение расчетного счета
        System.out.println("\nПополнение расчетного счета на 1000");
        System.out.println("\nБыло:");
        System.out.println(client.getAccounts()[0]);
        client.getAccounts()[0].addMoney(1000);
        System.out.println("\nСтало:");
        System.out.println(client.getAccounts()[0]);



        //пример пополнения кредитного счета
        System.out.println("\nПополнение кредитного счета на 1000");
        System.out.println("\nБыло:");
        System.out.println(client.getAccounts()[1]);
        client.getAccounts()[1].addMoney(1000);
        System.out.println("\nСтало:");
        System.out.println(client.getAccounts()[1]);


        //пример платежа с расчетного счета > баланса счета
        System.out.println("\nПлатеж с расчетного счета > баланса на 2000");
        System.out.println("\nБыло:");
        System.out.println(client.getAccounts()[0]);
        client.getAccounts()[0].pay(2000);
        System.out.println("\nСтало:");
        System.out.println(client.getAccounts()[0]);



        //пример платежа с расчетного счета < баланса счета
        System.out.println("\nПлатеж с расчетного счета < баланса на 450");
        System.out.println("\nБыло:");
        System.out.println(client.getAccounts()[0]);
        client.getAccounts()[0].pay(450);
        System.out.println("\nСтало:");
        System.out.println(client.getAccounts()[0]);


        //пример платежа с кредитного счета
        System.out.println("\nПлатеж с кредитного счета на 2000");
        System.out.println("\nБыло:");
        System.out.println(client.getAccounts()[0]);
        client.getAccounts()[1].pay(2000);
        System.out.println("\nСтало:");
        System.out.println(client.getAccounts()[1]);


        //пример платежа со сберегательного счета
        System.out.println("\nПлатеж со сберегательного счета на 2000");
        System.out.println("\nБыло:");
        System.out.println(client.getAccounts()[2]);
        client.getAccounts()[2].pay(2000);
        System.out.println("\nСтало:");
        System.out.println(client.getAccounts()[2]);


        //пример перевода с кредитного счета на расчетный счет
        System.out.println("\nПеревод с кредитного счета на расчетный счет на 2500");
        System.out.println("\nБыло:");
        System.out.println(client.getAccounts()[1]);
        System.out.println(client.getAccounts()[0]);
        client.getAccounts()[1].transfer(client.getAccounts()[0], 2500);
        System.out.println("\nСтало:");
        System.out.println(client.getAccounts()[1]);
        System.out.println(client.getAccounts()[0]);

        //пример перевода с расчетного счета на сберегательный счет
        System.out.println("\nПеревод с расчетного счета на сберегательный счет на 5000");
        System.out.println("\nБыло:");
        System.out.println(client.getAccounts()[0]);
        System.out.println(client.getAccounts()[2]);
        client.getAccounts()[0].transfer(client.getAccounts()[2], 5000);
        System.out.println("\nСтало:");
        System.out.println(client.getAccounts()[0]);
        System.out.println(client.getAccounts()[2]);

    }
}
