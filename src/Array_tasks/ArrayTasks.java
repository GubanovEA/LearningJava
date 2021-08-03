package Array_tasks;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayTasks {

    public static Integer[] createArray() {

        Scanner in = new Scanner(System.in);
        String[] arrayStr = in.nextLine().split(" ");
        Integer[] arrayNumb = new Integer[arrayStr.length];
        for (int i = 0; i < arrayNumb.length; i++) {
            arrayNumb[i] = Integer.parseInt(arrayStr[i]);
        }
        return arrayNumb;
    }

    public static void showArray(Integer[] array){
        for (Integer el: array){
            System.out.print(el + " ");
        }
        System.out.println(" ");
    }

    public static Integer[] sortArray(Integer[] array){
        Arrays.sort(array);
        return array;
    }

    public static Integer[] sumArrays(Integer[] array1, Integer[] array2){
        Integer[] resultArray = new Integer[array1.length + array2.length];
        System.arraycopy(array1, 0, resultArray, 0, array1.length);
        System.arraycopy(array2, 0, resultArray, array1.length, array2.length);
        return resultArray;
    }

    public static Integer[] generateRandomArray(int number){
        Integer[] arrayNumb = new Integer[number];
        for (int i = 0; i < number; i++ ){
            arrayNumb[i] = (int)((float) Math.random() * (100 + 100) - 100);
        }
        return arrayNumb;
    }
}
