package ru.idcore.basejava.task0321.weapon;

/*Класс - Рогатка*/
public class Slingshot extends Weapon {

    public Slingshot() {
        super("Рогатка");
    }

    @Override
    public void shot() {
        System.out.println("Выстрел из рогатки");
    }
}
