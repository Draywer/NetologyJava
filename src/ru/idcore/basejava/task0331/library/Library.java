package ru.idcore.basejava.task0331.library;

import ru.idcore.basejava.task0311.*;

/*Класс - Библотека*/
public class Library {
    private String name;
    private Book[] books;

    public Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }
    public Book[] getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object object) {
        boolean result = true;
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Library library = (Library) object;
        if (name.equals(library.name) && books.length == library.books.length) {
            for (int i = 0; i < books.length; i++) {
                if (!books[i].equals(library.books[i])) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return name;
    }

}
