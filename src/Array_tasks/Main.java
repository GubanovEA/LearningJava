package Array_tasks;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Integer[] arrayOfNumb1 = ArrayTasks.generateRandomArray(10);
        Integer[] arrayOfNumb2 = ArrayTasks.createArray();

//        ArrayTasks.sortArray(arrayOfNumb);
        ArrayTasks.showArray(arrayOfNumb1);
        ArrayTasks.showArray(arrayOfNumb2);
        Integer[] resultArray = ArrayTasks.sumArrays(arrayOfNumb1, arrayOfNumb2);
        ArrayTasks.showArray(resultArray);

    }
}
