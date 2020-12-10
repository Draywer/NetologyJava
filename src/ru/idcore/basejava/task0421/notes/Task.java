package ru.idcore.basejava.task0421.notes;

public class Task {
    protected String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Название задачи: " + name;
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) return true;
        if(object == null || getClass() != object.getClass()) return false;

        Task task = (Task) object;
        return this.name.equals(task.name);
    }
}
