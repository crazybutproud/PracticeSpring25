package org.example.Tasks.Recursion.Fourth;
//Функция Аккермана
//В теории вычислимости важную роль играет функция Аккермана A(m,n)
//Даны два целых неотрицательных числа m и n, каждое в отдельной строке. Выведите A(m,n)
public class Main {
    public static void main(String[] args) {
        System.out.println(recursionA(2,6));
    }

    public static int recursionA(int m, int n) {
        if (m == 0) { // Базовый случай 1: если m = 0
            return n+1;
        }
        if (m > 0 && n == 0 ) {  // Базовый случай 2: если m > 0 и n = 0
            return recursionA(m - 1, 1);
        }
        if (m > 0 && n > 0 ) { // Рекурсивный случай: если m > 0 и n > 0
            return recursionA(m - 1, recursionA(m, n-1));
        }
        return 0; // Этот return никогда не выполнится для неотрицательных m и n
    }
}
