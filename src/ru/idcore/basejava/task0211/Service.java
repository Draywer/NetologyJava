package ru.idcore.basejava.task0211;

public class Service {

    //Выбор продукта из ассортимента
    public static String[] chooseProduct(String userChoose) {
        String[] choose;

        choose = userChoose.split(" ");
        return choose;
    }


}
