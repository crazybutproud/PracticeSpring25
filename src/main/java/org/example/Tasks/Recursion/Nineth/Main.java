package org.example.Tasks.Recursion.Nineth;
//Дано слово, состоящее только из строчных латинских букв.
// Проверьте, является ли это слово палиндромом. Выведите YES или NO.
//При решении этой задачи нельзя пользоваться циклами
public class Main {
    public static void main(String[] args) {
        if (recursion("aa")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean recursion(String l) {
        String first;
        String last;

        int size = l.length();
        String subString;
        if (size <= 1) {
            return true;
        } else {
            first = String.valueOf(l.toCharArray()[0]);
            last = String.valueOf(l.toCharArray()[size - 1]);

            subString = l.substring(1, size - 1);
            return first == last && recursion(subString);
        }
    }
}
