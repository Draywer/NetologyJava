package ru.idcore.basejava.task0212;

import ru.idcore.basejava.task0161.Rating;
import ru.idcore.basejava.task0211.Measure;
import ru.idcore.basejava.task0211.Product;
import ru.idcore.basejava.task0211.ProductRage;

public class Main {
    public static void main(String[] args) {
        ProductRage productRage = new ProductRage();

        productRage.products = new Product[]{
                new Product("Хлеб", 56, Measure.MEASURE_THING, "Нет данных", Rating.RATING_5),
                new Product("Молоко", 55, Measure.MEASURE_L, "Нет данных", Rating.RATING_5),
                new Product("Яйца", 97, Measure.MEASURE_10, "Нет данных", Rating.RATING_4),
                new Product("Сыр", 49, Measure.MEASURE_G, "Нет данных", Rating.RATING_3),
                new Product("Колбаса", 44, Measure.MEASURE_G, "Нет данных", Rating.RATING_4),
                new Product("Масло сливочние", 140, Measure.MEASURE_THING, "Нет данных", Rating.RATING_5),
                new Product("Сметана", 70, Measure.MEASURE_THING, "Нет данных", Rating.RATING_4),
                new Product("Картофель", 29, Measure.MEASURE_KG, "Нет данных", Rating.RATING_3),
                new Product("Помидоры", 95, Measure.MEASURE_KG, "Нет данных", Rating.RATING_5),
                new Product("Огурцы", 82, Measure.MEASURE_THING, "Нет данных", Rating.RATING_5)
        };

        //System.out.println(productRage);
        ProductRage productRage1 = new ProductRage();
        productRage1.products = productRage.sortMergeByPrice(productRage.products);

        System.out.println("Было: ");
        productRage.printRange();

        System.out.println("\n");
        System.out.println("Стало: ");
        productRage1.printRange();
    }
}
