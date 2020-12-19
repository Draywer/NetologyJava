package ru.idcore.basejava.task0161;

public class BookSubType {
    public static int bookSubTypeCount; //количество подтипов жанров книг

    public String name;
    public BookType bookType;


    public BookSubType(String name, BookType bookType) {
        this.name = name;
        this.bookType = bookType;
        bookSubTypeCount++;
    }

    public String toString() {
        String s;

        s = bookType + " \\ " + this.name;
        return s;
    }

    public boolean equals(Object o) {
        BookSubType subType;

        if(o.getClass().equals(BookSubType.class)) {
            subType = (BookSubType) o;
            return this.name.equals(subType.name);
        }else return false;
    }
}
