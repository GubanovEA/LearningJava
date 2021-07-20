package chapter2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class RemoveEl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size

        List<Integer> SubArray2 = new ArrayList<>(); // Создаём массив int размером в size

        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/

        for (int i = 0; i < size; i++) {
            SubArray2.add(input.nextInt()); // Заполняем массив элементами, введёнными с клавиатуры
        }

        System.out.print("Inserted array elements:");
        System.out.println(SubArray2);

        Scanner input1 = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter Remove Element: ");
        int RemEl = input1.nextInt(); // Читаем с клавиатуры размер массива и записываем в size

        int range = SubArray2.size();

        for (int i = 0; i < (range - 1); i++) {
            if (SubArray2.get(i) == RemEl)
                SubArray2.remove(i);
        }

        System.out.print("Result massiv:");
        System.out.println(SubArray2);
    }
}
