package ru.idcore.javacore.task030201;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber();
        MyStreamNumber myStreamNumber = new MyStreamNumber();

        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        //без испоьзования без использования Collection API и Stream API
        List<Integer> list1 = myNumber.positiveEvenAscending(list);
        System.out.println(list1.toString());

        //с использованием SreamAPI
        List<Integer> list2 = myStreamNumber.positiveEvenAscending(list);
        System.out.println(list2.toString());


    }
}
