package ru.idcore.basejava.task0431;

import ru.idcore.basejava.task0431.house.House;
import ru.idcore.basejava.task0431.house.Lift;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House house = new House(26, new Lift(5, 10));

        while (true) {
            int input = 0;
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            try{
                input = Integer.parseInt(scanner.nextLine());
                if(input > 0 && input < house.getFloors().length) {
                    house.getLift().addFloor(house.getFloors()[input]);
                } else if (input == 0) {
                    house.getLift().addFloor(house.getFloors()[input]);
                    break;
                } else {
                    System.out.println("Такого этажа в доме нет");
                }
            }
            catch (Exception e) {
                System.out.println("Введен некорректный номер этажа: " + input);
            }
        }
        house.getLift().executeQueue();
    }
}
