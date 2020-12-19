package ru.idcore.basejava.task0342;

import ru.idcore.basejava.task0342.events.Event;
import ru.idcore.basejava.task0342.events.Movie;
import ru.idcore.basejava.task0342.events.Theatre;

public class Main {
    public static void main(String[] args) {
        Event[] movies = new Movie[]{
                new Movie(null, 1985, 16),
                new Movie("Начало", 2010, 16)};

        Event[] theatres = new Theatre[]{
                new Theatre(null, 2009, 16),
                new Theatre("Анна Каренина", 2017, 16)};

        for (Event event : movies
        ) {
            event.validatesEvent();
        }
        for (Event event : theatres
        ) {
            event.validatesEvent();
        }
        System.out.println("Все события корректны");
    }
}


