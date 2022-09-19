package com.company;

import java.util.Scanner;

public class Rating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать, выберите действие");
        while (true){
            System.out.println("1-анекдот");
            System.out.println("0- выход");
            int command = scanner.nextInt();
            if(command==1){
                System.out.println("Сегодня нет анекдота");
                break;
            }if(command==0){
                System.out.println("Пока! Оцените приложение? Нажмите 1- если да и 2- если нет");
                int inputUser = scanner.nextInt();
                if(inputUser==1){
                    System.out.println("Оцените от 1 до 3");
                    int ratingUser = scanner.nextInt();
                    if(ratingUser==1){
                        System.out.println("Будем расти");
                        break;
                    }if (ratingUser==2){
                        System.out.println("Неплохо, спасибо");
                        break;
                    }if(ratingUser==3){
                        System.out.println("Супер");
                        break;
                    }
                }if(inputUser==2){
                    System.out.println("Ну и пошел на хуй");
                    break;
                }else{
                    System.out.println("Такой команды нет");
                }

            }
        }


    }
}
