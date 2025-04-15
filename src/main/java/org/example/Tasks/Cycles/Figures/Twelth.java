package org.example.Tasks.Cycles.Figures;

import java.util.Scanner;

//Паскаль: Нарисовать треугольник Паскаля, где числа в треугольнике вычисляются по определенному правилу.
public class Twelth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа строк в треугольнике Паскаля
        System.out.print("Введите количество строк для треугольника Паскаля: ");
        int rows = scanner.nextInt();

        // Массив для хранения значений треугольника
        int[][] triangle = new int[rows][];

        // Строим треугольник
        for (int i = 0; i < rows; i++) {
            // Инициализируем i-ую строку
            triangle[i] = new int[i + 1];

            // Первая и последняя ячейки каждой строки всегда равны 1
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            // Заполняем остальные элементы строки
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Выводим треугольник Паскаля
        System.out.println("Треугольник Паскаля:");
        for (int i = 0; i < rows; i++) {
            // Выводим пробелы для выравнивания
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Выводим элементы текущей строки
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}

