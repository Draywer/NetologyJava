package ru.idcore.basejava.task0311;

public class FromUnavailableStatusMove extends BookMover {

    public FromUnavailableStatusMove() {
        super();
    }

    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.STATUS_UNAVAILABLE)) {
            if (requestedStatus == Status.STATUS_BOOKED) {
                book.setStatus(Status.STATUS_BOOKED);
            } else {
                System.out.println("\nПеревод книги: \n" + book + "\nиз статуса: " + book.getStatus() + " в статус: " + requestedStatus + " - невозможен.");
            }
        }
    }
}
