package org.example.Tasks.Recursion.Third;

//Даны два целых числа A и В (каждое в отдельной строке).
// Выведите все числа от A до B включительно, в порядке возрастания,
// если A < B, или в порядке убывания в противном случае.
public class Main {
    public static void main(String[] args) {
        recursion(5,10);
    }

    //основной метод, определяющий направление вывода
    public static void recursion(int a, int b) {
        if (a > b) {
            recursionFromBigToSmall(a, b);
        } else {
            recursionFromSmallToBig(a, b);
        }
    }

    //рекурсивно выводит числа по возрастанию
    public static int recursionFromSmallToBig(int a, int b) {
        if (a == b) { // Базовый случай: числа сравнялись
            System.out.println(b); // Выводим последнее число
            return b; // Возвращаем его же
        }
        System.out.println(a);  // Выводим текущее число
        return recursionFromSmallToBig(a + 1, b); // Рекурсивный вызов для следующего числа
    }

    //рекурсивно выводит числа по убыванию
    public static int recursionFromBigToSmall(int a, int b) {
        if (b == a) { // Базовый случай: числа сравнялись
            System.out.println(a); // Выводим последнее число
            return a; // Возвращаем его же
        }
        System.out.println(b); // Выводим текущее число
        return recursionFromBigToSmall(a, b - 1); // Рекурсивный вызов для предыдущего числа
    }
}
