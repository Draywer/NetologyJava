package ru.idcore.basejava.task0441.phonebook;

import java.util.Objects;

/**
 * Класс - Контакт
 */
public class Contact implements Comparable<Contact> {
    protected final String name;
    protected final String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "\nИмя: " + name +
                "\nТелефон: " + phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return name.equals(contact.name) &&
                phone.equals(contact.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }

    @Override
    public int compareTo(Contact contact) {
        return name.compareTo(contact.getName());
    }
}
