package ru.idcore.basejava.task0161;

public enum BookFormat {
    BF_TXT("TXT"),
    BF_PDF("PDF"),
    BF_EPUB("EPUB"),
    BF_FB2("FB2"),
    BF_MOBI("MOBI");

    public String format;

    BookFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public String toString() {
        return this.getFormat();
    }
}
