package org.example.Tasks.Cycles;

// В стране XYZ население равно 10 миллионов человек.
// Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
// Каждый год рождается и умирает на 1 человек, меньше чем в предыдущий год.
// Рассчитайте, какая численность населения будет через 10 лет, учитывая,
// что рождаемость не может быть меньше 7 человек на 1000 человек, а смертностность не может быть меньше 6 человек на 1000 человек.
public class Second {
    public static void main(String[] args) {

        int people_now = 10_000_000; // кол-во людей
        int birth_per_year = 14;
        int death_per_year = 8;
        int new_growth_rate; // число для умножения кол-ва показателей прироста населения
        int time = 10; // время в годах
        int min_birth = 7;
        int min_death = 6;

        for (int i = 1; i <= time; i++) { //каждый год кол-во людей менялось, от этого менялся new_growth_rate
            new_growth_rate = birth_per_year - death_per_year;
            int growth_per_year = people_now * new_growth_rate / 1000;
            people_now += growth_per_year;
            if (birth_per_year > min_birth) {
                birth_per_year -= 1;
            }
            if (death_per_year > min_death) {
                death_per_year -= 1;
            }
        }


        System.out.println(people_now);
    }
}