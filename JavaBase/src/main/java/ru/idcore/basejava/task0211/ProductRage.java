package ru.idcore.basejava.task0211;

import static java.lang.System.arraycopy;

//Класс - Ассортимент товаров
public class ProductRage {
    public Product[] products;


    public String toString() {
        String result;

        result = "Количестов товаров в ассортименте: " + this.products.length;
        return result;
    }

    //выбор продукта из каталога
    public Product getProduct(int productCode) {
        return products[productCode -1];
    }

    public void printRange() {
        String pattern = "%-5s %-22s %-15s %-15s %-15s %-15s%n";
        System.out.println("Товары в ассортименте: ");
        System.out.printf(pattern, "Код", "Наименование", "Единица", "Цена/за ед.", "Описание", "Рейтинг");
        for (int i = 0; i < this.products.length; i++) {
            System.out.printf(
                    pattern,
                    i + 1 + ".",
                    this.products[i].name,
                    this.products[i].measure,
                    this.products[i].price,
                    this.products[i].description,
                    this.products[i].rating
            );

        }
    }

    //сортировка массива продуктов по возрастанию цены
    public Product[] sortMergeByPrice(Product[] products) {
        //Создаем массив отсортированных продуктов по цене
        Product[] sortedProducts;
        Product[] arrayA;
        Product[] arrayB;
        int middle = products.length / 2; //середина массива

        if (products.length < 2) {
            return products;
        }

        arrayA = new Product[middle];
        arrayB = new Product[products.length - middle];

        arraycopy(products, 0, arrayA, 0, middle);
        arraycopy(products, middle, arrayB, 0, products.length - middle);

        arrayA = sortMergeByPrice(arrayA);
        arrayB = sortMergeByPrice(arrayB);

        sortedProducts = merge(arrayA, arrayB);

        return sortedProducts;
    }

//    public static int i = 0;//a[i]
//    public static int j = 0;//b[j]
//    public static int k = 0;//c[k]
//
//    public static int[] MergeArray(int[] a, int[] b) {
//        int[] c = new int[a.length + b.length];//устанавливаем длину результирующего массива
//
//
//        while (i < a.length && j < b.length) {
//            //записывем в результирующий поток меньшее из значений
//            c[k++] = a[i] < b[j] ? a[i++] : b[j++];
//        }
//        //копируем осташуюся часть массива
//        if (i<a.length){
//            arraycopy(a,i, c, k, a.length -i);
//        }else if (j<b.length){
//            arraycopy(b,j, c, k, b.length -j);
//        }
//
//
//        return c;
//    }
//

    public Product[] merge(Product[] arrayA, Product[] arrayB) {
        int i = 0;//arrayA[i]
        int j = 0;//arrayB[j]
        int k = 0;//arrayC[k]

        Product[] arrayC = new Product[arrayA.length + arrayB.length];

        while (i < arrayA.length && j < arrayB.length) {
            //записыаем в результирующий поток продукт с меньшей ценой
            arrayC[k++] = (arrayA[i].price < arrayB[j].price) ? arrayA[i++] : arrayB[j++];
        }

        //копируем оставшуюся часть массива
        if (i < arrayA.length) {
            arraycopy(arrayA, i, arrayC, k, arrayA.length - i);
        } else if (j < arrayB.length) {
            arraycopy(arrayB, j, arrayC, k, arrayB.length - j);
        }

        return arrayC;
    }


    public Product[] copyProducts(Product[] products, int p, int n) {
        Product[] newProducts = new Product[n];

        System.arraycopy(products, p, newProducts, 0, n);
        return newProducts;
    }


}
