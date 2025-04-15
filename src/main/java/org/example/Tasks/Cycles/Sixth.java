package org.example.Tasks.Cycles;

import java.util.Scanner;

//В цикле программа просит у пользователя ввести два числа и выводит результат их умножения.
//
//После вывода результата умножения программа спрашивает, надо ли завершить выполнение.
// И если пользователь введет число 1, то программа завершает цикл.
// Если введено любое другое число, то программа продолжает спрашивать у пользователя два числа и умножать их.
public class Sixth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int another_cycle = 0;
        do {
            System.out.print("Введите первое число для умножения: ");
            int first = scanner.nextInt();
            System.out.print("Введите второе число для умножения: ");
            int second = scanner.nextInt();
            System.out.println("Результат умножения - " + first * second);
            System.out.print("Для выхода введите 1: ");
            another_cycle = scanner.nextInt();
        } while (another_cycle != 1);
    }
}
