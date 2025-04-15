package org.example.Tasks.ConditionalConstructions;
// Напишите консольную программу, которая выводит пользователю сообщение
// "Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение".
// Рядом с названием каждой операции указан ее номер, например, операция вычитания имеет номер 2.
// Пусть пользователь вводит в программе номер операции, и в зависимости от этого номера программа выводит название операции.
//
//Для определения операции по введенному номеру используйте конструкцию switch...case.
//
//Если введенное пользователем число не соответствует никакой операции (например, число 120),
// то выведите пользователю сообщение о том, что операция неопределена.

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер операции(от 1 до 3)" + "\n"
                + "1.Сложение" + "\n" + "2.Вычитание" + "\n" + "3.Умножение");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("1 - Сложение");
                break;
            case 2:
                System.out.println("2 - Вычитание");
                break;
            case 3:
                System.out.println("3 - Умножение");
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }
}
