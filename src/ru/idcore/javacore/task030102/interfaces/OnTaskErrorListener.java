package ru.idcore.javacore.task030102.interfaces;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
