package org.example.Tasks.Recursion.Eleven;
//Найдите корень уравнения
//$cos(x^5) + x^4 - 345.3 * x - 23 = 0$
//
//на отрезке [0; 10] с точностью по x не хуже, чем 0.001. Известно, что на этом промежутке корень единственный.
//Используйте для этого метод деления отрезка пополам (и рекурсию).

//Метод основан на теореме о промежуточном значении: если непрерывная функция меняет знак на концах отрезка, то внутри отрезка есть корень.
public class Main {
    public static void main(String[] args) {
        System.out.println(solve(0, 10));
    }

    public static double func(double x) { //Эта функция просто вычисляет значение уравнения для заданного x.
        // Это наша целевая функция, корень которой мы ищем.
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }

    // решить уравнение
    public static double solve(double start, double end) {
        // Базовый случай рекурсии - достигнута требуемая точность
        if (end - start <= 0.001) {
            return start;
        }
        // Находим середину отрезка
        double x = start + (end - start) / 2;
        // Проверяем, в какой половине находится корень
        if (func(start) * func(x) > 0) {
            // Корень в правой половине
            return solve(x, end);
        } else {
            // Корень в левой половине
            return solve(start, x);
        }
    }
}
