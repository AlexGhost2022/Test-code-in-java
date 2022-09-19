package com.company;

import java.util.Random;
import java.util.Scanner;

class Space {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код возврата");
        int secretCode = 2022;
        int pilotInput;
        while (true) {
            pilotInput = scanner.nextInt();
            System.out.println("Ракета на орбите");


            if (secretCode == pilotInput) {
                System.out.println("Летим домой, молодец");
                break;
            }
        }
    }
}





