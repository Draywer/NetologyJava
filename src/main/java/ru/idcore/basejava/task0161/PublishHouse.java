package ru.idcore.basejava.task0161;

public class PublishHouse {
    public static int publishHouseCount;//количество издательских домов

    public String name;//название
    public Rating rating;//рейтинг
    public Country country;
    public String address;
    public String webSite;

    public PublishHouse(String name, String webSite) {
        this.name = name;
        this.webSite = webSite;
        this.address = "no_address";
        this.rating = Rating.RATING_1;
        publishHouseCount++;
    }

    public PublishHouse(String name, String webSite, Country country, String address) {
        this(name, webSite);
        this.country = country;
        this.address = address;
    }

    public PublishHouse(String name, String webSite, Country country, String address, Rating rating) {
        this(name, webSite, country, address);
        this.rating = rating;
    }

    public String toString() {
        String s;

        s = "Идательство: " + this.name + "\nСтрана: " + country.name + "\nАдрес: " + this.address + "\nWeb-сайт: " + webSite;
        return s;
    }

    public boolean equals(Object o) {
        PublishHouse house;
        if(o.getClass().equals(PublishHouse.class)) {
            house = (PublishHouse) o;
            return this.name.equals(house.name);
        } else return false;
    }
}
