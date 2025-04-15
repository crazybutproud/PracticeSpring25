package org.example.Tasks.Cycles;

import java.util.Scanner;

//Перепишите предыдущую программу, только вместо цикла for используйте цикл while.
public class Fourth {
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

        int i = 1;
        while (i <= month) {
            result_sum = sum * percent + sum;
            sum = result_sum;
            i++;
        }

        scanner.close();
        System.out.println("После " + month + " месяцев сумма вклада составит " + result_sum);
    }
}
