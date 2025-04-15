package org.example.Tasks.Arrays;

import java.sql.Array;
import java.util.Arrays;

//Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
public class First {
    public static void main(String[] args) {
        int n = 500;
        double[] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
        }

        double max = numbers[0];
        double min = numbers[0];
        double avg = 0;

//        double [] sortedNumbers = Arrays.stream(numbers).sorted().toArray();
//
//        System.out.println(sortedNumbers[0]);
//        System.out.println(sortedNumbers[sortedNumbers.length - 1]);
//        System.out.println(sortedNumbers[(sortedNumbers.length - 1) / 2]);

        for (int i = 0; i < numbers.length; i++) {

            //проверяем, является ли текущее значение массива (numbers[i]) больше текущего максимального значения (max).
            if (max < numbers[i])
                max = numbers[i];
            //проверяем, является ли текущее значение массива (numbers[i]) меньше текущего минимального значения (min)
            if (min > numbers[i])
                min = numbers[i];

            avg += numbers[i] / numbers.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
//        for (int i = 0; i < sortedNumbers.length; i++) {
//            System.out.println(sortedNumbers[i]);
//        }
    }
}
