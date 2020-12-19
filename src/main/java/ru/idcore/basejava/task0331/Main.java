package ru.idcore.basejava.task0331;

import ru.idcore.basejava.task0331.interfaces.Administrator;
import ru.idcore.basejava.task0331.interfaces.Librarian;
import ru.idcore.basejava.task0331.interfaces.Reader;
import ru.idcore.basejava.task0331.interfaces.Supplier;
import ru.idcore.basejava.task0331.library.Library;
import ru.idcore.basejava.task0331.users.LibraryClient;
import ru.idcore.basejava.task0331.users.LibraryReader;
import ru.idcore.basejava.task0331.users.LibraryWorker;
import ru.idcore.basejava.task0311.Book;
import ru.idcore.basejava.task0311.FromBorrowedStatusMove;
import ru.idcore.basejava.task0311.Status;

public class Main {
    public static void main(String[] args) {
        //статусная модель взята из задачи про BookMover

        //формируем библиотеку. статус книг - не доступны
        Library library = new Library("Бибиотека № 1",
                new Book[]{
                        new Book("Стивен Кинг", "Стрелок"),
                        new Book("Стивен Кинг", "11/22/63"),
                        new Book("Стивен Кинг", "ОНО"),
                        new Book("Стивен Кинг", "Противостояние"),
                        new Book("Стивен Кинг", "Темная башня")
                });

        //вывод на экран библиотеки
        System.out.println("\nСтатус книг в вашей библиотеке:\n");
        for (Book book : library.getBooks()
        ) {
            System.out.println(book + "\n");
        }


        //создаем юзеров
        Librarian librarian = new LibraryWorker("Иванова М.А.");
        Administrator administrator = (Administrator) librarian; //библиотекарь в роли администратора
        Reader reader = new LibraryReader("Сидорова Т.Н.");
        Supplier supplier = new LibraryClient("Гусев П.П.");

        Reader readerSupplier = (Reader) supplier; //поставщик в роли читатетля

        //заказывем книги
        System.out.println("\nИнформация о заказе книг");
        for (Book book : library.getBooks()
        ) {
            librarian.ordersBook(supplier, library, book);
        }

        //доставка всех книг

        System.out.println("\nИнформация о выполненном заказе");
        for (Book book : library.getBooks()
        ) {
            supplier.deliveriesBook(librarian, library, book);
        }

        //выдача всех книг пользователю

        System.out.println("\nВыдадим все книги читателю: ");
        for (Book book : library.getBooks()
        ) {
            if (reader.takesBookFromLibrary(administrator, library, book)) {
                System.out.println("\nЧитателю выдана книга: \n" + book + "\nЧитатель: " + reader);
            } else {
                System.out.println("\nОтказано в выдаче книги: \n" + book);
            }
        }

        //Пытаемся еще раз выдать все книги читателю(проверка):
        System.out.println("\nПытаемся еще раз выдать все книги читателю: ");
        for (Book book : library.getBooks()
        ) {
            if (reader.takesBookFromLibrary(administrator, library, book)) {
                System.out.println("\nЧитателю выдана книга: " + book + "\nЧитатель: " + reader);
            } else {
                System.out.println("\nОтказано в выдаче книги: \n" + book);
            }
        }


        //Переводим все книги в статус просрочено
        System.out.println("\nПереводим все книги в статус просрочено: ");
        for (Book book : library.getBooks()
        ) {
            FromBorrowedStatusMove fromBorrowedStatusMove = new FromBorrowedStatusMove();
            fromBorrowedStatusMove.moveToStatus(book, Status.STATUS_OVERDUE);
        }

        //Просим пользователя вернуть все книги
        System.out.println("\nПросим пользователя вернуть все книги, если срок возврата истек: ");
        for (Book book : library.getBooks()
        ) {
            administrator.notifiesAboutDelayReturnBook(reader, library, book);
        }

        //читатель возвращает все книги в библиотеку
        System.out.println("\nЧитатель возвращает все книги в библиотеку: \n");
        for (Book book : library.getBooks()
        ) {
            reader.returnsBookToLibrary(administrator, library, book);
        }


        //выдача всех книг пставщику читателю
        System.out.println("\nВыдадим все книги читателю: ");
        for (Book book : library.getBooks()
        ) {
            if (readerSupplier.takesBookFromLibrary(administrator, library, book)) {
                System.out.println("\nЧитателю выдана книга: \n" + book + "\nЧитатель: " + readerSupplier);
            } else {
                System.out.println("\nОтказано в выдаче книги: \n" + book);
            }
        }


    }
}
