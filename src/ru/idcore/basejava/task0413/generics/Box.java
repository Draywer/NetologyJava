package ru.idcore.basejava.task0413.generics;

import ru.idcore.basejava.task0413.fruits.Fruit;

public class Box<K, T extends Fruit> {
    private K key;
    private T obj;

    public Box(K key, T obj) {
        this.key = key;
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public K getKey() {
        return key;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Box{" +
                "key=" + key +
                "; keyType=" + key.getClass().getName() +
                ", obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }

}
