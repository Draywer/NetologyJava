package ru.idcore.basejava.task0152;

import ru.idcore.basejava.task0151.Dialog;

public class Main {
    public static void main(String[] args) {
        String inputString;
        String trimString;

        Dialog.printCommand("Введите текст с большим количеством пробелов:");
        inputString = Dialog.getStringFromConsole();

        trimString = Text.trimString(inputString);
        System.out.println("Пробелы удалены:");
        System.out.println(Text.extraTrimString(trimString));
    }
}
