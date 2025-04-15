package org.example.Tasks.Cycles;
//Напишите программу, которая выводит на консоль таблицу умножения
public class Fifth {
    public static void main(String[] args) {
        int number = 10;
        for (int i = 1; i < number; i++) {
            for (int j = 1; j < number; j++) {
                int result = i*j;
                System.out.printf(result + "   ");
            }
            System.out.println();
        }
    }
}
