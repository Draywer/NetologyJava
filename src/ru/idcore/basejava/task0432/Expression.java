package ru.idcore.basejava.task0432;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Expression {
    private String stringExpression;
    private Queue<Integer> numbers;
    private Stack<String> signs;

    public Expression(String stringExpression) throws Exception {
        this.stringExpression = stringExpression;
        numbers = new ArrayDeque<>();
        signs = new Stack<>();
        transformExpression();
    }

    public String getStringExpression() {
        return stringExpression;
    }

    private String[] splitExpression() {
        return stringExpression.split(" ");
    }

    private void transformExpression() throws Exception {
        String[] splitExpression = splitExpression();
        for (String s : splitExpression) {
            if (s.equals("+") ||
                    s.equals("-") ||
                    s.equals("*") ||
                    s.equals("/")) {

                signs.add(s);
            } else {
                try {
                    numbers.add(Integer.parseInt(s));
                } catch (Exception e) {
                    throw new Exception("Введено некорректное число: " + s);
                }
            }
        }
    }

    public void printNumbers() {
        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll() + " ");
        }
    }

    public void printSigns() {
        while (!signs.isEmpty()) {
            System.out.print(signs.pop() + " ");
        }
    }

    public void printTransformExpression() {
        System.out.println("\nИнфиксная запись выражения: " + stringExpression);
        System.out.print("\nПостфиксная запись выражения: ");
        printNumbers();
        printSigns();
        System.out.println("\n");
    }
}
