package org.example.Tasks.Recursion.Sixth;

//Дано натуральное число N. Вычислите сумму его цифр.
//При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
public class Main {
    public static void main(String[] args) {
        System.out.println(recursion(192));
    }

    public static int recursion(int number) {
        if (number < 10) { // Базовый случай: если число однозначное
            return number; // Возвращаем само число (оно и есть его единственная цифра)
        } else { // Рекурсивный случай
            return number % 10 + recursion(number / 10); // Сумма последней цифры и суммы цифр оставшегося числа
        }
    }
}
