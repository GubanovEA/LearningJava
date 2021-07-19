package chapter2;

public class Calc {
    public static void main(String[] args) {
            double min, avr, max;
            double[] array = new double[9];
            for (int i = 0; i < array.length; i++)
                array[i] = Math.random();
            for (int i = array.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        double tmp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tmp;
                    }
                }
            }
            for (int i = 0; i < array.length; i++)
                System.out.println(array[i]);
            min = array[0];
            avr = array[5];
            max = array[8];
            System.out.println("Минимальное число в массиве - " + min);
            System.out.println("Минимальное число в массиве - " + avr);
            System.out.println("Минимальное число в массиве - " + max);

            }
    }
