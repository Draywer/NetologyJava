package ru.idcore.basejava.task0162;

import ru.idcore.basejava.task0161.Book;
import ru.idcore.basejava.task0161.Country;

import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    public static int userCount;//количество пользователей

    public String firstName;
    public String secondName;
    public String nicName;
    public String email;
    public LocalDate birthday;
    public Country country;
    public ArrayList<Book> boughtBooks;//купленные книги
    public ArrayList<Book> markedBook;//отложенные книги
    public ArrayList<Book> readBook;//прочитанные книги


    public User(String firstName, String secondName, String nicName, String email, LocalDate birthday, Country country) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.nicName = nicName;
        this.email = email;
        this.birthday = birthday;
        this.country = country;

        this.boughtBooks = new ArrayList<>();
        this.markedBook = new ArrayList<>();
        this.readBook = new ArrayList<>();
        userCount++;
    }

    public String toString() {
        String s;

        s = "Пользователь: " + firstName + " " + secondName +
                "\nНиК: " + nicName +
                "\nE-mail: " + email +
                "\nДата рождения: " + birthday +
                "\n" + country +
                "\n\nКупленные книги:\n" + boughtBooks +
                "\n\nОтложенные книги:\n" + markedBook +
                "\n\nЧитаемые книги:\n" + readBook;
        return s;
     }

     public boolean equals(Object o) {
        User user;
        if (o.getClass().equals(User.class)) {
            user = (User) o;
            return (this.email == user.email);
        } else return false;
     }

     public void buyBook(Book book) {
        this.boughtBooks.add(book);
     }

     public void markBook(Book book) {
        this.markedBook.add(book);
     }

     public void readBook(Book book) {
        this.readBook.add(book);
     }
}
