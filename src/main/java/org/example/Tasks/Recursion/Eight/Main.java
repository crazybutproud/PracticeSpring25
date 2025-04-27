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
        if (number < 10) {
//            System.out.print(number);
            return number;
        } else {
            System.out.print(number % 10 + " ");
            return recursion(number / 10);
        }
    }
}

