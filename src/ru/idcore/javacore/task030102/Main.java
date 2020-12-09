package ru.idcore.javacore.task030102;

import ru.idcore.javacore.task030102.interfaces.OnTaskDoneListener;
import ru.idcore.javacore.task030102.interfaces.OnTaskErrorListener;
import ru.idcore.javacore.task030102.workers.Worker;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;


        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}
