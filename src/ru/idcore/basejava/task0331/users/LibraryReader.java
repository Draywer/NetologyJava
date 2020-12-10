package ru.idcore.basejava.task0331.users;

import ru.idcore.basejava.task0311.Book;
import ru.idcore.basejava.task0311.FromBorrowedStatusMove;
import ru.idcore.basejava.task0311.FromOverdueStatusMove;
import ru.idcore.basejava.task0311.Status;
import ru.idcore.basejava.task0331.interfaces.Administrator;
import ru.idcore.basejava.task0331.interfaces.Reader;
import ru.idcore.basejava.task0331.library.Library;

/*Класс - Читатель*/
public class LibraryReader extends User implements Reader {

    public LibraryReader(String name) {
        super(name);
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
