package org.example.Tasks.Recursion.First;
//база с нахождением факториала
public class Main {
    public static void main(String[] args) {
        System.out.println(recursion(5));;
    }

    public static int recursion(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * recursion(n - 1);
        }
    }
}
