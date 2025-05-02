package org.example.Tasks.Recursion.Seventh;

//Дано натуральное число N.
// Выведите все его цифры по одной, в обычном порядке, разделяя их пробелами или новыми строками.
//При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
// Разрешена только рекурсия и целочисленная арифметика.
public class Main {
    public static void main(String[] args) {
        System.out.println(recursion(123));
    }

    public static String recursion(int number) {
        if (number < 10) { // Базовый случай: если число однозначное
            return Integer.toString(number); // Возвращаем цифру как строку
        } else { // Рекурсивный случай
            return recursion(number / 10) + " " + number % 10;  // Комбинируем цифры
        }
    }
}
