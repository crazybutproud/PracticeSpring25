package org.example.Tasks.Recursion.Seventh;

//Дано натуральное число N.
// Выведите все его цифры по одной, в обычном порядке, разделяя их пробелами или новыми строками.
//При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
// Разрешена только рекурсия и целочисленная арифметика.
public class Main {
    public static void main(String[] args) {
        recursion(123);
    }

    public static void recursion(int number) {
        if (number < 10) {
            System.out.print(number);
        } else {
            recursion(number / 10);
            System.out.print(" " + number % 10);
        }
    }
}
