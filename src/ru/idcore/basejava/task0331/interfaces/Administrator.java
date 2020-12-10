package ru.idcore.basejava.task0331.interfaces;

import ru.idcore.basejava.task0311.*;
import ru.idcore.basejava.task0331.library.Library;
import ru.idcore.basejava.task0331.users.User;

//Интефейс - Администратор
public interface Administrator {

    //выдает книгу
    void givesOutBook(Book book);

    //находит книгу
    boolean findsBook(Library library, Book book);

    //уведомляет о просрочке времени возврата
    void notifiesAboutDelayReturnBook(Reader reader, Library library, Book book);
}
