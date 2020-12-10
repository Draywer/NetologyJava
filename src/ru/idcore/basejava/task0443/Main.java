package ru.idcore.basejava.task0443;

import ru.idcore.basejava.task0443.transport.TransportDataBase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransportDataBase db = new TransportDataBase();

        db.printTypeTransport();

        while (true) {
            System.out.println("\nДобавить транспортное средство (да/нет)?");
            String input = scanner.next();
            if (input.equals("да")) {
                db.addTransport(scanner);
            } else if (input.equals("нет")) {
                break;
            }
        }
        System.out.println("\n");

        db.printAllTransportGroup();
    }
}
