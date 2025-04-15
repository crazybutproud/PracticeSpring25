package org.example.Tasks.Cycles;
//В стране XYZ население равно 10 миллионов человек.
// Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
// Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание, что показатели рождаемости и смертности постоянны.
public class First {
    public static void main(String[] args) {
        int people_now = 10_000_000; // кол-во людей
        int birth_per_year = 14;
        int death_per_year = 8;
        int new_growth_rate = (birth_per_year - death_per_year); // число для умножения кол-ва показателей прироста населения
        int time = 10; // время в годах
        int growth_per_year;

        for (int i = 1; i <= time; i++) { //каждый год кол-во людей менялось, от этого менялся new_growth_rate
            growth_per_year = people_now*new_growth_rate / 1000;
            people_now += growth_per_year;
        }

        System.out.println(new_growth_rate);
        System.out.println(people_now);

    }
}
