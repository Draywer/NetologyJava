package ru.idcore.basejava.task0443.transport;

import java.util.Objects;

/**
 * Класс - Транспорт
 */
public abstract class Transport {
    protected final String number;
    protected String model;
    protected String color;
    protected String type;


    public Transport(String type, String model, String number, String color) {
        this.type = type;
        this.model =model;
        this.number = number;
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return getNumber().equals(transport.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }
}
