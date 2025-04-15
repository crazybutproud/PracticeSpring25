package org.example.Tasks.Arrays;

import java.util.*;

//Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
// Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
// Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
public class Eighth {
    public static void main(String[] args) {
        int n = 11;
        int[] numbers = new int[n];

        Random random = new Random();
        int min = -1;
        int max = 1;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = min + random.nextInt(max - min + 1);
        }

        System.out.println("Массив: " + Arrays.toString(numbers));

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                int count = map.get(numbers[i]).intValue() + 1;
                map.put(numbers[i], count);
            } else {
                map.put(numbers[i], 1);
            }
        }
        //        map.forEach((key, value) -> System.out.println(key + " " + value));

        // Поиск максимальной частоты
        int maxCount = Collections.max(map.values());

        // Подсчет, сколько элементов имеют максимальную частоту
        long countMaxFrequency = map.values().stream().filter(val -> val == maxCount).count();

        // Если два или более элемента встречаются с максимальной частотой, ничего не выводим
        if (countMaxFrequency == 1) {
            // Найдем элемент, который встречается чаще всего
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == maxCount) {
                    System.out.println("Элемент, который встречается чаще всего: " + entry.getKey() + " .Встречается " + maxCount + " раз.");
                    break;
                }
            }
        } else {
            System.out.println("Два или более элемента имеют одинаковую максимальную частоту.");
        }
    }
}
