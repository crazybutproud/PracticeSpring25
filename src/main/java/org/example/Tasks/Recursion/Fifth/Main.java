package org.example.Tasks.Recursion.Fifth;

//Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки,
// или слово NO в противном случае.
//Операцией возведения в степень пользоваться нельзя!
public class Main {
    public static void main(String[] args) {
        double number = 1.0;
        if (recursion(number) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static int recursion(double number) {
        if (number == 1) { // Базовый случай 1: дошли до 1
            return 1; // Значит исходное число - степень двойки
        }
        else if (number > 1 && number < 2) { // Базовый случай 2: получили число между 1 и 2
            return 0; // Значит исходное число не степень двойки
        }
        else { // Рекурсивный случай
            return recursion(number / 2); // Делим число на 2 и продолжаем проверку
        }
    }
}
