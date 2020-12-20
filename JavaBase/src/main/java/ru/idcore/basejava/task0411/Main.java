package ru.idcore.basejava.task0411;

public class Main {
    public static void main(String[] args) {
        // параметризируем класс типом String
        Box<String> sample1 = new Box<>("Нетология");
        System.out.println(sample1);
        // параметризируем класс типом Integer
        /*Ошибка компиляции. Объявлена переменная sample2 как объект параметризованного класса Box с параметром <String>
        при инициализации переменной вызывается конструктор, в который передается числовое значение. java ожидает(контролирует)
        передачу строки.
        В зависимости от постановки задачи (необходимости) может быть два решения:
         1. в качестве параметрв передать строку - "1"
         2. объявить переменную как объект параметризованного класса Box c параметром <Integer>*/
        //Box<Integer> sample2 = new Box<>(1);
        Box<String> sample2 = new Box<>("1");
        System.out.println(sample2);
        // параметризируем класс типом Boolean
        Box<Boolean> sample3 = new Box<>(Boolean.TRUE);
        System.out.println(sample3);

    }
}
