package org.example.Tasks.Arrays;

import java.util.Arrays;

//Реализуйте алгоритм сортировки пузырьком для сортировки массива
public class Second {
    public static void main(String[] args) {
        int n = 10;
        double[] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random()*10;
        }
        System.out.println(Arrays.toString(numbers));

        int length = numbers.length; //длина массива

        for (int i = 0; i < length; i++) {
            //Внешний цикл. выполняет несколько проходов по массиву.
            // Количество проходов равно длине массива (или списка),
            // потому что за каждый проход последний элемент на своем месте,
            // и на следующий проход он уже не участвует в сортировке
            for (int j = 0; j < length - i - 1; j++) {
                //проходит по массиву и выполняет сравнение соседних элементов.
                //Внутренний цикл уменьшается с каждым проходом внешнего цикла.
                // На каждом следующем проходе элементы, которые уже отсортированы,
                // не будут участвовать в сравнении, так как они "всплыли" на нужную позицию.
                if (numbers[j] > numbers[j + 1]) { // Сравнение соседних элементов
                    double temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
