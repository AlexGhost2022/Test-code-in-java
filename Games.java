package com.company;

import java.util.Random;
import java.util.Scanner;

public class Games {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        int randomInt = new Random().nextInt(10); // Генерирует новое число от 0 до 1000

        int userInput = -1;
        System.out.println("Я загадал число от 0 до 10.");
        System.out.println("Ваш ход:");

        while (userInput != randomInt) {

            userInput = scanner.nextInt(); // В этой переменной будем сохранять ввод пользователя

            if (userInput > randomInt) {
                System.out.println("Меньше");
            }
            if (userInput < randomInt) {
                System.out.println("Больше");
            }
        }
        System.out.println("Вы великолепны! Именно это я загадал.");
    }
    }










