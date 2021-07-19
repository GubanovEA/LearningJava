package chapter2;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        float min, avg, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        int num = sc.nextInt();
        float[] array = new float[num];

        for (int i = 0; i < array.length; i++)
            array[i] = (float) Math.random();



        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

        min = array[0];
        avg += array[num]/array.length;
        max = array[8];
        System.out.println("Минимальное число в массиве - " + min);
        System.out.println("Минимальное число в массиве - " + avg);
        System.out.println("Минимальное число в массиве - " + max);

    }

    public float[] sortingArr(Float[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    float tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}