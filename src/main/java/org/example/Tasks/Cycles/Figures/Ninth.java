package org.example.Tasks.Cycles.Figures;

import java.util.Scanner;

//Прямоугольник с границей:
// Нарисовать прямоугольник, где границы будут заполнены символами, а внутри пусто.
public class Ninth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите желаемый размер первой стороны прямоугольника: ");
        int sizeA = scanner.nextInt();
        System.out.print("Введите желаемый размер второй стороны прямоугольника: ");
        int sizeB = scanner.nextInt();

        for (int i = 0; i < sizeA; i++) {
            for (int j = 0; j < sizeB; j++) {
                if (i == 0 || i == sizeA - 1 || j == 0 || j == sizeB - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
