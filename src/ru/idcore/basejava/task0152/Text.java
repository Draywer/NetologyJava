package ru.idcore.basejava.task0152;

public class Text {
    public static String trimString(String s) {
        String s1;

        s1 = s.trim();
        return s1;
    }

    public static String extraTrimString(String s) {
        String s1;

        s1 = s.replaceAll("\\s+", " ");
        return s1;
    }
}
