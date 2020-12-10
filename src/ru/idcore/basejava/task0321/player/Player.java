package ru.idcore.basejava.task0321.player;

import ru.idcore.basejava.task0321.weapon.Weapon;

import java.util.Arrays;

/*Класс - Игрок*/
public class Player {
    protected String name;
    protected Weapon[] weaponSlots;

    public Player() {

    }

    public Player(String name, Weapon[] weaponSlots) {
        this.name = name;
        this.weaponSlots = weaponSlots;
    }

    public String getName() {
        return name;
    }

    public Weapon[] getWeaponSlots() {
        return weaponSlots;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeaponSlots(Weapon[] weaponSlots) {
        this.weaponSlots = weaponSlots;
    }

    //количество слотов оружия
    public int getSlotsCount() {
        return weaponSlots.length;
    }

    //выстрел из оружия
    public void shotWithWeapon(int i) {
        Weapon weapon = weaponSlots[i];
        weapon.shot();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;

        Player player = (Player) object;
        return  name.equals(player.name) && Arrays.equals(weaponSlots, player.weaponSlots);
    }

    @Override
    public String toString() {
        return "Игрок: " + name + "\nВооружение: " + Arrays.deepToString(weaponSlots);
    }
}
