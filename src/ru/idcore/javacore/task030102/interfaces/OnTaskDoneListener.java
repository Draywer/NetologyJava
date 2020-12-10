package ru.idcore.javacore.task030102.interfaces;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
