package com.company;

import java.util.Scanner;

class RatingFinance {
    public static void main(String[] args) {
        double rateUSD = 78;
        double rateEUR = 80;
        double rateJPY = 0.78;
        char smile = '☺';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у Вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();
        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();


        while (true) {
            System.out.println("Что ВЫ хотите сделать?");
            System.out.println("1- Конвертировать валюту");
            System.out.println("2- Получить совет");
            System.out.println("0- Выход");
            int command = scanner.nextInt();

            if (command == 1) {

                System.out.println("В какую валюту хотите конвертировать? Список доступных валют: 1- USD, 2- EUR, 3- JPY");

                int currency = scanner.nextInt();
                if (currency == 1) {

                    System.out.println("Ваши сбережения в долларах " + moneyBeforeSalary / rateUSD);
                } else if (currency == 2) {
                    System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
                } else if (currency == 3) {
                    System.out.println("Ваши сбережения в иенах: " + moneyBeforeSalary / rateJPY);
                } else {
                    System.out.println("Валюта не поддерживается!");
                }

            } else if (command == 2) {
                if (moneyBeforeSalary < 3000) {
                    System.out.println("Поешьте дома. Экономьте и вы дотянете до зарплаты )");
                } else if (moneyBeforeSalary < 10000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Окей, пора в Макдак!");
                    } else {
                        System.out.println("Поешьте дома. Экономьте и вы дотянете до зарплаты )");
                    }
                } else if (moneyBeforeSalary < 30000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Неплохо! Прикупите валюту и сходите в приличное место");
                    } else {
                        System.out.println("Окей, пора в Макдак!");
                    }
                } else {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Заказывай крабов " + smile);
                    } else {
                        System.out.println("Неплохо! Прикупите валюту и сходите в приличное место");
                    }
                }
            } else if (command == 0) {
                System.out.println("Хотите оценить приложение? 1 - Да или 2 - Нет");
                int userInput = scanner.nextInt();
                if (userInput == 1) {
                    System.out.println("Оцените работу приложения от 1 до 3");
                    int userRatingInput = scanner.nextInt();
                    if (userRatingInput == 1) {
                        System.out.println("Будет стараться!!!");
                        break;
                    } else if (userRatingInput == 2) {
                        System.out.println("Отлично! Есть куда расти...");
                        break;
                    } else if (userRatingInput == 3) {
                        System.out.println("Супер) Спасибо!!");
                        break;
                    } else {
                        System.out.println("Нет)) Оценка должна быть от 1 до 3");
                    }
                } else if(userInput==2){
                    System.out.println("Пока!!!");
                    break;
                }}else {
                    System.out.println("Такой команды пока что нет!");
                }
            }
        }
    }







