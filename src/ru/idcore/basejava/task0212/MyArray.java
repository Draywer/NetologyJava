package ru.idcore.basejava.task0212;

import java.util.Arrays;

import static java.lang.System.arraycopy;

public class MyArray {

    public static int i = 0;//a[i]
    public static int j = 0;//b[j]
    public static int k = 0;//c[k]

    public static int[] MergeArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];//устанавливаем длину результирующего массива


        while (i < a.length && j < b.length) {
            //записывем в результирующий поток меньшее из значений
            c[k++] = a[i] < b[j] ? a[i++] : b[j++];
        }
        //копируем осташуюся часть массива
        if (i<a.length){
            arraycopy(a,i, c, k, a.length -i);
        }else if (j<b.length){
            arraycopy(b,j, c, k, b.length -j);
        }


        return c;
    }
}
