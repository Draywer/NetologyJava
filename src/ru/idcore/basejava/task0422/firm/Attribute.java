package ru.idcore.basejava.task0422.firm;

/*Класс - Атрибут*/
public class Attribute<K, T> {
    private K key;
    private T obj;

    public Attribute(K key, T obj) {
        this.key = key;
        this.obj = obj;
    }

    public K getKey() {
        return key;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Атрибут{" +
                "ключ =" + key +
                ", значение =" + obj +
                '}';
    }
}
