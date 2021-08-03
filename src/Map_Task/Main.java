package Map_Task;

import java.awt.geom.Area;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arrayStr = in.nextLine().split(" ");
        Integer[] numbArray = new Integer[arrayStr.length];
        for (int i = 0; i < numbArray.length; i++) {
            numbArray[i] = Integer.parseInt(arrayStr[i]);
        }

        RepeatingNumbers repeatingNumbers = new RepeatingNumbers();
        repeatingNumbers.checkRepeatingNumbers(numbArray);
    }
}
