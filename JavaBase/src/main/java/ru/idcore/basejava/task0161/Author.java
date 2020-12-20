package ru.idcore.basejava.task0161;

import java.time.LocalDate;
import java.util.ArrayList;

public class Author {
    public static int authorCount; //количество авторов

    public String firstName; //фамилия
    public String secondName;//имя
    private LocalDate birthday;//дата рождения
    public String aboutAuthor;//об авторе
    public Country country;
    public Rating rating;//рейтинг
    public ArrayList<Book> books;//книги автора


    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.rating = Rating.RATING_1;
        this.books = new ArrayList<>();
        authorCount++;
    }


    public Author(String firstName, String secondName, LocalDate birthday, String aboutAuthor, Country country) {
        this(firstName, secondName);
        this.birthday = birthday;
        this.aboutAuthor = aboutAuthor;
        this.country = country;
    }


    public Author(String firstName, String secondName, LocalDate birthday, String aboutAuthor, Country country, Rating rating) {
        this(firstName, secondName, birthday, aboutAuthor, country);
        this.rating = rating;
    }

    public String toString() {
        String s;

        s = "Автор: " + this.firstName + " " + this.secondName +
                "\nДата рождения: " + this.birthday + "\n" + this.country +
                "\nРейтинг: " + this.rating +
                "\n\nОб авторе:\n\n" + aboutAuthor +
                "\n\nКниги:" +
                "\n\n" + books;
        return s;
    }

    public boolean equals(Object o) {
        Author author;
        if (o.getClass().equals(Author.class)) {
            author = (Author) o;
            return (this.firstName.equals(author.firstName) &&
                    this.secondName.equals(author.secondName) &&
                    this.birthday.equals(author.birthday));
         } else return false;
    }

    public void addBook(String name,
                        BookSubType bookSubType,
                        PublishHouse publishHouse,
                        int issue,
                        int pages,
                        BookFormat bookFormat,
                        String url) {
        Book book = new Book(name, this, bookSubType, publishHouse, issue, pages);
        book.addBookFile(bookFormat, url);
        this.books.add(book);
    }

    public ArrayList<Book> getAuthorBooks(ArrayList<Book> books) {
        ArrayList<Book> bookArrayList = new ArrayList<>();
        for (Book b : books) {
            if (b.author == this) {
                bookArrayList.add(b);
            }
        }
        return bookArrayList;
    }
}
