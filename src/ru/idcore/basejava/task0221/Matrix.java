package ru.idcore.basejava.task0221;

public class Matrix {
    public int m;//размер матрицы
    public int n;//размер матрицы
    public int[][] ints;


    public Matrix(int m) {
        this.m = m;
        this.ints = new int[m][];
    }

    public Matrix(int m, int n) {
        this(m);
        this.n = n;
        this.ints = new int[m][n];
    }

    //генератор случайных чисел
    public int random(int a, int b) {
        return a + (int) (Math.random() * (b - a));
    }


    //заполнение матрицы случайными числами
    public void fillRandomInt(int a, int b) {
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                this.ints[i][j] = this.random(a, b);
            }
        }
    }

    //вывод матрицы
    public void printMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%5s" ,this.ints[i][j]);
            }
            System.out.println();
        }
    }

    //вращение против часовой стрелки
    public int[][] counterClockwiseRotation() {
        int temp = this.m;
        this.m = this.n;
        this.n = temp;

        int[][] intsRotated = new int[this.m][this.n];

        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                intsRotated[i][j] = this.ints[j][this.m - i -1];
            }
        }
        return intsRotated;
    }

    //вращение по часовой стрелке
    public int[][] clockWiseRotation() {
        int temp = this.m;
        this.m = this.n;
        this.n = temp;

        int[][] intsRotated = new int[this.m][this.n];

        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                intsRotated[i][j] = this.ints[this.n - j- 1][i];
            }
        }
        return intsRotated;
    }





}
