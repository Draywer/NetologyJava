package ru.idcore.basejava.task0441;

import ru.idcore.basejava.task0441.phonebook.PhonesBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        PhonesBook phonesBook = new PhonesBook();

        while (true) {
            System.out.println("Создать группу контактов (введите да/нет)?");
            input = scanner.nextLine();
            if (input.equals("да")) {
                phonesBook.addNewGroup(scanner);
            } else if (input.equals("нет")) {
                break;
            }
        }

        while (true) {
            System.out.println("Добавить контакт (введите да/нет)?");
            input = scanner.nextLine();
            if (input.equals("да")) {
                phonesBook.addNewContact(scanner);
            } else if (input.equals("нет")) {
                break;
            }
        }

        phonesBook.printPhoneBookByContact();
        System.out.println("\n");
        phonesBook.printPhoneGroup();

    }
}
