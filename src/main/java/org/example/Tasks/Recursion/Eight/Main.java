package org.example.Tasks.Recursion.Eight;
//Дано натуральное число N.
// Выведите все его цифры по одной, в обратном порядке, разделяя их пробелами или новыми строками.
//При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
// Разрешена только рекурсия и целочисленная арифметика.
public class Main {
    public static void main(String[] args) {
        System.out.println(recursion(12356));
    }

    public static int recursion(int number) {
        if (number < 10) { // Базовый случай: если число однозначное
//            System.out.print(number);
            return number; // Возвращаем последнюю цифру
        } else { // Рекурсивный случай
            System.out.print(number % 10 + " "); // Выводим последнюю цифру и пробел
            return recursion(number / 10); // Рекурсивно обрабатываем оставшуюся часть
        }
    }
}

