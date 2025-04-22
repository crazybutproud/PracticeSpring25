package org.example.Tasks.Recursion.Third;

//Даны два целых числа A и В (каждое в отдельной строке).
// Выведите все числа от A до B включительно, в порядке возрастания,
// если A < B, или в порядке убывания в противном случае.
public class Main {
    public static void main(String[] args) {
        recursion(5,10);
    }

    public static void recursion(int a, int b) {
        if (a > b) {
            recursionFromBigToSmall(a, b);
        } else {
            recursionFromSmallToBig(a, b);
        }
    }

    public static int recursionFromSmallToBig(int a, int b) {
        if (a == b) {
            System.out.println(b);
            return b;
        }
        System.out.println(a);
        return recursionFromSmallToBig(a + 1, b);
    }

    public static int recursionFromBigToSmall(int a, int b) {
        if (b == a) {
            System.out.println(a);
            return a;
        }
        System.out.println(b);
        return recursionFromBigToSmall(a, b - 1);
    }
}
