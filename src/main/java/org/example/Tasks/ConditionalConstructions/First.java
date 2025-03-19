package org.example.Tasks.ConditionalConstructions;

import java.util.Scanner;

//Напишите консольную программу, в которой пользователь с клавиатуры вводит два числа.
// А программа сранивает два введенных числа и выводит на консоль результат
// сравнения (два числа равны, первое число больше второго или первое число меньше второго).
public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        String result;
        if (num1 > num2) {
                result = "Первое число больше второго";
            } else if (num1 < num2) {
                result = "Второе число больше первого";
            } else if (num1 == num2) {
                result = "Числа равны";
            } else {
                result = "Неизвестно";
            }
        System.out.println(result);
        in.close();
    }
}