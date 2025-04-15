package org.example.Tasks.Cycles.Figures;

import java.util.Scanner;

//Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок с ранее запрошенными сторонами
public class Seventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите желаемый размер стороны треугольника: ");
        int size = scanner.nextInt();

        for (int i = 1; i <= size ; i++) { //строки
            for (int j = 1; j <= i; j++) { //содержимое строк
                System.out.print("8");
            }
            System.out.println(); //переход на новую строку
        }
    }
}
