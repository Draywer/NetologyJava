package ru.idcore.basejava.task0161;

public class BookUrl {
    public Book book;//книга
    public BookFormat bookFormat;//формат книги
    public String bookUrl;//url


    public BookUrl(Book book, BookFormat bookFormat, String bookUrl) {
        this.book = book;
        this.bookFormat = bookFormat;
        this.bookUrl = bookUrl;
    }

    public String toString() {
        String s;

        s = "Формат: " + bookFormat + " " + bookUrl;
        return s;
    }
}
