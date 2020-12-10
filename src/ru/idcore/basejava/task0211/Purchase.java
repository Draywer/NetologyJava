package ru.idcore.basejava.task0211;

//Класс - Покупка
public class Purchase {
    Product product;
    int count;
    int totalPrice;



    public Purchase(Product product, int count) {
        this.product = product;
        this.count = count;
        this.totalPrice = this.product.price * this.count;
    }

    public String toString() {
        String result;

        result = this.product.name + " " + this.product.price + " x " + this.count + " = " + this.totalPrice;
        return result;
    }

    public boolean equals(Object o) {
        boolean result = false;
        Purchase purchase;

        if (o.getClass().equals(Purchase.class)) {
            purchase = (Purchase) o;
            result = (this.product.name.equals(purchase.product.name) && this.product.price == purchase.product.price);
        }
        return result;
    }
}
