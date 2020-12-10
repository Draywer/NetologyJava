package ru.idcore.basejava.task0331.interfaces;

import ru.idcore.basejava.task0311.*;
import ru.idcore.basejava.task0331.library.Library;
import ru.idcore.basejava.task0331.users.User;

/*Интерфейс - Читатель*/
public interface Reader {

    //берет книгу в библиотеке
    boolean takesBookFromLibrary(Administrator administrator, Library library, Book book);

    //возвращает книгу в библиотеку
    void returnsBookToLibrary(Administrator administrator, Library library, Book book);
}
