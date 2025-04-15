package org.example.Tasks.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

//Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
// отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
// Перед созданием массива подумайте, какого он будет размера.
public class Fifth {
    public static void main(String[] args) {

        int min = 2;
        int max = 20;
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = min; i <= max ; i++) {
            if (i % 2 == 0) {
                nums.add(i);
            }
        }

        int[] numbers = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            numbers[i] = nums.get(i);
        }

//        System.out.println(Arrays.toString(numbers));
        System.out.println(" Массив строкой: ");
        for (int num: numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\n Массив столбцом: ");
        for (int num: numbers) {
            System.out.print(num + "\n");
        }
    }
}
