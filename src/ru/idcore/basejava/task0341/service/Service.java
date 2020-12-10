package ru.idcore.basejava.task0341.service;

import ru.idcore.basejava.task0341.exceptions.AccessDeniedException;
import ru.idcore.basejava.task0341.exceptions.UserNotFoundException;
import ru.idcore.basejava.task0341.users.User;

import java.util.Scanner;

public class Service {
    public static String getUserLogin(Scanner scanner) {
        System.out.println("Введите login:");
        return scanner.nextLine();
    }

    public static String getUserPassword(Scanner scanner) {
        System.out.println("Введите password:");
        return scanner.nextLine();
    }

    public static User getUserAccount(User[] users, String login, String password) throws AccessDeniedException, UserNotFoundException {
        for (User user: users
             ) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                if (checkUserAge(user)) {
                    System.out.println("Пользователю: " + user.getLogin() + " предоставлен доступ к ресурсу." );
                    return user;
                }
            }
        }
        throw new UserNotFoundException(login, password);
    }

    public static boolean checkUserAge(User user) throws AccessDeniedException {
        if(user.getAge() >= 18) {
            return true;
        } else {
            throw new AccessDeniedException(user);
        }
    }


}
