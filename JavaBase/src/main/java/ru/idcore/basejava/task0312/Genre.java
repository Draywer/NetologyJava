package ru.idcore.basejava.task0312;

/*Жанр*/
public class Genre {
    protected String attribute;

    public Genre(String attribute) {
        this.attribute = attribute;
    }

    public String getAttributeOfGenre() {
        return this.attribute;
    }

    public String getGenreName() {
        return "Жанр не указан";
    }
}
