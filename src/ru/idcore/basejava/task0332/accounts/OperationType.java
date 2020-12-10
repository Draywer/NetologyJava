package ru.idcore.basejava.task0332.accounts;

public enum OperationType {
    OPERATION_TYPE_PAY("Оплата со счета"),
    OPERATION_TYPE_TRANSFER("Перевод между счетами"),
    OPERATION_TYPE_ADD_MONEY("Пополнение счета");

    private String title;

    OperationType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
