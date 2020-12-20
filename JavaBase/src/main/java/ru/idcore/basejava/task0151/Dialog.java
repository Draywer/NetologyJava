package ru.idcore.basejava.task0151;

import java.util.Scanner;

public class Dialog {
    public static Scanner scanner = new Scanner(System.in);

    public static int getIntFromConsole() {
        return Integer.parseInt(scanner.nextLine());
    }

    public static String getStringFromConsole() {
        return scanner.nextLine();
    }

    public static void printCommand(String command) {
        System.out.println(command);
    }
}
