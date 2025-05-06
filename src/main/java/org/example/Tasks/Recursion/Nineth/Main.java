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


    //Проблемы в текущей реализации
    //Сравнение строк через == - в Java нужно использовать equals() для сравнения содержимого строк
    //
    //Избыточное преобразование в массив символов - можно получить символы проще
    //
    //Неэффективное создание подстрок - каждый рекурсивный вызов создает новые строки
    public static boolean recursion(String l) {
        String first;
        String last;

        int size = l.length();
        String subString;
        if (size <= 1) { // Базовый случай: слово из 0 или 1 символа
            return true;
        } else {
            // Получаем первую и последнюю буквы
            first = String.valueOf(l.toCharArray()[0]);
            last = String.valueOf(l.toCharArray()[size - 1]);

            // Получаем подстроку без первой и последней букв
            subString = l.substring(1, size - 1);
            // Проверяем совпадение букв и рекурсивно проверяем подстроку
            return first.equals(last) && recursion(subString);
        }
    }

    //Исправленная версия
    public static boolean recursionB(String word) {
        int length = word.length();
        if (length <= 1) {
            return true;
        }

        char first = word.charAt(0);
        char last = word.charAt(length - 1);

        return first == last && recursion(word.substring(1, length - 1));
    }
}
