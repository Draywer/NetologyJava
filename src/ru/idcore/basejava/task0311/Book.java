package ru.idcore.basejava.task0311;

public class Book {
    protected String author;
    protected String name;
    protected Status status;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
        this.status = Status.STATUS_UNAVAILABLE;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Автор: " + this.author + "\nНазвание: " + this.name + "\nСтатус: " + this.status;
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        Book book;
        if (o.getClass().equals(Book.class)) {
            book = (Book) o;
            if(this.author.equals(book.author) && this.name.equals(book.name)) {
                result = true;
            }
        }
        return result;
    }
}
