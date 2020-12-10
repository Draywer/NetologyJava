package ru.idcore.basejava.task0311;

public enum Status {
    STATUS_UNAVAILABLE("Не доступно"),
    STATUS_AVAILABLE("Доступно"),
    STATUS_BORROWED("Взято в использование"),
    STATUS_OVERDUE("Задержано"),
    STATUS_ARCHIVED("В архиве"),
    STATUS_BOOKED("Заказано");


    private String title;

    Status(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "\"" + this.title + "\"";
    }

}
