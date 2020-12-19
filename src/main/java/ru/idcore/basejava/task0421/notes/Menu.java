package ru.idcore.basejava.task0421.notes;

public enum Menu {
    MENU_ADD(1,"Добавить"),
    MENU_DELETE(3,"Удалить"),
    MENU_PRINT_ALL(2,"Вывести список задач"),
    MENU_EXIT(0,"Выход");

    private int key;
    private String title;

    Menu(int key, String title) {
        this.key = key;
        this.title = title;
    }

    public int getKey() {
        return key;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "key=" + key +
                ", title='" + title + '\'' +
                '}';
    }
}


