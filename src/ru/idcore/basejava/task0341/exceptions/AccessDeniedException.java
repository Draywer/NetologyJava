package ru.idcore.basejava.task0341.exceptions;

import ru.idcore.basejava.task0341.users.User;

public class AccessDeniedException extends Exception {
    public AccessDeniedException(String message) {
        super(message);
    }

    public AccessDeniedException(User user) {
        super("Доступ запрещен! Пользователю: " + user.getLogin() + " " + user.getAge() + " лет.");

    }
}
