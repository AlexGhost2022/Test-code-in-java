package com.company;

import java.util.Scanner;

class Ticket1 {
     public static void main(String[] args) {
         double rateUSD = 78;
         double rateEUR = 80;
         double rateJPY = 0.78;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Сколько денег у Вас осталось до зараплаты?");
         double moneyBeforeSalary = scanner.nextDouble();
         System.out.println("Сколько дней до зарплаты?");
         int daysBeforeSalary = scanner.nextInt();


         while (true){
             System.out.println("Что ВЫ хотите сделать?");
             System.out.println("1- Конвертировать валюту");
             System.out.println("2- Получить совет");
             System.out.println("0- Выход");
             int command = scanner.nextInt();

             if(command==1){

                 System.out.println("В какую валюту хотите конвертировать? Список доступных валют: 1- USD, 2- EUR, 3- JPY");

                 int currency = scanner.nextInt();
                 if(currency==1){

                     System.out.println("Ваши сбережения в долларах " + moneyBeforeSalary/rateUSD);
                 } else if(currency==2){
                     System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary/rateEUR);
                 } else if(currency==3){
                     System.out.println("Ваши сбережения в иенах: "+ moneyBeforeSalary/rateJPY);
                 }else {
                     System.out.println("Валюта не поддерживается!");
                 }

             }else if(command==2){
                 if(moneyBeforeSalary < 3000){
                     System.out.println("Поешьте дома. Экономьте и вы дотянете до зарплаты )");
                 }else if(moneyBeforeSalary < 10000){
                     if(daysBeforeSalary < 10){
                         System.out.println("Окей, пора в Макдак!");
                     }else {
                         System.out.println("Поешьте дома. Экономьте и вы дотянете до зарплаты )");
                     }
                 }else if(moneyBeforeSalary < 30000){
                     if(daysBeforeSalary < 10){
                         System.out.println("Неплохо! Прикупите валюту и сходите в приличное место");
                     }else {
                         System.out.println("Окей, пора в Макдак!");
                     }
                 }else {
                     if(daysBeforeSalary < 10){
                         System.out.println("Заказывай крабов!");
                     }else {
                         System.out.println("Неплохо! Прикупите валюту и сходите в приличное место");
                     }
                 }}else if(command==0){
                     System.out.println("Пока!");
                     break;
                 }else {
                 System.out.println("Извините такой команды нет!");
             }




         }










     }
}
