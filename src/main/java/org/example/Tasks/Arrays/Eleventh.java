package org.example.Tasks.Arrays;

import java.util.Arrays;
import java.util.Random;

//Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать
// каждый урок с того, чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек,
// а примеры среди них не должны повторяться. В помощь учителю напишите программу, которая будет выводить
// на экран 15 случайных примеров из таблицы умножения
// (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты).
// При этом среди 15 примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).
public class Eleventh {
    public static void main(String[] args) {

        int x = 15; //строки
        int y = 2; //столбцы
        int[][] array = new int[x][y];


        //заполняем массив
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = generateRandomNumber();
            }
        }

        int count = 1;
        int[] product = new int[array.length];

        for (int i = 0; i < array.length; i++) { //подсчет произведения каждой строки
            for (int j = 0; j < array[i].length; j++) {
                count = array[i][j]*count;
            }

            product[i] = count;
            count = 1;


        }

//        System.out.println(Arrays.toString(product));

        System.out.println("Решите примеры: ");
        for (int i = 0; i < array.length; i++) { //внешний цикл для каждой строки
            for (int j = 0; j < array[i].length; j++) {
                if (j == array[i].length - 1) { //если число последнее в столбце, выводим равно
                    System.out.print(array[i][j] + " = ");
                } else { //если число не последнее, то выводим знак умножения
                    System.out.print(array[i][j] + " * ");
                }
            }
            System.out.println(); //переход на следующую строку
        }
    }


    public static int generateRandomNumber() {
        Random random = new Random();

        int min = 2;
        int max = 9;

        int randomNumber;


        randomNumber = min + random.nextInt(max - min + 1);


        return randomNumber;
    }

    public static void replacementOfDuplicate(int index, int[][] array) {
        
    }
}
