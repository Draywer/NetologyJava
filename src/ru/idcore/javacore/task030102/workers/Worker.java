package ru.idcore.javacore.task030102.workers;

import ru.idcore.javacore.task030102.interfaces.OnTaskDoneListener;
import ru.idcore.javacore.task030102.interfaces.OnTaskErrorListener;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i + 1 == 33) {
                errorCallback.onError("Task " + (i + 1) +" is missed");
            }
            callback.onDone("Task " + (i + 1) +" is done");
        }
    }
}
