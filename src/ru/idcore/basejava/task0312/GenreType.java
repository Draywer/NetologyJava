package ru.idcore.basejava.task0312;

public enum GenreType {
    GENRE_TYPE_STORY("Повесть"),
    GENRE_TYPE_NOVEL("Роман"),
    GENRE_TYPE_NARRATIVE("Рассказ"),
    GENRE_TYPE_PROSE("Проза"),
    GENRE_TYPE_VERSE("Стих"),
    GENRE_TYPE_FANTASTIC("Фантастика"),
    GENRE_TYPE_DETECTIVE("Детектив"),
    GENRE_TYPE_PROFESSIONAL("Профессиональная литература");


    private String title;

    GenreType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return this.title;
    }

}
