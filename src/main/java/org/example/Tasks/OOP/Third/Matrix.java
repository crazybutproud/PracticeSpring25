package org.example.Tasks.OOP.Third;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    private int[][] matrix;
    private int a;
    private int b;

    public Matrix(int a, int b) {
        this.a = a;
        this.b = b;
//        matrix = new int[a][b];
        matrix = getRandomMatrix(a,b);
    }

    public void additionWithMatrix() {
        System.out.println("Генерация второй случайной матрицы...");
        int [][] secondMatrix = getRandomMatrix(this.a,this.b);

        System.out.println("Вторая матрица - ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(secondMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Результат сложения двух матриц - ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(secondMatrix[i][j]+matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multiplicationOnNumber() {
        System.out.print("Введите число для умножения на матрицу - ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Результат умножения матрицы на число: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[i][j]*number + " ");
            }
            System.out.println();
        }
    }

    public void printMatrix() {
        System.out.println("Случайная матрица заданных размеров: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multiplicationOnMatrix() {
        System.out.println("Генерация второй случайной матрицы...");
        int [][] secondMatrix = getRandomMatrix(this.a,this.b);

        System.out.println("Вторая матрица - ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(secondMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Результат умножения двух матриц - ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(secondMatrix[i][j]*matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] getRandomMatrix(int a, int b) {
        int[][] randomMatrix = new int[a][b];
        int min = 1;
        int max = 10;
        Random random = new Random();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                randomMatrix[i][j] = min + random.nextInt(max - min + 1);
            }
        }

        return randomMatrix;
    }
}
