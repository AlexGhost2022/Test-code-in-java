package MyTest;

import java.util.Random;
import java.util.Scanner;

public class SavingManager {


    SavingManager() {
        int dayCount = -1; // Для учёта дней накоплений
        int moneyTotal = 0; // Суммарное количество накоплений
        //int moneyToday; // Сколько откладываем сегодня
        //int goal ; // Финансовая цель

        int goal;
        //System.out.println("Сколько откладываем сегодня?");
        int moneyToday;
    }

    double saving(int goal, int moneyToday) {
        int dayCount = -1; // Для учёта дней накоплений
        int moneyTotal = 0; // Суммарное количество накоплений
        while (moneyTotal <= goal) {
            // moneyToday = random.nextInt(300); // Случайная сумма на сегодня

            moneyTotal = moneyTotal + moneyToday; // Добавили эти деньги в копилку
            dayCount = dayCount + 1; // Засчитали день
        }

        System.out.println("Ура! Вы сможете накопить " + goal + " за " + dayCount + " дней.");
        return goal;
    }
}








