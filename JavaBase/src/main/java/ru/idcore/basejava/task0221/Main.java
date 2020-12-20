package ru.idcore.basejava.task0221;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("Введите через пробел размер матрицы (m x n) в формате \"m n\" или \"end\" для завершения");
        input = scanner.nextLine();

        while (true) {
            if (!input.equals("end")) {
                String[] strings = input.split(" ");
                Matrix matrix = new Matrix(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]));

                //заполняем матрицу случайными числами
                matrix.fillRandomInt(-10, 10);
                matrix.printMatrix();

                while (true) {
                    System.out.println("Для поворота матрицы по (против) часовой стрелке введите угол поворота кратный 90 градусам: \"90/180/...\" или \"(-90/-180/...)\" или \"end\" для выхода:");
                    input = scanner.nextLine();
                    if (!input.equals("end") && Math.abs(Integer.parseInt(input)) % 90 == 0) {

                        if (Integer.parseInt(input) > 0) {
                            for (int i = 0; i < Math.abs(Integer.parseInt(input)) / 90; i++) {
                                //вращаем по часовой стрелке
                                matrix.ints = matrix.clockWiseRotation();
                            }
                            matrix.printMatrix();
                        } else if (Integer.parseInt(input) < 0) {
                            for (int i = 0; i < Math.abs(Integer.parseInt(input)) / 90; i++) {
                                //вращаем против часовой стрелки
                                matrix.ints = matrix.counterClockwiseRotation();
                            }
                            matrix.printMatrix();
                        }
                    } else if (input.equals("end")) {
                        break;
                    }
                }
            } else break;
        }
    }
}
