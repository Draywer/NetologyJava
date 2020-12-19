package ru.idcore.basejava.task0321.weapon;

/*Класс - Автомат*/
public class Machine extends Weapon {

    public Machine() {
        super("Автомат");
    }

    @Override
    public void shot() {
        System.out.println("Выстрел из автомата");
    }
}
