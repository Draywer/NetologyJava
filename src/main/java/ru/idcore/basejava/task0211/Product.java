package ru.idcore.basejava.task0211;

import ru.idcore.basejava.task0161.Rating;

/*Класс - Продукт*/
public class Product {
    public String name;
    public int price;
    public Measure measure;
    public Rating rating;
    public String description;

    public Product(String name, int price, Measure measure, String description ) {
        this.name = name;
        this.price = price;
        this.measure = measure;
        this.description = description;
        this.rating = Rating.RATING_1;
    }

    public Product(String name, int price, Measure measure, String description, Rating rating) {
        this(name, price, measure, description);
        this.rating = rating;
    }

    public boolean equals(Object o) {
        boolean result = false;
        Product product;
        if (o.getClass().equals(Product.class)) {
            product = (Product) o;
            result = this.name.equals(product.name) && this.price == product.price;
        }
        return result;
    }

    public String toString() {
        String result;

        result = this.name + "\t\t" + this.price + "\t\t" + this.measure + "\t\t" + this.rating;
        return result;
    }
}
