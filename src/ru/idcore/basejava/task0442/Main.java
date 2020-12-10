package ru.idcore.basejava.task0442;

import ru.idcore.basejava.task0442.institute.Institute;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Institute institute = new Institute();

        while (true) {
            System.out.println("Добавить студента (да/нет)?");
            String input = scanner.next();
            if (input.equals("да")) {
                institute.addStudent(scanner);
            } else if (input.equals("нет")) {
                break;
            }

        }
        institute.printStudents();
    }
}
