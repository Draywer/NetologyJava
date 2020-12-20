package ru.idcore.basejava.task0331.users;

import ru.idcore.basejava.task0331.interfaces.Administrator;
import ru.idcore.basejava.task0331.interfaces.Librarian;
import ru.idcore.basejava.task0331.interfaces.Reader;
import ru.idcore.basejava.task0331.interfaces.Supplier;
import ru.idcore.basejava.task0311.Book;
import ru.idcore.basejava.task0311.FromAvailableStatusMove;
import ru.idcore.basejava.task0311.FromUnavailableStatusMove;
import ru.idcore.basejava.task0311.Status;
import ru.idcore.basejava.task0331.library.Library;

/*Класс - Работник библиотеки*/
public class LibraryWorker extends User implements Librarian, Administrator {

    public LibraryWorker(String name) {
        super(name);
    }

    //заказ книг
    public void ordersBook(Supplier supplier, Library library, Book book) {
        FromUnavailableStatusMove fromUnavailableStatusMove = new FromUnavailableStatusMove();

        //перевод книги в статус заказано
        fromUnavailableStatusMove.moveToStatus(book, Status.STATUS_BOOKED);

        //ответ о получении заказа
        supplier.receiveBoorOrder(this, library, book);

    }

    //принимает заказанные книги
    public void receiveBookedBook(Supplier supplier, Library library, Book book) {
        System.out.println("\nЗаказ выполнен" +
                "\nИнформация о выполненном заказе:" +
                "\nПолучатель: " + library +
                "\n" + book +
                "\nПолучил: " + this +
                "\nЗаказ выполнил: " + supplier);
    }

    //выдает книгу
    public void givesOutBook(Book book) {
        FromAvailableStatusMove fromAvailableStatusMove = new FromAvailableStatusMove();
        fromAvailableStatusMove.moveToStatus(book, Status.STATUS_BORROWED);
    }

    //находит книгу
    public boolean findsBook(Library library, Book book) {
        boolean result = false;
        for (Book bookInLib : library.getBooks()
        ) {
            if (bookInLib.equals(book)) {
                result = true;
                break;
            }
        }
        return result;
    }

    //уведомляет о просрочке времени возврата
    public void notifiesAboutDelayReturnBook(Reader reader, Library library, Book book) {
        if (book.getStatus().equals(Status.STATUS_OVERDUE)) {
            System.out.println("\nУважаемый(-ая) " + reader + "!" +
                    "\nИстек срок возврата книги." +
                    "\nПросьба вернить книгу: \n" + book +
                    "\nв " + library);
        }
        //
    }

}
