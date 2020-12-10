package ru.idcore.basejava.task0321.weapon;

/*Класс - Оружие*/
public class Weapon {
    protected String name;

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Weapon weapon = (Weapon) object;
        return name.equals(weapon.name);
    }

    public void shot() {
        System.out.println("Метод выстрел необходимо переопределить в классе потомке....");
    }

}
