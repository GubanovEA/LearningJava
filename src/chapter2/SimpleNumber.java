package chapter2;

import java.util.Scanner;
import java.util.ArrayList;

public class SimpleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        int num = sc.nextInt();
        int[] array = new int[num];
        int value = 2;

        for(int i = 0; i < array.length; i++) {
            array[i] = value;
            value = value + 1;
        }

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

        ArrayList simpNumb = new ArrayList();
        int div = 0;

        for (int i = 0; i < num; i++){
            for (int j = 0; i < i; j++) {
                if (array[i] % array[j] == 0) {
                    div = div + 1;
                }
            }
            if (div == 0) {
                simpNumb.add(array[i]);
            }
            else {
                div = 0;
        }
        }
        System.out.println(simpNumb);
    }
}
