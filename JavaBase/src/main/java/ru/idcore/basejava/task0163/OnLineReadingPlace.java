package ru.idcore.basejava.task0163;

import ru.idcore.basejava.task0162.User;
import ru.idcore.basejava.task0161.Book;

import java.util.ArrayList;

public class OnLineReadingPlace {
    public static int userOnLineTotal;//количество пользователей онлайн

    public ArrayList<Book> books;
    public ArrayList<User> users;

    public OnLineReadingPlace() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
        userOnLineTotal++;
    }

    public String toString() {
        String s;

        s = "Количество книг в онлайн читалке: " + Book.bookCount +
                "\nВсего пользователей: " + User.userCount +
                "\nКоличестов пользователей онлайн: " + userOnLineTotal;
        return s;

    }
}
