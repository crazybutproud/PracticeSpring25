package org.example.Tasks.OOP.Fifth;

public class Recursion {
    private int a;
    private int b;

    public Recursion(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void getAllNumbers() {
        if (a < b) { //вывод в порядке возрастания
            printAscending(a, b);
        } else { //в порядке убывания
            printDescending(a, b);
        }
    }

    // Рекурсивный метод для вывода чисел в порядке возрастания
    private void printAscending(int a, int b) {
        if (a > b) return; // Условие завершения рекурсии
        System.out.println(a); // Выводим текущее значение
        printAscending(a + 1, b); // Рекурсивный вызов с увеличением a
    }

    private void printDescending(int a, int b) {
        if (a < b) return; // Условие завершения рекурсии
        System.out.println(a); // Выводим текущее значение
        printDescending(a - 1, b); // Рекурсивный вызов с уменьшением a
    }

}
