package ru.idcore.basejava.task0321.weapon;

/*Класс - Пистолет*/
public class Pistol extends Weapon {

    public Pistol() {
        super("Пистолет");
    }

    @Override
    public void shot() {
        System.out.println("Выстрел из пистолета");
    }

}
