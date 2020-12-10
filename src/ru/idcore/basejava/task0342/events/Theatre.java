package ru.idcore.basejava.task0342.events;

import ru.idcore.basejava.task0342.exceptions.NotCorrectEventData;

public class Theatre extends Event {
    public Theatre(String title, int releaseYear, int age) {
        super(title, releaseYear, age);
    }

    @Override
    public void validatesEvent() {
        if (NotCorrectEvent()) {
            throw new NotCorrectEventData("Ошибка валидации данных в театральных событиях");
        }
    }
}
