package ru.idcore.basejava.task0422;

import ru.idcore.basejava.task0422.firm.Firm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Firm firm = new Firm();

        firm.inputEmployees(scanner);
        firm.editEmployees(scanner);
    }
}
