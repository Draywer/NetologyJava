package ru.idcore.basejava.task0311;

public class FromBorrowedStatusMove extends BookMover {

    public FromBorrowedStatusMove() {
        super();
    }

    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.STATUS_BORROWED)) {
            switch (requestedStatus) {
                case STATUS_AVAILABLE:
                    book.setStatus(Status.STATUS_AVAILABLE);
                    break;
                case STATUS_ARCHIVED:
                    book.setStatus(Status.STATUS_ARCHIVED);
                    break;
                case STATUS_OVERDUE:
                    book.setStatus(Status.STATUS_OVERDUE);
                    break;
                default:
                    System.out.println("\nПеревод книги: \n" + book + "\nиз статуса: " + book.getStatus() + " в статус: " + requestedStatus + " - невозможен.");
                    break;
            }
        }
    }
}
