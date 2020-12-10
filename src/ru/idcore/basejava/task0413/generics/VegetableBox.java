package ru.idcore.basejava.task0413.generics;

import ru.idcore.basejava.task0413.vegetables.Vegetable;

public class VegetableBox<K, T extends Vegetable> {
    private K key;
    private T obj;

    public VegetableBox(K value, T obj) {
        this.key = value;
        this.obj = obj;
    }

    public K getValue() {
        return key;
    }

    public T getObj() {
        return obj;
    }

    public void setValue(K value) {
        this.key = value;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "VegatableBox{" +
                "key=" + key +
                ", obj=" + obj +
                '}';
    }
}
