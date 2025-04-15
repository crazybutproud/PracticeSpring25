package org.example.Tasks.ConditionalConstructions;

import java.util.Scanner;

//Измените предыдущую программу. Пусть пользователь кроме номера операции вводит два числа,
// и в зависимости от номера операции с введенными числами выполняются определенные действия
// (например, при вводе числа 3 числа умножаются).
// Результат операции выводиться на консоль.
public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число:");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число:");
        int num2 = scanner.nextInt();

        int result;

        System.out.println("Введите номер операции(от 1 до 3)" + "\n"
                + "1.Сложение" + "\n" + "2.Вычитание" + "\n" + "3.Умножение");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                result = num1 + num2;
                System.out.println("1 - Сложение. Ответ: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("2 - Вычитание. Ответ: " + result);
                break;
            case 3:
                result = num1*num2;
                System.out.println("3 - Умножение. Ответ: " + result);
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }
}
