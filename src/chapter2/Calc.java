package chapter2;

import java.util.Scanner;

//        Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
//        Для генерации случайного числа используйте метод Math.random(),
//        который возвращает значение в промежутке [0, 1].
public class Calc {
    public static void main(String[] args) {
        float min, avg, max, sr;
        avg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        int num = sc.nextInt();
        float[] array = new float[num];

        for (int i = 0; i < array.length; i++)
            array[i] = (float) Math.random();

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    float tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);


        for (int i = 0; i < array.length; i++)
            avg += array[i] / array.length;

        min = array[0];
        max = array[num - 1];

        System.out.println("Минимальное число в массиве - " + min);
        System.out.println("Среднее значение чисел в массиве - " + avg);
        System.out.println("Максимальное число в массиве - " + max);

    }
}
