package ru.idcore.basejava.task0413;

import ru.idcore.basejava.task0413.fruits.Apple;
import ru.idcore.basejava.task0413.fruits.Banana;
import ru.idcore.basejava.task0413.fruits.Fruit;
import ru.idcore.basejava.task0413.generics.Box;
import ru.idcore.basejava.task0413.generics.VegetableBox;
import ru.idcore.basejava.task0413.vegetables.Cabbage;

public class Main {
    public static void main(String[] args) {
        Box<String, Banana> bananaBox = new Box<>("banana", new Banana());
        bananaBox.getObj().printClass();

        Box<String, Apple> appleBox = new Box<>("apple", new Apple());
        appleBox.getObj().printClass();

        /*Изначально класс Fruit объявлен как abstract. Нельзя создать объект абстрактного типа.
        Для исправления ошибки компиляции нужно объявить класс Fruit неабстрактным */
        Box<String, Fruit> fruitBox = new Box<>("fruit", new Fruit());
        fruitBox.getObj().printClass();


        /* В качесте параметра T в Box можно передать только наследника класса Fruit, а Cabbage не является наследником
        класса Fruit
        Box<String, Cabbage> cabbageBox = new Box<>("cabbage", new Cabbage());
        cabbageBox.getObj().printClass();*/


        VegetableBox<String, Cabbage> vegetableBox = new VegetableBox<>("cabbage", new Cabbage());
        vegetableBox.getObj().printClass();
    }
}

