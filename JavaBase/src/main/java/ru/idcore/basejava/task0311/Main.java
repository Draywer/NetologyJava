package ru.idcore.basejava.task0311;

public class Main {
    public static void main(String[] args) {
        FromOverdueStatusMove fromOverdueStatusMove = new FromOverdueStatusMove();
        FromBorrowedStatusMove fromBorrowedStatusMove = new FromBorrowedStatusMove();
        FromArchivedStatusMove fromArchivedStatusMove = new FromArchivedStatusMove();
        FromAvailableStatusMove fromAvailableStatusMove = new FromAvailableStatusMove();

        Book book = new Book("Стивен Кинг", "Стрелок");
        System.out.println(book);

        fromAvailableStatusMove.moveToStatus(book, Status.STATUS_OVERDUE);
        System.out.println();
        System.out.println(book);

        fromAvailableStatusMove.moveToStatus(book,Status.STATUS_BORROWED);
        System.out.println();
        System.out.println(book);

        fromBorrowedStatusMove.moveToStatus(book, Status.STATUS_OVERDUE);
        System.out.println();
        System.out.println(book);

        fromOverdueStatusMove.moveToStatus(book, Status.STATUS_ARCHIVED);
        System.out.println();
        System.out.println(book);

        fromArchivedStatusMove.moveToStatus(book, Status.STATUS_BORROWED);
        System.out.println();
        System.out.println(book);

        fromArchivedStatusMove.moveToStatus(book, Status.STATUS_AVAILABLE);
        System.out.println();
        System.out.println(book);
    }
}
