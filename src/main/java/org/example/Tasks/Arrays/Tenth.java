package org.example.Tasks.Arrays;

import java.util.Arrays;
import java.util.Random;

//Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
// Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
// Если таких строк несколько, то вывести индекс первой встретившейся из них.
public class Tenth {
    public static void main(String[] args) {
        int x = 7;
        int y = 4;
        int[][] array = new int[x][y];


        //заполняем массив
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = generateRandomNumber();
            }
        }

//        System.out.println(Arrays.deepToString(array));

        System.out.println("Матрица: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");  // Выводим каждую строку
            }
            System.out.println();
        }

        System.out.println("Произведения строк: ");

        int[] modules = new int[array.length]; //отдельный массив с модулями произведений

        int count = 1;
        for (int i = 0; i < array.length; i++) { //подсчет модуля каждой строки
            for (int j = 0; j < array[i].length; j++) {
                count = array[i][j]*count;
            }
            System.out.print(i + " - " + count); //вывод модуля для каждой строки
            System.out.println();

            if (count < 0) { // если произведение отрицательное - меняем знак
                count = count*-1;
            }

            modules[i] = count;

            count = 1;
        }

        System.out.println("Модули произведения строк: ");
        System.out.println(Arrays.toString(modules));

        int maxAt = 0;
        for (int i = 0; i < modules.length; i++) {
            maxAt = modules[i] > modules[maxAt] ? i : maxAt;
        }

        System.out.println("Строка с наибольшим произведение элементов имеет индекс - " + maxAt );

    }

    public static int generateRandomNumber() {
        Random random = new Random();

        int min = -5;
        int max = 5;

        int randomNumber;

        do {
            randomNumber = min + random.nextInt(max - min + 1);
        } while (randomNumber == 0);

        return randomNumber;
    }
}
