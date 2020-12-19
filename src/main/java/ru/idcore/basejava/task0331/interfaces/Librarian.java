package ru.idcore.basejava.task0331.interfaces;

import ru.idcore.basejava.task0311.Book;
import ru.idcore.basejava.task0331.library.Library;

/*Интерфейс - Библиотекарь*/
public interface Librarian {

    //заказ книг
    void ordersBook(Supplier supplier, Library library, Book book);

    //принимает заказанные книги
    void receiveBookedBook(Supplier supplier, Library library, Book book);

}
