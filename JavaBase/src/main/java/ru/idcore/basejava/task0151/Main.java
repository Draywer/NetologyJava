package ru.idcore.basejava.task0151;

public class Main {
    public static void main(String[] args) {
        Task.printTaskInfo();
        Task task = new Task();
        if (!task.isNegative()) {
            System.out.println("Ошибка! Дата окончания выполнения задачи должна быть больше или ровна дате начала выполнения задачи");
        } else {
            System.out.println(task);
        }
    }
}
