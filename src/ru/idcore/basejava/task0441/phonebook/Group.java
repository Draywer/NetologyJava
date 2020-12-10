package ru.idcore.basejava.task0441.phonebook;

import java.util.Objects;

/**
 * Класс - Группа контактов
 */
public class Group implements Comparable<Group> {
    private final String name;

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Группа: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return getName().equals(group.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public int compareTo(Group group) {
        return name.compareTo(group.getName());
    }
}
