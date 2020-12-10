package ru.idcore.basejava.task0311;

public class FromBookedStatusMove extends BookMover {
    public FromBookedStatusMove() {
        super();
    }

    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.STATUS_BOOKED)) {
            if (requestedStatus == Status.STATUS_AVAILABLE) {
                book.setStatus(Status.STATUS_AVAILABLE);
            } else {
                System.out.println("\nПеревод книги: \n" + book + "\nиз статуса: " + book.getStatus() + " в статус: " + requestedStatus + " - невозможен.");
            }
        }
    }
}
