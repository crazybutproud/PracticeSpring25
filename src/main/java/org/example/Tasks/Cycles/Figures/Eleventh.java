package org.example.Tasks.Cycles.Figures;

import java.util.Scanner;

//Ромб: Нарисовать ромб с заданной шириной, заполнив его символами, и оставив внутри пустоту.
public class Eleventh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод ширины ромба (должна быть нечетной)
        System.out.print("Введите ширину ромба (нечетное число): ");
        int n = scanner.nextInt();

        // Проверка на нечетность
        if (n % 2 == 0) {
            System.out.println("Ширина ромба должна быть нечетным числом!");
            return;
        }

        // Рисуем верхнюю часть ромба
        for (int i = 1; i <= n; i += 2) {
            // Количество пробелов перед звездами
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // Печатаем первую звезду
            System.out.print("*");

            // Если в строке больше 1 звезды, печатаем промежуток между звездами
            if (i > 1) {
                for (int j = 0; j < i - 2; j++) {
                    System.out.print(" ");
                }
                // Печатаем вторую звезду
                System.out.print("*");
            }

            System.out.println();
        }

        // Рисуем нижнюю часть ромба
        for (int i = n - 2; i >= 1; i -= 2) {
            // Количество пробелов перед звездами
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // Печатаем первую звезду
            System.out.print("*");

            // Если в строке больше 1 звезды, печатаем промежуток между звездами
            if (i > 1) {
                for (int j = 0; j < i - 2; j++) {
                    System.out.print(" ");
                }
                // Печатаем вторую звезду
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
