package ru.idcore.basejava.task0341.exceptions;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String login, String password) {
        super("Пользователь: " + login + " / " + password + " не найден.");

    }
}
