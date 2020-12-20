package ru.idcore.basejava.task0161;

public class Country {
    public static int countryCount;//количество стран

    public String name;

    public Country(String name) {
        this.name = name;
        countryCount++;
    }

    public String toString() {
        String s;

        s = "Страна: " + this.name;
        return  s;
    }

    public boolean equals(Object o) {
        Country country;
        if (o.getClass().equals(Country.class)) {
            country = (Country) o;
            return this.name.equals(country.name);
        } else return false;
    }
}
