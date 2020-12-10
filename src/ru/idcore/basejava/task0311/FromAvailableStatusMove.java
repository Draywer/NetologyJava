package ru.idcore.basejava.task0311;

public class FromAvailableStatusMove extends BookMover {

    public FromAvailableStatusMove() {
        super();
    }

    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.STATUS_AVAILABLE)) {
            switch (requestedStatus) {
                case STATUS_BORROWED:
                    book.setStatus(Status.STATUS_BORROWED);
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
