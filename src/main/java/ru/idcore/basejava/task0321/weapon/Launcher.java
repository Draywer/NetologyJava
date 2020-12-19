package ru.idcore.basejava.task0321.weapon;

/*Класс - Гранатомет*/
public class Launcher extends Weapon {

    public Launcher() {
        super("Гранатомет");
    }

    @Override
    public void shot() {
        System.out.println("Выстрел из гранатомета");
    }

}
