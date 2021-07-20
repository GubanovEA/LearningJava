package chapter2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//Дан массив целых чисел и ещё одно целое число.
//        Удалите все вхождения этого числа из массива (пропусков быть не должно).


public class RemoveEl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();

        List<Integer> SubArray2 = new ArrayList<>();

        System.out.println("Insert array elements:");


        for (int i = 0; i < size; i++) {
            SubArray2.add(input.nextInt());
        }

        System.out.print("Inserted array elements:");
        System.out.println(SubArray2);

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Remove Element: ");
        int RemEl = input1.nextInt();

        int range = SubArray2.size();

        for (int i = 0; i < (range - 1); i++) { // работает не совсем правильно, у меня есть предположения, ноя  хз
            if (SubArray2.get(i) == RemEl)
                SubArray2.remove(i);
        }

        System.out.print("Result massiv:");
        System.out.println(SubArray2);
    }
}
