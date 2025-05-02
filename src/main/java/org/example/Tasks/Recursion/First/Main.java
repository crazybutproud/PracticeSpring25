package org.example.Tasks.Recursion.First;
//база с нахождением факториала
public class Main {
    public static void main(String[] args) {
        System.out.println(recursion(5));;
    }

    public static int recursion(int n) {
        // Базовый случай: если n равно 0 или 1, возвращаем 1
        if (n == 1 || n == 0) {
            return 1;
        } else {
            // Рекурсивный случай: n! = n * (n-1)!
            return n * recursion(n - 1);
        }
    }
}
