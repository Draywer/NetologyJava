package ru.idcore.basejava.task0431.house;

/*Класс - Этаж*/
public class Floor {
    private final int floor;

    public Floor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        return "Этаж " + floor;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Floor floor = (Floor) o;

        return this.floor == floor.floor;
    }
}
