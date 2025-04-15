package org.example.Tasks.Cycles.Figures;

import java.util.Scanner;

// Пирамида: Нарисовать пирамиду, где на каждой строке количество символов увеличивается от 1 до N.
public class Tenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину основания пирамиды: ");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ( i >= j ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
