package com.company;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        System.out.println("Робот помощник v2.0");
        sayHello();
        welcomeUserByName();
       sayHelloByTime();
       printSuccess();

    }public static void welcomeUserByName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?)");
        String name = scanner.next();
        printCity();
        String city = scanner.next();
        System.out.println("Рад познакомится " + name + " из " + city + "!");

    }public static void sayHello(){
        System.out.println("Привет!");
    }public static void printCity(){
        System.out.println("Из какого вы города?");
    }public static void printSuccess(){
        System.out.println("У вас неплохо получается программировать!");
    }public static void sayHelloByTime(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Который час?");
        int currentHour = scanner.nextInt();
        if(currentHour < 6){
            System.out.println("Доброй ночи!");
        }else if(currentHour >=22){
            System.out.println("Доброй ночи!");
        }else if(currentHour < 12){
            System.out.println("Доброе утро!");
        }else if(currentHour < 18){
            System.out.println("Добрый день"); // Добавлен коммент
        }else {
            System.out.println("Добрый вечер!");
        }
    }

}
