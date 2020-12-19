package ru.idcore.basejava.task0321;

import ru.idcore.basejava.task0321.player.Player;
import ru.idcore.basejava.task0321.service.Service;
import ru.idcore.basejava.task0321.weapon.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player;
        String input;

        System.out.println("Введите имя игрока: ");
        input = scanner.nextLine();
        player = new Player(
                input,
                new Weapon[]{
                        new Launcher(),
                        new Machine(),
                        new Pistol(),
                        new Slingshot(),
                        new WaterGun()});

        System.out.println(player);

        System.out.println("\nУ игрока: " + player.getName() + " - " + player.getSlotsCount() + " видов орижия.");
        System.out.printf("%-5s%-15s", "Код", "Название оружия\n");
        for (int i = 0; i < player.getWeaponSlots().length ; i++) {
            System.out.printf("%-5s%-15s", i, player.getWeaponSlots()[i]);
            System.out.println();
        }

        while (true) {
            int i = Service.selectWeapon(player.getWeaponSlots(),scanner);
            if (i != -1) {
                player.shotWithWeapon(i);
            } else break;
        }

    }
}
