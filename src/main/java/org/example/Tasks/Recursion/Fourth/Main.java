package org.example.Tasks.Recursion.Fourth;
//Функция Аккермана
//В теории вычислимости важную роль играет функция Аккермана A(m,n)
//Даны два целых неотрицательных числа m и n, каждое в отдельной строке. Выведите A(m,n).
public class Main {
    public static void main(String[] args) {
        System.out.println(recursionA(3,6));
    }

    public static int recursionA(int m, int n) {
        if (m == 0) {
            return recursionA(0,n+1);
        }
        if (m > 0 && n == 0 ) {
            return recursionA(m - 1, 0);
        }
        if (m > 0 && n > 0 ) {
            return recursionA(m - 1, recursionA(m, n-1));
        }
        return 0;
    }
}
