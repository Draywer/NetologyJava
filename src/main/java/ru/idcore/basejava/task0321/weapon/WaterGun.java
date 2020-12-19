package ru.idcore.basejava.task0321.weapon;

/*Класс - Водный пистолет*/
public class WaterGun extends Weapon {

    public WaterGun() {
        super("Водный пистолет");
    }

    @Override
    public void shot() {
        System.out.println("Выстрел из водного пистолета");
    }
}
