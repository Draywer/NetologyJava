package ru.idcore.basejava.task0321.service;

import ru.idcore.basejava.task0321.weapon.Weapon;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Service {

    //проверка ввода числа
    static boolean checkInputString(String input) {
        return Pattern.matches("\\d{1,3}", input);
    }

    //проверка выбора оружия из массива
    private static boolean checkSelectedWeapon(Weapon[] weapons, int i) {
        return i >= 0 && i < weapons.length;
    }

    //ввод данных
    public static int selectWeapon(Weapon[] weapons, Scanner scanner){
        String input = "";
        while (true) {
            System.out.println("Выберете код оружия игрока для стрельбы или \"-1\" для выхода");
            input = scanner.nextLine();
            if (checkInputString(input)) {
                if (checkSelectedWeapon(weapons, Integer.parseInt(input))) {
                    break;
                }
            } else if (input.equals("-1")) {
                break;
            }
        }
        return Integer.parseInt(input);
    }
}
