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
        if (number == 1) {
            return 1;
        }
        else if (number > 1 && number < 2) {
            return 0;
        }
        else {
            return recursion(number / 2);
        }
    }
}
