package ru.idcore.basejava.task0331.users;

import ru.idcore.basejava.task0311.*;
import ru.idcore.basejava.task0331.interfaces.Administrator;
import ru.idcore.basejava.task0331.interfaces.Librarian;
import ru.idcore.basejava.task0331.interfaces.Reader;
import ru.idcore.basejava.task0331.interfaces.Supplier;
import ru.idcore.basejava.task0331.library.Library;

/*Класс - Клиент Библиотеки*/
public class LibraryClient extends User implements Supplier, Reader {

    public LibraryClient(String name) {
        super(name);
    }

    //доставляет книги в библиотеку
    public void deliveriesBook(Librarian librarian, Library library, Book book) {
        FromBookedStatusMove fromBookedStatusMove = new FromBookedStatusMove();

        //перевод книг из статуса "заказано" в статус "доступно"
        fromBookedStatusMove.moveToStatus(book, Status.STATUS_AVAILABLE);

        librarian.receiveBookedBook(this, library, book);

    }


    //получает заказ на книгу
    public void receiveBoorOrder(Librarian librarian, Library library, Book book) {
        //
        System.out.println("\nВаш заказ зарегистрирован. \nИнформация о заказе:\n" +
                book + "\nБиблиотека: " + library +
                "\nКонтактное лицо: " + librarian +
                "\nЗаказ доставит: " + this);
    }

    //берет книгу в библиотеке
    public boolean takesBookFromLibrary(Administrator administrator, Library library, Book book) {
        boolean result = false;
        //просим администратора найти книгу
        if (administrator.findsBook(library, book)) {
            if (book.getStatus().equals(Status.STATUS_AVAILABLE)) {
                //выдаем книгу
                result = true;
                administrator.givesOutBook(book);
            }
        }
        return result;
    }

    //возвращает книгу в библиотеку
    public void returnsBookToLibrary(Administrator administrator, Library library, Book book) {
        FromBorrowedStatusMove fromBorrowedStatusMove = new FromBorrowedStatusMove();
        FromOverdueStatusMove fromOverdueStatusMove = new FromOverdueStatusMove();

        if (book.getStatus().equals(Status.STATUS_BORROWED)) {
            fromBorrowedStatusMove.moveToStatus(book, Status.STATUS_AVAILABLE);
        } else if (book.getStatus().equals(Status.STATUS_OVERDUE)) {
            fromOverdueStatusMove.moveToStatus(book, Status.STATUS_AVAILABLE);
        }
        System.out.println("Читатель: " + this + " возвратил(-а) книгу: \n" + book + "\nПринял(-а): " + administrator + "\n");
    }


}
