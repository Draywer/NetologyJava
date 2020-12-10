package ru.idcore.basejava.task0161;

import java.time.LocalDate;
import java.util.ArrayList;

public class Book {
    public static int bookCount;//количество книг

    public String name;//название
    public Author author;//автор
    public BookSubType bookSubType;//подтип жанра книги
    public PublishHouse publishHouse;//издательство
    public int issue;//год издательства
    public int pages;
    public Rating rating;//рейтинг
    public ArrayList<BookUrl> bookUrls;//адреса для чтения книг


    public Book(String name, Author author, BookSubType bookSubType, PublishHouse publishHouse, int issue) {
        this.name = name;
        this.author = author;
        this.bookSubType = bookSubType;
        this.publishHouse = publishHouse;
        this.issue = issue;
        this.rating = Rating.RATING_1;
        this.bookUrls = new ArrayList<>();
        bookCount++;
    }

    public Book(String name, Author author, BookSubType bookSubType, PublishHouse publishHouse, int issue, int pages) {
        this(name, author, bookSubType, publishHouse, issue);
        this.pages = pages;
    }


    public String toString() {
        String s;
        s = "Название: " + this.name +
                "\nАвтор: " + this.author.firstName + " " + this.author.secondName +
                "\n" + bookSubType +
                "\n" + publishHouse + ", " + issue +
                "\n" + rating +
                "\n" +
                "\n" + bookUrls;
        return s;
    }

    public boolean equals(Object o) {
        Book book;
        if (o.getClass().equals(Book.class)) {
            book = (Book) o;
            return (this.name.equals(book.name) && this.author.equals(book.author) && this.issue == book.issue);
        } else return false;
    }

    public void addBookFile(BookFormat bookFormat, String url) {
        BookUrl bookUrl = new BookUrl(this, bookFormat, url);

        bookUrls.add(bookUrl);

    }
}
