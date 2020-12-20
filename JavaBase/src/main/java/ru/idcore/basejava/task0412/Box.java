package ru.idcore.basejava.task0412;

public class Box<K, T> {
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
