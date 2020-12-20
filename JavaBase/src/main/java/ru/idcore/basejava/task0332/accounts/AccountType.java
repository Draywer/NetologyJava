package ru.idcore.basejava.task0332.accounts;

public enum AccountType {
    ACCOUNT_TYPE_CREDIT_ACCOUNT("Кредитный счет"),
    ACCOUNT_TYPE_CHECKING_ACCOUNT("Расчетный счет"),
    ACCOUNT_TYPE_SAVINGS_ACCOUNT("Сберегательный счет");

    private String title;

    AccountType(String title) {
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
