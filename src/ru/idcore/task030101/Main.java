package ru.idcore.task030101;

public class Main {
    public static void main(String[] args) throws ArithmeticException {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(2, 4);
        int b1 = calc.minus.apply(3, 3);
        int c = calc.devide.apply(a, b);
        int d = calc.multiply.apply(a, b);
        int e = calc.pow.apply(b);
        int f = calc.abs.apply(b1);


        calc.println.accept(f);
        System.out.println("isPositive = " + calc.isPositive.test(b));
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }

}
