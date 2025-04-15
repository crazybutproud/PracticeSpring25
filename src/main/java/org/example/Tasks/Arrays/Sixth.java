package org.example.Tasks.Arrays;

import java.util.Arrays;
import java.util.Random;

//Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
// Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
public class Sixth {
    public static void main(String[] args) {
        int n = 15;
        int[] numbers = new int[n];

        Random random = new Random();
        int min = 0;
        int max = 9;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = min + random.nextInt(max - min + 1);
        }

        System.out.println("Массив: " + Arrays.toString(numbers));

        int count = 0;
        for (int num: numbers) {
            if (num % 2 == 0 && num != 0) {
                count++;
            }
        }

        System.out.println("Четных элементов: " + count);
    }
}
