package ru.idcore.basejava.task0342.events;

import ru.idcore.basejava.task0342.exceptions.NotCorrectEventData;

public abstract class Event {
    protected String title;
    protected int releaseYear;
    protected int age;

    public Event(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getAge() {
        return age;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nНазвание события: " + title +
                "\nГод: " + releaseYear +
                "\nОграничение по возрасту: " + age;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Event event = (Event) object;
        return title.equals(event.title) && releaseYear == event.releaseYear && age == event.age;
    }

    public boolean NotCorrectEvent() {
        return title == null || releaseYear == 0 || age == 0;
    }

    public abstract void validatesEvent() throws NotCorrectEventData;


}
