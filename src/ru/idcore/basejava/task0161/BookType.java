package ru.idcore.basejava.task0161;

public class BookType {
    public static int bookTypeCount;//количество жанров книг

    public String name;

    public BookType(String name) {
        this.name = name;
        bookTypeCount++;
    }

    public String toString() {
        String s;

        s = "Жанр: " + this.name;
        return s;
    }

    public boolean equals(Object o) {
        BookType type;

        if(o.getClass().equals(BookType.class)) {
            type = (BookType) o;
            return this.name.equals(type.name);
        } else return false;
    }

}
