package org.example.Tasks.Recursion.Second;
//Дано натуральное число n. Выведите все числа от 1 до n.
public class Main {
    public static void main(String[] args) {
        System.out.println(recursion(10));

        System.out.println(recursionB(10));
    }

    public static String recursion(int n) {
        // Базовый случай: если n равно 1, возвращаем "1"
        if (n == 1) {
            return "1";
        } else {
            // Рекурсивный случай: соединяем результат для (n-1) с текущим n
            return recursion(n - 1) + " " + n;
        }
    }
    //Эту же задачу можно решить с рекурсией,
    // где действие выполняется до рекурсивного вызова (тогда числа выведутся в обратном порядке):
    public static String recursionB(int n) {
        if (n == 1) {
            return "1";
        } else {
            return n + " " + recursionB(n - 1);  // Обратный порядок
        }
    }
}
