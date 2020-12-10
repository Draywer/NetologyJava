package ru.idcore.basejava.task0432;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите выражение в виде: 3 + 4 * 5 или end для завершения");
            String input = scanner.nextLine();
            if (!input.equals("end")) {
                Expression expression = new Expression(input);
                expression.printTransformExpression();
            } else {
                break;
            }
        }
    }
}
