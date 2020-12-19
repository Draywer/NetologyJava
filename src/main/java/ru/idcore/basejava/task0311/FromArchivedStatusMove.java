package ru.idcore.basejava.task0311;

public class FromArchivedStatusMove extends BookMover {

    public FromArchivedStatusMove() {
        super();
    }

    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.STATUS_ARCHIVED)) {
            if (requestedStatus.equals(Status.STATUS_AVAILABLE)) {
                book.setStatus(Status.STATUS_AVAILABLE);
            } else {
                System.out.println("\nПеревод книги: \n" + book + "\nиз статуса: " + book.getStatus() + " в статус: " + requestedStatus + " - невозможен.");
            }

        }
    }
}
