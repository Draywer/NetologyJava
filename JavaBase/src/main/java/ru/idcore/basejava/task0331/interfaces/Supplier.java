package ru.idcore.basejava.task0331.interfaces;

import ru.idcore.basejava.task0311.Book;
import ru.idcore.basejava.task0331.library.Library;

/*Интерфейс - Поставщик книг*/
public interface Supplier {

    //доставляет книги в библиотеку
    void deliveriesBook(Librarian librarian, Library library, Book book);

    //получает заказ на книгу
    void receiveBoorOrder(Librarian librarian, Library library, Book book);

}

