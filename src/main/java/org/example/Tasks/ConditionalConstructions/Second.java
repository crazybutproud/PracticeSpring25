package org.example.Tasks.ConditionalConstructions;

import java.util.Scanner;

//В банке в зависимости от суммы вклада начисляемый процент по вкладу может отличаться.
// Напишите консольную программу, в которую пользователь вводит сумму вклада.
// Если сумма вклада меньше 100, то начисляется 5%. Если сумма вклада от 100 до 200, то начисляется 7%.
// Если сумма вклада больше 200, то начисляется 10%.
// В конце программа должна выводить сумму вклада с начисленными процентами.
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму вклада - ");
        int number = scanner.nextInt();
        double per;
        if (number < 100) {
            per = 0.05;
        } else if (number >= 100 && number <= 200) {
            per = 0.07;
        } else {
            per = 0.1;
        }
        int sum = (int) (number + per*number);

        System.out.println("Cумма вклада составляет: " + number + ". Проценты - " + per + ". Общая сумма - " + sum);
    }
}
