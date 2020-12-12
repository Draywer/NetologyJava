package ru.idcore.javacore.task030201;

import java.util.ArrayList;
import java.util.List;

public class MyNumber {

    public List<Integer> ascendingSortOrder(List<Integer> list) {
        int buf;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j + 1) < list.get(j)) {
                    buf = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, buf);
                }
            }
        }
        return list;
    }

    public List<Integer> descendingSortOrder(List<Integer> list) {
        int buf;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j + 1) > list.get(j)) {
                    buf = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, buf);
                }
            }
        }

        return list;
    }

    public List<Integer> positive(List<Integer> list) {
        List<Integer> positiveList = new ArrayList<>();

        for (Integer integer : list){
            if (integer > 0) {
                positiveList.add(integer);
            }
        }

        return positiveList;
    }

    public List<Integer> negative(List<Integer> list) {
        List<Integer> positiveList = new ArrayList<>();

        for (Integer integer : list){
            if (integer < 0) {
                positiveList.add(integer);
            }
        }
        return positiveList;
    }

    public List<Integer> even (List<Integer> list) {
        List<Integer> positiveList = new ArrayList<>();

        for (Integer integer : list){
            if (integer%2 == 0) {
                positiveList.add(integer);
            }
        }
        return positiveList;
    }

    public List<Integer> odd (List<Integer> list) {
        List<Integer> positiveList = new ArrayList<>();

        for (Integer integer : list){
            if (integer%2 != 0) {
                positiveList.add(integer);
            }
        }
        return positiveList;
    }

    public List<Integer> positiveEvenAscending(List<Integer> list) {
        List<Integer> integerList = new ArrayList<>();
        integerList = ascendingSortOrder(positive(even(list)));

        return integerList;
    }
}
