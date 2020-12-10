package ru.idcore.basejava.task0161;

public enum Rating {
    RATING_5("Хит", 5),
    RATING_4("Популярный", 4),
    RATING_3("Высокий", 3),
    RATING_2("Средний", 2),
    RATING_1("Низкий", 1);

    public String title;
    public int level;


    Rating(String title, int level) {
        this.title = title;
        this.level = level;
    }

    public String getTitle() {
        return this.title;
    }

    public int getLevel() {
        return this.level;
    }

    public String toString() {
        String s;

        s = "\u2605".repeat(getLevel()) + "\u2606".repeat(5 - getLevel());
        return s;
    }
}
