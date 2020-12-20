package ru.idcore.basejava.task0211;

import ru.idcore.basejava.task0161.Rating;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        ProductBasket productBasket;
        Scanner scanner = new Scanner(System.in);
        //Формируем ассортимент продуктов
        ProductRage productRage = new ProductRage();
        String[] userChoose;

        productRage.products = new Product[]{
                new Product("Хлеб", 54, Measure.MEASURE_THING, "Нет данных", Rating.RATING_5),
                new Product("Молоко", 55, Measure.MEASURE_L, "Нет данных",Rating.RATING_5),
                new Product("Яйца", 97, Measure.MEASURE_10, "Нет данных",Rating.RATING_4),
                new Product("Сыр", 49, Measure.MEASURE_G, "Нет данных",Rating.RATING_3),
                new Product("Колбаса", 44, Measure.MEASURE_G, "Нет данных",Rating.RATING_4),
                new Product("Масло сливочние", 140, Measure.MEASURE_THING, "Нет данных",Rating.RATING_5),
                new Product("Сметана", 70, Measure.MEASURE_THING, "Нет данных",Rating.RATING_4),
                new Product("Картофель", 29, Measure.MEASURE_KG, "Нет данных",Rating.RATING_3),
                new Product("Помидоры", 95, Measure.MEASURE_KG, "Нет данных",Rating.RATING_5),
                new Product("Огурцы", 82, Measure.MEASURE_THING, "Нет данных",Rating.RATING_5)
        };

       //Вывод ассортимента продуктов
        productRage.printRange();

        //Формируем продуктовую корзину
        productBasket = new ProductBasket(productRage);

        //Набираем продукты в корзину
        while (true) {
            System.out.println();
            System.out.println("Введите код продукта из ассортимента и количестово или end для завершения");
            System.out.println("Пример ввода (код количество): \"1 10\"");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                userChoose = Service.chooseProduct(input);
                productBasket.addProductToBasket(productRage, Integer.parseInt(userChoose[0]), Integer.parseInt(userChoose[1]));
            }
        }

        if (productBasket.totalBasketPrice(productRage)[1] == 0) {
            System.out.println("Ваша корзина пустая. Вы не добавили ни олного продукта");
        } else {
            productBasket.printBasket(productRage);
        }
    }
}
