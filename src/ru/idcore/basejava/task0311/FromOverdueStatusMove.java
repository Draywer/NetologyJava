package ru.idcore.basejava.task0311;

public class FromOverdueStatusMove extends BookMover {

    public FromOverdueStatusMove() {
        super();
    }

    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.STATUS_OVERDUE)) {
            switch (requestedStatus) {
                case STATUS_AVAILABLE:
                    book.setStatus(Status.STATUS_AVAILABLE);
                    break;
                case STATUS_ARCHIVED:
                    book.setStatus(Status.STATUS_ARCHIVED);
                    break;
                default:
                    System.out.println("\nПеревод книги: \n" + book + "\nиз статуса: " + book.getStatus() + " в статус: " + requestedStatus + " - невозможен.");
                    break;
            }
        }
    }
}
