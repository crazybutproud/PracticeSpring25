package org.example.Tasks.Recursion.Second;
//Дано натуральное число n. Выведите все числа от 1 до n.
public class Main {
    public static void main(String[] args) {
        System.out.println(recursion(10));
    }

    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        } else {
            return recursion(n - 1) + " " + n;
        }
    }
}
