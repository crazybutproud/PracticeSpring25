package org.example.Tasks.Arrays;

import java.util.Arrays;
import java.util.Random;

//Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом,
// чтобы отрицательных и положительных элементов там было поровну и не было нулей.
// При этом порядок следования элементов должен быть случаен (т. е. не подходит вариант, когда в массиве постоянно выпадает
// сначала 6 положительных, а потом 6 отрицательных чисел или же когда элементы постоянно чередуются через один и пр.).
// Вывести полученный массив на экран.
public class Nineth {
    public static void main(String[] args) {
        int n = 12;
        int[] numbers = new int[n];

        fillArray(numbers);

        System.out.println(Arrays.toString(numbers));

        // Подсчитываем количество положительных и отрицательных чисел
        int plus = 0;
        int minus = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                plus++;
            } else if (numbers[i] < 0) {
                minus++;
            }
        }

        System.out.println("Положительных - " + plus + ". Отрицательных - " + minus);
    }


    public static int generateRandomNumber() {
        Random random = new Random();

        int min = -10;
        int max = 10;

        int randomNumber;

        do {
            randomNumber = min + random.nextInt(max - min + 1);
        } while (randomNumber == 0);

        return randomNumber;
    }

    public static void fillArray(int[] numbers) {
        Random random = new Random();
        int plusCount = 0;
        int minusCount = 0;
        int i = 0;

        // Заполняем массив так, чтобы было ровно 6 положительных и 6 отрицательных чисел
        while (plusCount < 6 || minusCount < 6) {
            if (i >= numbers.length) {
                break; // Прерываем, если массив полностью заполнился
            }

            int number = generateRandomNumber();
            // Если мы еще не заполнили 6 положительных
            if (number > 0 && plusCount < 6) {
                numbers[i] = number;
                plusCount++;
                i++;
            }
            // Если мы еще не заполнили 6 отрицательных
            else if (number < 0 && minusCount < 6) {
                numbers[i] = number;
                minusCount++;
                i++;
            }
        }
    }
}


