package org.example.Tasks.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//Дан массив целых чисел и ещё одно целое число.
// Удалите все вхождения этого числа из массива (пропусков быть не должно).
public class Fourth {
    public static void main(String[] args) {

        int number = 11;
        int[] allNumbers = new int[100];
        ArrayList<Integer> result = new ArrayList<>();

        Random random = new Random();
        int min = 1;
        int max = 20;

        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = min + random.nextInt(max - min + 1);
        }

        System.out.println(Arrays.toString(allNumbers));

        for (int j = 0; j < allNumbers.length; j++) {
            if (allNumbers[j] != number) {
                result.add(allNumbers[j]);
            }
        }

        int[] numbers = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            numbers[i] = result.get(i);
        }

        System.out.println(Arrays.toString(numbers));
    }
}
