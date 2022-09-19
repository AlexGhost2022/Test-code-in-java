package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

       /* Scanner scanner = new Scanner(System.in);

        int randomInt = new Random().nextInt(10);

        int userInput = -1;
        char smile = '☺';
        System.out.println("Я загадал число от 0 до 10");
        System.out.println("Ваш ход: ");

        while (userInput != randomInt){

            userInput = scanner.nextInt();

            if(userInput > randomInt){
                System.out.println("Меньше");
            }
            if(userInput < randomInt){
                System.out.println("Больше");
            }

        }
        System.out.println("Вы великолепны! Именно это я и загадал " + smile);*/
        String[] currencies = {"USD", "EUR", "JPY", "RUB"}; // Массив
// Цикл начинается с 0 и продолжается c шагом в единицу, пока i строго меньше длины массива
        for (int i = 0; i <= (currencies.length - 1); i++) {
// Переменная итерирования ставится на место индекса, так все элементы будут напечатаны
            System.out.println("Поддерживаемая валюта: " + currencies[i]);
        }






    }

}
