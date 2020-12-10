package ru.idcore.basejava.task0421;

import ru.idcore.basejava.task0421.notes.NoteBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NoteBook noteBook = new NoteBook();

        while (true) {
            noteBook.printMenu();
            String input = scanner.nextLine();
            try {
                if (Integer.parseInt(input) == 0) {
                    break;
                } else {
                    switch (Integer.parseInt(input)) {
                        case 1:
                            if (noteBook.addTasks(scanner)) {
                                break;
                            }
                        case 2:
                            noteBook.printTask();
                            break;
                        case 3:
                            if (noteBook.deleteTasks(scanner)) {
                                break;
                            }
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Введен некорректный код: " + input);
            }
        }
        noteBook.printTask();
    }
}
