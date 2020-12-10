package ru.idcore.basejava.task0341;

import ru.idcore.basejava.task0341.exceptions.AccessDeniedException;
import ru.idcore.basejava.task0341.exceptions.UserNotFoundException;
import ru.idcore.basejava.task0341.service.Service;
import ru.idcore.basejava.task0341.users.User;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AccessDeniedException, UserNotFoundException {
        User currentUser;
        Scanner scanner = new Scanner(System.in);

        User[] users = new User[]{
                new User("ivanov", "123456", "ivanov@mail.ru", 18),
                new User("petrov", "234567", "petrov@mail.ru", 17),
                new User("sidorov", "345678", "sidorov@mail.ru", 18),
                new User("kozlova", "456789", "kozlova@mail.ru", 19)
        };

        System.out.println(Arrays.toString(users));
        System.out.println("\n");
        currentUser = Service.getUserAccount(users, Service.getUserLogin(scanner), Service.getUserPassword(scanner));

        System.out.println("Текущий пользователь:");
        System.out.println(currentUser);

    }
}
