package ru.idcore.basejava.task0211;

import java.util.ArrayList;
import java.util.Scanner;

//Класс - Продуктовая корзина
public class ProductBasket {
    //ArrayList<Purchase> purchases;
    //ProductRage productRage;
    int[] productCount; //индексы массива соответствуют кодам продукта из каталога. В массиве храним количество по каждому виду продукта

    public ProductBasket(ProductRage productRage) {
        //this.productRage = productRage;
        //this.purchases = new ArrayList<>();
        this.productCount = new int[productRage.products.length];
    }
//
//
//
//
//    //проверка наличия продукта в корзине
//    public boolean isProductInBasket(Product product) {
//        boolean result = false;
//
//        for (Purchase purchase : purchases
//        ) {
//            if (purchase.product.equals(product)) {
//                result = true;
//                break;
//            }
//        }
//        return result;
//    }
//
//    //увеличить количество продуктов в корзине
//    public void increaseProductInBasket(Product product, int count) {
//        for (Purchase purchase: purchases
//             ) {
//            if (purchase.product.equals(product)) {
//                purchase.count += count;
//                purchase.totalPrice = purchase.count * purchase.product.price;
//                break;
//            }
//        }
//    }


    //Добавление продукта в корзину
    public void addProductToBasket(ProductRage productRage, int productCode, int count) {
//        String[] choose;
//        choose = chooseProduct(userChoose);
//
//        if (isProductInBasket(productRage.products[Integer.parseInt(choose[0]) - 1])) {
//            increaseProductInBasket(
//                    productRage.products[Integer.parseInt(choose[0]) - 1],
//                    Integer.parseInt(choose[1]));
//        } else {
//            purchases.add(new Purchase(
//                    productRage.products[Integer.parseInt(choose[0]) - 1],
//                    Integer.parseInt(choose[1])));
//        }
        //увеличиваем количество продуктов соответсвующего вида
        productCount[productCode - 1] += count;
    }


    //Стоимость корзины
    public int[] totalBasketPrice(ProductRage productRage) {
        int[] total = new int[2];//[0] - количество; [1] - цена
//        int totalCount = 0;
//        int totalPrice = 0;
//        for (Purchase purchase : purchases) {
//            total[0] += purchase.count;
//            total[1] += purchase.totalPrice;
//        }
        for (int i = 0; i < productCount.length; i++) {
            if (productCount[i] != 0) {
                total[0] += 1;
                total[1] = total[1] + productRage.products[i].price * productCount[i];
            }
        }

        return total;
    }

//    public String toString() {
//        String result;
//
//        result = "Ваша корзина: " + totalBasketPrice()[0] + " продуктов на сумму " + totalBasketPrice()[1] + " рублей";
//        return result;
//    }

    public void printBasket(ProductRage productRage) {
        String pattern = "%-5s %-22s %-15s %-15s %-15s%n";
        System.out.println("Ваша корзина: ");
        System.out.printf(pattern, "Код", "Наименование", "Количество", "Цена/за ед.", "Общая стоимость");

//        for (Purchase purchase : purchases) {
//            System.out.printf(
//                    pattern,
//                    purchase.product.name,
//                    purchase.count,
//                    purchase.product.price,
//                    purchase.totalPrice);
//        }
        for (int i = 0; i < productCount.length; i++) {
            if (productCount[i] != 0) {
                System.out.printf(
                        pattern,
                        i+1,
                        productRage.products[i].name,
                        this.productCount[i],
                        productRage.products[i].price,
                        productRage.products[i].price * this.productCount[i]);
            }
        }
        System.out.printf(pattern, "", "", "", "Итого: ", totalBasketPrice(productRage)[1]);
    }
}
