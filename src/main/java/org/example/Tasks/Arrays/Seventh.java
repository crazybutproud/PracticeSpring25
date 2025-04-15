package org.example.Tasks.Arrays;

import java.util.Arrays;
import java.util.Random;

//Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
// Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
public class Seventh {
    public static void main(String[] args) {
        int n = 12;
        int[] numbers = new int[n];

        Random random = new Random();
        int min = -15;
        int max = 15;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = min + random.nextInt(max - min + 1);
        }

        System.out.println("Массив: " + Arrays.toString(numbers));

        int[] notSortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(numbers);
        int maxNumber = numbers[numbers.length - 1];

        int lastIndex = -1;
        for (int i = notSortedNumbers.length - 1; i >= 0; i--) {
            if (notSortedNumbers[i] == maxNumber) {
                lastIndex = i;
                break;
            }
        }
        System.out.println("Максимальный элемент под индексом - " + lastIndex + " равен " + maxNumber);
    }
}
