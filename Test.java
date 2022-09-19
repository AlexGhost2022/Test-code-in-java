package com.company;

import java.util.Random;
import java.util.Scanner;

 class Test {
    public static void main(String[] args) {
       //Scanner scanner = new Scanner(System.in);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Оцените работу приложения Зеленоглазое-Такси по шкале от 1 до 3");

        while (true) { // Запускаем бесконечный цикл
            int x = scanner.nextInt(); // Получаем оценку от пользователя

            if (x == 1) { //Если пользователь вводит 1
                System.out.println("Спасибо за вашу оценку. Мы станем лучше!"); // Благодарим
                break; // Выходим из цикла
            }
            if (x == 2) { // Если оценка равна 2
                System.out.println("Спасибо за вашу оценку. Есть куда расти!");
                break; // И выходим из цикла
            }
            if (x == 3) { // Если оценка равна 3
                System.out.println("Спасибо за высокую оценку! Рады, что вы выбрали нас!");
                break; // И выходим из цикла
            }
            // Пользователь ввёл не 1, 2 или 3 - повторяем просьбу
            System.out.println("Ваша оценка должна быть в диапазоне от 1 до 3");
        }
    }





      /*  char symvol = 37325;
        char symvol2= 21147;
        System.out.println(symvol + " " + symvol2);*/

      /*  char sumbol = 'Z';
        char smile = '☺';
        System.out.println((int)sumbol + " " + smile);*/
      /*  int days = 3;
        int run = 2;
        int carrot = 5;
        for (int i = 1; i <= days; i++) {
            System.out.println("День " + i);
        }
        for (int j = 1; j < +run; j++) {
            System.out.println("Пробежка " + j);
        }
        for (int k = 1; k <= carrot; k++) {
            System.out.println("Морковка " + k);
        }*/
       /* Scanner scanner = new Scanner(System.in);
        int dayCount = 0; // Для учёта дней накоплений
        int moneyTotal = 0; // Суммарное количество накоплений
        int moneyToday; // Сколько откладываем сегодня
        int goal = 5000; // Финансовая цель

        while (moneyTotal <= goal) {
            moneyToday = scanner.nextInt(); // Сумма, которую сегодня отложил пользователь
            moneyTotal = moneyTotal + moneyToday; // Добавили эти деньги в копилку
            dayCount = dayCount + 1; // Засчитали день
        }

        System.out.println("Ура! Вы смогли накопить " + goal + " за " + dayCount + " дней.");*/





    }


