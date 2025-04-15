package org.example.Tasks.OOP.Sixth;

import java.util.Scanner;

public class Vector {
    private double x;
    private double y;
    private double z;

    //конструктор с параметрами в виде списка координат x, y, z
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //метод для данных второго вектора
    public double secondVectorX() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координаты по Х для второго вектора: ");
        double x2 = scanner.nextDouble();
//
//        scanner.close();

        return x2;
    }

    public double secondVectorY() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координаты по Y для второго вектора: ");
        double y2 = scanner.nextDouble();

//        scanner.close();

        return y2;
    }

    public double secondVectorZ() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координаты по Z для второго вектора: ");
        double z2 = scanner.nextDouble();
//
//        scanner.close();

        return z2;
    }

    //метод, вычисляющий длину вектора
    public double vectorLength() {
        double length;
        length = Math.sqrt(x * x + y * y + z * z);

//        System.out.println("Длина вектора - " + length);
        return length;
    }

    public double vectorLength(double x, double y, double z) {
        double length;
        length = Math.sqrt(x * x + y * y + z * z);

//        System.out.println("Длина вектора - " + length);
        return length;
    }

    //метод, вычисляющий скалярное произведение
    public double scalarProduct() {
        double scalarProduct;

        double x2 = secondVectorX();
        double y2 = secondVectorY();
        double z2 = secondVectorZ();

        scalarProduct = x * x2 + y * y2 + z * z2;


//        System.out.println("Скалярное произведение векторов равно - " + scalarProduct);

        return scalarProduct;
    }

    public double scalarProduct(double x2,double y2,double z2) {
        double scalarProduct;
//
//        double x2 = secondVectorX();
//        double y2 = secondVectorY();
//        double z2 = secondVectorZ();

        scalarProduct = x * x2 + y * y2 + z * z2;


//        System.out.println("Скалярное произведение векторов равно - " + scalarProduct);

        return scalarProduct;
    }

    //метод, вычисляющий векторное произведение с другим вектором
    public Vector vectorProduct() {
        String vectorProduct;

        double x2 = secondVectorX();
        double y2 = secondVectorY();
        double z2 = secondVectorZ();

        double x3 = y * z2 - z * y2;
        double y3 = z * x2 - x * z2;
        double z3 = x * y2 - y * x2;

        vectorProduct = "( " + x3 + "," + y3 + "," + z3 + " )";

        System.out.println("Скалярное произведение векторов равно - " + vectorProduct);

        return new Vector(x3, y3, z3);
    }

    //метод, вычисляющий угол между векторами (или косинус угла)
    public double angleBetweenVectors() {
        double angleBetweenVectors;

        double x2 = secondVectorX();
        double y2 = secondVectorY();
        double z2 = secondVectorZ();

        double scalarProduct = scalarProduct(x2,y2,z2);
        double mainVectorLength = vectorLength();
        double secondVectorLength = vectorLength(x2,y2,z2);

        angleBetweenVectors = scalarProduct / mainVectorLength * secondVectorLength;

        System.out.println("Угол между векторами - " + angleBetweenVectors);
        return angleBetweenVectors;
    }

    //методы для суммы и разности:
    public void sumAndDiff() {
        String sum;
        String diff;

        double x2 = secondVectorX();
        double y2 = secondVectorY();
        double z2 = secondVectorZ();

        double x3sum = x + x2;
        double y3sum = y + y2;
        double z3sum = z + z2;

        sum = "( " + x3sum + "," + y3sum + "," + z3sum + " )";

        double x3diff = x - x2;
        double y3diff = y - y2;
        double z3diff = z - z2;

        diff = "( " + x3diff + "," + y3diff + "," + z3diff + " )";

        System.out.println("Сумма - " + sum);
        System.out.println("Разность - " + diff);
    }

    //статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N
    public static Vector[] generate(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
