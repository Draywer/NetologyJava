package ru.idcore.basejava.task0412;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // параметризируем класс типом String для ключа и значения
        Box<String, String> sample1 = new Box<>("имя", "Нетология");
        System.out.println(sample1);
        // параметризируем класс типом Integer для ключа и Boolean для значения
        Box<Integer, Boolean> sample2 = new Box<>(1, Boolean.TRUE);
        System.out.println(sample2);

        ArrayList<Box<String, Integer>> list1 = new ArrayList<>();
        /*Ошибка компиляции. Объявленный массив типизирован для хранения объектов параметризованного класса Box
        c типом String для ключа и Integer для значения, а пытаемся записать в массив объекты параметризованного класса
         с параметрами <String, String> для sample1 и <Integer, Boolean> для sample2*/
        //list1.add(sample1);
        //list1.add(sample2);

        /*Для того, чтобы разместить sample1 и sample2 в массиве можно типизировать массив "сырой" коллекций Box,
        т.е. массив может хранить любые объкты типа Box
        ArrayList<Box> list2 = new ArrayList<>();
        либо типизировать ArrayList для хранения объектов Box параметризированный любыми типами
        ArrayList<Box<?, ?>> list2 = new ArrayList<>() - wildcard; */
        ArrayList<Box<?, ?>> list2 = new ArrayList<>();
        list2.add(sample1);
        list2.add(sample2);

        System.out.println(list2);

    }
}
