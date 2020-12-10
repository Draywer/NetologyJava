package ru.idcore.basejava.task0331.interfaces;

import ru.idcore.basejava.task0311.*;
import ru.idcore.basejava.task0331.library.Library;
import ru.idcore.basejava.task0331.users.User;

/*Интерфейс - Библиотекарь*/
public interface Librarian {

    //заказ книг
    void ordersBook(Supplier supplier, Library library, Book book);

    //принимает заказанные книги
    void receiveBookedBook(Supplier supplier, Library library, Book book);

}
