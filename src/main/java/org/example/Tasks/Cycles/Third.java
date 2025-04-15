package org.example.Tasks.Cycles;

import java.util.Scanner;

//За каждый месяц банк начисляет к сумме вклада 7% от суммы.
// Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
// А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
//
//Для вычисления суммы с учетом процентов используйте цикл for.
// Пусть сумма вклада будет представлять тип float.
//
//Пример работы программы:
//
//Введите сумму вклада: 100
//Введите срок вклада в месяцах: 1
//После 1 месяцев сумма вклада составит 107,000000
public class Third {
    public static void main(String[] args) {
        float percent = 0.07F;
        float sum;
        int month;
        float result_sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        sum = scanner.nextFloat();
        System.out.print("Введите кол-во месяцев: ");
        month = scanner.nextInt();

        for (int i = 1; i <= month; i++) {
            result_sum = sum * percent + sum;
            sum = result_sum;
        }

        scanner.close();
        System.out.println("После " + month + " месяцев сумма вклада составит " + result_sum);
    }
}
